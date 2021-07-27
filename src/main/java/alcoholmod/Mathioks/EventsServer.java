package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.block.Blockss;
import cpw.mods.fml.common.eventhandler.Event;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.inventory.GuiCrafting;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.inventory.ContainerPlayer;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.inventory.InventoryCraftResult;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IChatComponent;
import net.minecraftforge.client.event.GuiScreenEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.event.entity.item.ItemTossEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerDropsEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.event.world.ExplosionEvent;
import org.lwjgl.input.Keyboard;

public class EventsServer {
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void removeName(RenderLivingEvent.Specials.Pre event) {
    if (event.entity instanceof EntityPlayer) {
      EntityPlayer player = (EntityPlayer)event.entity;
      if (player.inventory.armorItemInSlot(3) != null && (player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmethinatathelast || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetgaara || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetchoji || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetYaguro || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetYugito || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetobito4 || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetlee || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetneji2 || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetshikamaruyoung || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetsakura2 || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetHaku || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetino || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetNaruto || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetminatogenin || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetObitoMask2 || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetmaskedman || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetAnbu1 || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetAnbu2 || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.helmetAnbu3 || player.inventory.armorItemInSlot(3).getItem() == AlcoholMod.HelmetfinalAnbu))
        event.setCanceled(true); 
    } 
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void TickGUI(GuiScreenEvent event) {
    if (event.gui instanceof net.minecraft.client.gui.inventory.GuiInventory || event.gui instanceof GuiCrafting) {
      InventoryCraftResult cr;
      InventoryCrafting ic;
      if (event.gui instanceof net.minecraft.client.gui.inventory.GuiInventory) {
        ContainerPlayer p = (ContainerPlayer)(Minecraft.getMinecraft()).thePlayer.inventoryContainer;
        cr = (InventoryCraftResult)p.craftResult;
        ic = p.craftMatrix;
      } else {
        ContainerWorkbench w = (ContainerWorkbench)((GuiCrafting)event.gui).inventorySlots;
        ic = w.craftMatrix;
        cr = (InventoryCraftResult)w.craftResult;
      } 
      ItemStack item = cr.getStackInSlot(0);
      if (item != null && 
        item.getUnlocalizedName().contains("earner")) {
        ItemStack ans = null;
        for (int i = 0; i < ic.getSizeInventory(); i++) {
          if (ic.getStackInSlot(i) != null)
            ans = ic.getStackInSlot(i); 
        } 
        if (ans != null) {
          item.stackTagCompound = new NBTTagCompound();
          String p1 = ans.stackTagCompound.getString("Owner");
          item.stackTagCompound.setString("Owner", p1);
        } 
      } 
    } 
  }
  
  @SubscribeEvent
  public void PlaceBlock(BlockEvent.PlaceEvent event) {
    if (event.block instanceof net.minecraft.block.BlockAnvil)
      event.setCanceled(true); 
    if (event.block instanceof alcoholmod.Mathioks.block.NaraShadowBlock) {
      event.setCanceled(true);
      event.player.inventory.consumeInventoryItem(Item.getItemFromBlock((Block)Blockss.naraShadowBlock));
    } 
    if (event.block instanceof noppes.npcs.blocks.BlockCarpentryBench)
      event.setCanceled(true); 
    if (event.block instanceof alcoholmod.Mathioks.block.OilBlock) {
      event.setCanceled(true);
      event.player.inventory.consumeInventoryItem(Item.getItemFromBlock((Block)Blockss.oilBlock));
    } 
  }
  
  @SideOnly(Side.CLIENT)
  @SubscribeEvent
  public void onToss(ItemTossEvent event) {
    if (((Minecraft.getMinecraft()).currentScreen instanceof net.minecraft.client.gui.inventory.GuiInventory || (Minecraft.getMinecraft()).currentScreen instanceof net.minecraft.client.gui.inventory.GuiContainerCreative) && 
      Keyboard.isKeyDown(42)) {
      event.setCanceled(true);
      event.player.inventory.addItemStackToInventory(event.entityItem.getEntityItem());
    } 
  }
  
  @SubscribeEvent
  public void onDeath(LivingDeathEvent event) {
    if (!event.entity.worldObj.isRemote && 
      event.source.getEntity() instanceof EntityPlayer && (
      event.entity instanceof net.minecraft.entity.monster.EntitySpider || event.entity instanceof net.minecraft.entity.monster.EntityEnderman || event.entity instanceof net.narutoswords.entity.EntityWhiteZetsu || event.entity instanceof alcoholmod.Mathioks.NPC.EntityNinja || event.entity instanceof net.minecraft.entity.monster.EntityCreeper)) {
      ExtendedPlayer props = ExtendedPlayer.get((EntityPlayer)event.source.getEntity());
      props.setChakraExperience(props.getChakraExperience() + 1);
      PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage((EntityPlayer)event.source.getEntity()), (EntityPlayerMP)event.source.getEntity());
    } 
  }
  
  @SubscribeEvent
  public void onJoinWorld(EntityJoinWorldEvent event) {
    if (event.entity instanceof net.minecraft.entity.monster.EntityZombie)
      event.setCanceled(true); 
  }
  
  @SubscribeEvent
  public void onMobDrops(LivingDropsEvent e) {
    if (e.entity instanceof EntityPlayer)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.Jutsu.EntityBunshin)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.Jutsu.EntityCloneBunshin)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.Jutsu.EntityWoodBunshin)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.Jutsu.EntitySuperCloneExplosion)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.Jutsu.EntityBindClone)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.Jutsu.EntityBeastClone)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.Jutsu.EntityAburameClone)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.Boss.AkatsukiDeidara)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.NickModels.GedoMazoEntity)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.NPC.EntityNPC)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.NPC.EntityChunin)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.NPC.EntityNinja) {
      if (e.entity instanceof alcoholmod.Mathioks.NPC.ChuninExamGeninEntity)
        e.entity.dropItem(AlcoholMod.ChuninExamWinningEmblem, 1); 
      if (e.entity instanceof alcoholmod.Mathioks.NPC.UchihaBrotherEntity)
        e.entity.dropItem(AlcoholMod.DefeatUchihaBrother, 1); 
      e.setCanceled(true);
    } 
    if (e.entity instanceof alcoholmod.Mathioks.NPC.EntityJonin)
      e.setCanceled(true); 
    if (e.entity instanceof alcoholmod.Mathioks.NPC.EntityKage)
      e.setCanceled(true); 
  }
  
  @SubscribeEvent
  public void onPlayerDeath(PlayerDropsEvent event) {}
  
  @SubscribeEvent
  public void onAttack(ItemTooltipEvent event) {
    for (int i = 0; i < event.toolTip.size(); i++) {
      if (((String)event.toolTip.get(i)).contains("Kenjutsu:"))
        event.toolTip.remove(i); 
    } 
  }
  
  @SubscribeEvent
  public void onDeath2(LivingDeathEvent event) {
    if (event.entity instanceof EntityPlayer)
      ((EntityPlayer)event.entity).worldObj.getGameRules().setOrCreateGameRule("keepInventory", "true"); 
  }
  
  public void ExplosionEvent(ExplosionEvent event) {
    event.world.getGameRules().setOrCreateGameRule("mobGrifering", "false");
  }
  
  @SubscribeEvent
  public void onItemUse(PlayerInteractEvent event) {
    if ((event.action == PlayerInteractEvent.Action.RIGHT_CLICK_AIR || event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK) && 
      event.entityPlayer.getHeldItem() != null && (
      event.entityPlayer.getHeldItem().getItem() instanceof alcoholmod.Mathioks.Final.JutsuItem || event.entityPlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemSpade || event.entityPlayer.getHeldItem().getItem() instanceof net.minecraft.item.ItemAxe)) {
      if (event.entityPlayer.getHeldItem().getItem().getClass().getCanonicalName().contains("nhm.coffee.NarutoHelperMod.items.Clans") || event.entityPlayer.getHeldItem().getItem() == AlcoholMod.SetNeko)
        ExtendedPlayer.get(event.entityPlayer).fixLimitStats(); 
      if (event.entityPlayer.posX >= 8787.7626D && event.entityPlayer.posX <= 9258.59667D && 
        event.entityPlayer.posZ >= 10173.88296D && event.entityPlayer.posZ <= 10590.44079D) {
        event.entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_RED + "Вы не можете использовать техники , лопату , топоры на спавне"));
        event.setCanceled(true);
      } 
    } 
  }
  
  @SubscribeEvent
  public void RightClickBlock(PlayerInteractEvent event) {
    if (event.action == PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK && 
      event.useBlock != Event.Result.DENY && 
      event.world.getBlock(event.x, event.y, event.z) instanceof net.minecraft.block.BlockTrapDoor && 
      event.entityPlayer.posX >= 8787.7626D && event.entityPlayer.posX <= 9258.59667D && 
      event.entityPlayer.posZ >= 10173.88296D && event.entityPlayer.posZ <= 10590.44079D) {
      event.entityPlayer.addChatComponentMessage((IChatComponent)new ChatComponentText(EnumChatFormatting.DARK_RED + "Вы не можете менять состояние люка на спавне"));
      event.setCanceled(true);
    } 
  }
  
  @SubscribeEvent
  public void JoinWorldEvent(EntityJoinWorldEvent event) {
    if (event.entity instanceof net.minecraft.entity.item.EntityItemFrame)
      event.setCanceled(true); 
  }
}
