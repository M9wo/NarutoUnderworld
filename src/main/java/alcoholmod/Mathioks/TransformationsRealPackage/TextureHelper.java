package alcoholmod.Mathioks.TransformationsRealPackage;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.AbstractTexture;
import net.minecraft.client.renderer.texture.ITextureObject;
import net.minecraft.client.renderer.texture.LayeredTexture;
import net.minecraft.client.renderer.texture.SimpleTexture;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.texture.TextureUtil;
import net.minecraft.client.resources.IResource;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class TextureHelper {
  private static final ResourceLocation TEXTURE_STEVE = new ResourceLocation("textures/entity/steve.png");
  
  private static final ResourceLocation TEXTURE_ALEX = new ResourceLocation("textures/entity/alex.png");
  
  private static final String TAG = "TextureHelper";
  
  private static final ResourceLocation playerOverlay = new ResourceLocation("tm:textures/entity/6paths.png");
  
  private static final ResourceLocation playerOverlaySlim = new ResourceLocation(":textures/entity/.png");
  
  private static final Map overlays = new HashMap<Object, Object>();
  
  public static void createVampireTexture(EntityLivingBase e, ResourceLocation old, ResourceLocation newLoc) {
    TextureManager manager = Minecraft.getMinecraft().getTextureManager();
    if (manager.getTexture(newLoc) == null) {
      ResourceLocation overlay;
      boolean slimPlayer = false;
      if (e instanceof EntityPlayer) {
        slimPlayer = true;
        overlay = playerOverlaySlim;
      } else {
        overlay = getOverlay(e.getClass());
      } 
      Object texture = null;
      try {
        if (overlay != null) {
          ITextureObject tex = manager.getTexture(old);
          if (tex instanceof LayeredTexture) {
            List<String> l = ((LayeredTexture)tex).layeredTextureNames;
            l.add(overlay.toString());
            texture = new LayeredTexture(toStringArraySafe(l));
          } else {
            texture = new VampireTexture(old, overlay, slimPlayer);
          } 
        } else {
          texture = new SimpleTexture(old);
        } 
      } catch (Exception var9) {
        texture = manager.getTexture(old);
      } 
      manager.loadTexture(newLoc, (ITextureObject)texture);
    } 
  }
  
  private static ResourceLocation getOverlay(Class clazz) {
    if (clazz.equals(EntityCreature.class))
      return null; 
    ResourceLocation loc = (ResourceLocation)overlays.get(clazz);
    return (loc == null) ? getOverlay(clazz.getSuperclass()) : loc;
  }
  
  public static void registerConvertedOverlay(Class<?> clazz, String loc) {
    overlays.put(clazz, new ResourceLocation(loc));
  }
  
  private static File getSkinFile(ResourceLocation fakeLoc) {
    String hash = fakeLoc.getResourcePath().replace("skins/", "");
    File dir = (File)Helper.Reflection.getPrivateFinalField(Minecraft.class, Minecraft.getMinecraft(), Helper.Obfuscation.getPosNames("Minecraft/fileAssets"));
    File sdir = new File(dir, "skins");
    File mdir = new File(sdir, hash.substring(0, 2));
    return new File(mdir, hash);
  }
  
  private static String[] toStringArraySafe(List list) {
    while (list.contains(null))
      list.remove((Object)null); 
    return (String[])list.toArray((Object[])new String[list.size()]);
  }
  
  static {
    overlays.put(EntityPlayer.class, playerOverlay);
  }
  
  private static class VampireTexture extends AbstractTexture {
    protected final ResourceLocation textureLocation;
    
    protected final ResourceLocation overlayLocation;
    
    protected final boolean slimPlayer;
    
    public VampireTexture(ResourceLocation loc, ResourceLocation overlay) {
      this(loc, overlay, false);
    }
    
    public VampireTexture(ResourceLocation textureLocation, ResourceLocation overlayLocation, boolean slimPlayer) {
      this.textureLocation = textureLocation;
      this.overlayLocation = overlayLocation;
      this.slimPlayer = slimPlayer;
    }
    
    public void loadTexture(IResourceManager resManager) throws IOException {
      deleteGlTexture();
      InputStream inputstream = null;
      InputStream inputstreamOverlay = null;
      try {
        BufferedImage image = null;
        IResource iresource = null;
        if (this.textureLocation.getResourcePath().contains("skin")) {
          File f = TextureHelper.getSkinFile(this.textureLocation);
          if (f.isFile()) {
            image = ImageIO.read(f);
          } else {
            iresource = resManager.getResource(this.slimPlayer ? TextureHelper.TEXTURE_ALEX : TextureHelper.TEXTURE_STEVE);
            inputstream = iresource.getInputStream();
            image = ImageIO.read(inputstream);
          } 
        } else {
          iresource = resManager.getResource(this.textureLocation);
          inputstream = iresource.getInputStream();
          image = ImageIO.read(inputstream);
        } 
        try {
          IResource iresource_overlay = resManager.getResource(this.overlayLocation);
          inputstreamOverlay = iresource_overlay.getInputStream();
          Image overlay = ImageIO.read(inputstreamOverlay);
          int w = image.getWidth();
          int h = image.getHeight();
          if (w != overlay.getWidth((ImageObserver)null))
            overlay = overlay.getScaledInstance(w, -1, 4); 
          int oh = overlay.getHeight((ImageObserver)null);
          if (h == oh || h == oh * 2) {
            BufferedImage combined = new BufferedImage(w, oh, 2);
            Graphics g = combined.getGraphics();
            g.drawImage(image, 0, 0, (ImageObserver)null);
            g.drawImage(overlay, 0, 0, (ImageObserver)null);
            image = combined;
          } 
        } catch (Exception exception) {}
        boolean flag = false;
        boolean flag1 = false;
        if (iresource != null && iresource.hasMetadata())
          try {
            TextureMetadataSection texturemetadatasection = (TextureMetadataSection)iresource.getMetadata("texture");
            if (texturemetadatasection != null) {
              flag = texturemetadatasection.getTextureBlur();
              flag1 = texturemetadatasection.getTextureClamp();
            } 
          } catch (RuntimeException runtimeException) {} 
        TextureUtil.uploadTextureImageAllocate(getGlTextureId(), image, flag, flag1);
      } finally {
        if (inputstream != null)
          inputstream.close(); 
        if (inputstreamOverlay != null)
          inputstreamOverlay.close(); 
      } 
    }
  }
}
