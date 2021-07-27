package alcoholmod.Mathioks.proxys;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import cpw.mods.fml.common.network.simpleimpl.MessageContext;
import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;

public class ServerProxy implements IGuiHandler {
  private static final Map extendedEntityData = new HashMap<Object, Object>();
  
  public void registerKeyBindings() {}
  
  public void registerRenderers() {}
  
  public void preInit() {}
  
  public static void storeEntityData(String name, NBTTagCompound compound) {
    extendedEntityData.put(name, compound);
  }
  
  public static NBTTagCompound getEntityData(String name) {
    return (NBTTagCompound)extendedEntityData.remove(name);
  }
  
  public void registerArmorThings() {}
  
  public void registerRenderThings() {}
  
  public void registerRenders() {}
  
  public World getClientWorld() {
    return null;
  }
  
  public void preInit(FMLPreInitializationEvent event) {}
  
  public EntityPlayer getPlayerEntity(MessageContext ctx) {
    return (EntityPlayer)(ctx.getServerHandler()).playerEntity;
  }
  
  public void initialize() {}
  
  public void init(FMLInitializationEvent event) {}
  
  public void generateScentParticles(Entity theEntity, float red, float green, float blue) {}
  
  public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    return null;
  }
  
  public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
    return null;
  }
}
