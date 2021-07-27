package alcoholmod.Mathioks.ExtraFunctions;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler {
  public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    return null;
  }
  
  public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {
    world.getTileEntity(x, y, z);
    return new GuiTest();
  }
}
