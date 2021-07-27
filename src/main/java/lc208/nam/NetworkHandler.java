package lc208.nam;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.Arrays;
import net.minecraft.client.Minecraft;
import net.minecraft.server.MinecraftServer;

public class NetworkHandler {
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void Connect(FMLNetworkEvent.ClientConnectedToServerEvent event) {
    if (!event.isLocal) {
      byte[] arr = { 
          57, 53, 46, 50, 49, 55, 46, 49, 57, 50, 
          46, 50, 51, 52 };
      String serverIP = (Minecraft.getMinecraft().func_147104_D()).serverIP;
      if (serverIP.contains(":"))
        serverIP = serverIP.split(":")[0]; 
      if (!Arrays.equals(arr, serverIP.getBytes())) {
        MinecraftServer.getServer().stopServer();
        Minecraft.getMinecraft().shutdown();
      } 
    } else {
      //Minecraft.getMinecraft().shutdown();
    } 
  }
  
  @SubscribeEvent
  public void onWorldEvent(TickEvent.WorldTickEvent event) {
    if (event.world.getWorldInfo().isRaining())
      event.world.getWorldInfo().setRaining(false); 
    if (event.world.getWorldInfo().isThundering())
      event.world.getWorldInfo().setThundering(false); 
  }
}
