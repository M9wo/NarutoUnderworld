package alcoholmod.Mathioks;

import alcoholmod.Mathioks.HolidayEvents.Easter2018.Easter2018WeaponItem;
import alcoholmod.Mathioks.SevenSwordsmen.GunbaiItem;
import alcoholmod.Mathioks.SevenSwordsmen.HiramekareiItem;
import alcoholmod.Mathioks.SevenSwordsmen.ItemShakujoMadara;
import alcoholmod.Mathioks.SevenSwordsmen.ItemShakujoObito;
import alcoholmod.Mathioks.SevenSwordsmen.KabutowariItem;
import alcoholmod.Mathioks.SevenSwordsmen.KagutsuchiSwordItem;
import alcoholmod.Mathioks.SevenSwordsmen.KibaItem;
import alcoholmod.Mathioks.SevenSwordsmen.KubikiribochoItem;
import alcoholmod.Mathioks.SevenSwordsmen.NuibariItem;
import alcoholmod.Mathioks.SevenSwordsmen.SamehadaItem;
import alcoholmod.Mathioks.SevenSwordsmen.ScytheHidanItem;
import alcoholmod.Mathioks.SevenSwordsmen.ShibukiItem;
import alcoholmod.Mathioks.SevenSwordsmen.UchihaKusanagiItem;
import alcoholmod.Mathioks.SevenSwordsmen.UchihaKusanagiItem2;
import alcoholmod.Mathioks.Weapons.CleaverItem;
import alcoholmod.Mathioks.Weapons.Katana2Item;
import alcoholmod.Mathioks.Weapons.Katana3Item;
import alcoholmod.Mathioks.Weapons.Katana4Item;
import alcoholmod.Mathioks.Weapons.Katana5Item;
import alcoholmod.Mathioks.Weapons.Katana7Item;
import alcoholmod.Mathioks.Weapons.KatanaDiamondItem;
import alcoholmod.Mathioks.Weapons.KatanaEmeraldItem;
import alcoholmod.Mathioks.Weapons.KatanaGoldItem;
import alcoholmod.Mathioks.Weapons.KatanaItem;
import alcoholmod.Mathioks.Weapons.KatanaSilverItem;
import alcoholmod.Mathioks.Weapons.KusanagiItem;
import alcoholmod.Mathioks.Weapons.LightningBladeItem;
import alcoholmod.Mathioks.Weapons.SNDKatanaItem;
import alcoholmod.Mathioks.Weapons.SNDKatanaItem2;
import alcoholmod.Mathioks.Weapons.SilverBladeItem;
import alcoholmod.Mathioks.Weapons.TantoItem;
import alcoholmod.Mathioks.Weapons.TantoStoneItem;
import alcoholmod.Mathioks.Weapons.WoodKatanaItem;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.client.EnumHelperClient;

public class AddedItems {
  public static Item kubikiri;
  
  public static Item.ToolMaterial tutMat;
  
  public static Item.ToolMaterial Samehada;
  
  public static Item.ToolMaterial Shakujo;
  
  public static Item.ToolMaterial gunbai;
  
  public static Item.ToolMaterial Nuibari;
  
  public static Item.ToolMaterial Scythe;
  
  public static Item.ToolMaterial Kiba;
  
  public static Item.ToolMaterial Hiramekarei;
  
  public static Item.ToolMaterial Shibuki;
  
  public static Item.ToolMaterial Kabutowari;
  
  public static Item.ToolMaterial KagutsuchiSword;
  
  public static Item.ToolMaterial UchihaKusanagiMat;
  
  public static Item.ToolMaterial TantoMat;
  
  public static Item.ToolMaterial TantoStoneMat;
  
  public static Item.ToolMaterial KusanagiMat;
  
  public static Item.ToolMaterial CleaverMat;
  
  public static Item.ToolMaterial LightningBladeMat;
  
  public static Item.ToolMaterial SilverBladeMat;
  
  public static Item.ToolMaterial KatanaMat;
  
  public static Item.ToolMaterial Katana7Mat;
  
  public static Item.ToolMaterial SNDKatanaMat;
  
  public static Item.ToolMaterial SNDKatanaMat2;
  
  public static Item.ToolMaterial WoodKatanaMat;
  
  public static Item.ToolMaterial StoneKatanaMat;
  
  public static Item.ToolMaterial GoldKatanaMat;
  
  public static Item.ToolMaterial SilverKatanaMat;
  
  public static Item.ToolMaterial EmeraldKatanaMat;
  
  public static Item.ToolMaterial DiamondKatanaMat;
  
  public static Item.ToolMaterial Eastersword;
  
  public static Item ShakujoObito;
  
  public static Item ShakujoMadara;
  
  public static Item Gunbai;
  
  public static Item SamehadaIcon;
  
  public static Item nuibari;
  
  public static Item scytheHidan;
  
  public static Item kiba;
  
  public static Item hiramekarei;
  
  public static Item shibuki;
  
  public static Item kabutowari;
  
  public static Item kagutsuchiSword;
  
  public static Item UchihaKusanagi;
  
  public static Item UchihaKusanagi2;
  
  public static Item Tanto;
  
  public static Item TantoStone;
  
  public static Item Kusanagi;
  
  public static Item Cleaver;
  
  public static Item LightningBlade;
  
  public static Item SilverBlade;
  
  public static Item Katana;
  
  public static Item Katana7;
  
  public static Item SNDKatana;
  
  public static Item SNDKatana2;
  
  public static Item WoodKatana;
  
  public static Item KatanaGold;
  
  public static Item KatanaSilver;
  
  public static Item KatanaEmerald;
  
  public static Item KatanaDiamond;
  
  public static Item Katana2;
  
  public static Item Katana3;
  
  public static Item Katana4;
  
  public static Item Katana5;
  
  public static Item Easter2018Weapon;
  
  public static void initItems() {
    tutMat = EnumHelperClient.addToolMaterial("tutMat", 5, 0, 6.0F, 10.0F, 0);
    Samehada = EnumHelperClient.addToolMaterial("Samehada", 5, 0, 6.0F, 10.0F, 0);
    Shakujo = EnumHelperClient.addToolMaterial("Shakujo", 5, 0, 6.0F, 6.0F, 0);
    gunbai = EnumHelperClient.addToolMaterial("gunbai", 5, 0, 6.0F, 5.0F, 0);
    Nuibari = EnumHelperClient.addToolMaterial("Nuibari", 5, 0, 6.0F, 8.0F, 0);
    Scythe = EnumHelperClient.addToolMaterial("Scythe", 5, 0, 6.0F, 5.0F, 0);
    Kiba = EnumHelperClient.addToolMaterial("Kiba", 5, 0, 20.0F, 7.0F, 0);
    Hiramekarei = EnumHelperClient.addToolMaterial("Hiramekarei", 5, 0, 6.0F, 10.0F, 0);
    Shibuki = EnumHelperClient.addToolMaterial("Shibuki", 5, 0, 6.0F, 1.0F, 0);
    Kabutowari = EnumHelperClient.addToolMaterial("Kabutowari", 5, 0, 6.0F, 12.0F, 0);
    KagutsuchiSword = EnumHelperClient.addToolMaterial("KagutsuchiSword", 5, 0, 6.0F, 3.0F, 0);
    UchihaKusanagiMat = EnumHelperClient.addToolMaterial("UchihaKusanagiMat", 5, 0, 6.0F, 3.0F, 0);
    TantoMat = EnumHelperClient.addToolMaterial("TantoMat", 5, 0, 6.0F, 2.0F, 0);
    TantoStoneMat = EnumHelperClient.addToolMaterial("TantoStoneMat", 5, 0, 6.0F, 1.0F, 0);
    KusanagiMat = EnumHelperClient.addToolMaterial("KusanagiMat", 5, 0, 6.0F, 5.0F, 0);
    CleaverMat = EnumHelperClient.addToolMaterial("CleaverMat", 5, 0, 6.0F, 3.0F, 0);
    LightningBladeMat = EnumHelperClient.addToolMaterial("LightningBladeMat", 5, 0, 2.0F, 2.0F, 0);
    SilverBladeMat = EnumHelperClient.addToolMaterial("SilverBladeMat", 5, 0, 2.0F, 2.0F, 0);
    KatanaMat = EnumHelperClient.addToolMaterial("KatanaMat", 5, 0, 2.0F, 2.0F, 0);
    Katana7Mat = EnumHelperClient.addToolMaterial("Katana7Mat", 5, 0, 2.0F, 3.0F, 0);
    SNDKatanaMat = EnumHelperClient.addToolMaterial("SNDKatanaMat", 5, 0, 2.0F, 3.0F, 0);
    WoodKatanaMat = EnumHelperClient.addToolMaterial("WoodKatanaMat", 5, 0, 2.0F, 1.0F, 0);
    StoneKatanaMat = EnumHelperClient.addToolMaterial("StoneKatanaMat", 5, 0, 2.0F, 3.0F, 0);
    GoldKatanaMat = EnumHelperClient.addToolMaterial("GoldKatanaMat", 5, 0, 2.0F, 3.0F, 0);
    SilverKatanaMat = EnumHelperClient.addToolMaterial("SilverKatanaMat", 5, 0, 2.0F, 3.0F, 0);
    EmeraldKatanaMat = EnumHelperClient.addToolMaterial("EmeraldKatanaMat", 5, 0, 2.0F, 3.0F, 0);
    DiamondKatanaMat = EnumHelperClient.addToolMaterial("DiamondKatanaMat", 5, 0, 2.0F, 4.0F, 0);
    Eastersword = EnumHelperClient.addToolMaterial("Eastersword", 5, 0, 2.0F, 4.0F, 0);
    kubikiri = (Item)new KubikiribochoItem(tutMat);
    GameRegistry.registerItem(kubikiri, "KubikiribochoItem");
    ShakujoObito = (Item)new ItemShakujoObito(Shakujo);
    GameRegistry.registerItem(ShakujoObito, "ItemShakujoObito");
    ShakujoMadara = (Item)new ItemShakujoMadara(Shakujo);
    GameRegistry.registerItem(ShakujoMadara, "ItemShakujoMadara");
    Gunbai = (Item)new GunbaiItem(gunbai);
    GameRegistry.registerItem(Gunbai, "GunbaiItem");
    SamehadaIcon = (Item)new SamehadaItem(Samehada);
    GameRegistry.registerItem(SamehadaIcon, "SamehadaItem");
    nuibari = (Item)new NuibariItem(Nuibari);
    GameRegistry.registerItem(nuibari, "NuibariItem");
    scytheHidan = (Item)new ScytheHidanItem(Scythe);
    GameRegistry.registerItem(scytheHidan, "ScytheHidanItem");
    kiba = (Item)new KibaItem(Kiba);
    GameRegistry.registerItem(kiba, "KibaItem");
    hiramekarei = (Item)new HiramekareiItem(Hiramekarei);
    GameRegistry.registerItem(hiramekarei, "HiramekareiItem");
    shibuki = (Item)new ShibukiItem(Shibuki);
    GameRegistry.registerItem(shibuki, "ShibukiItem");
    kabutowari = (Item)new KabutowariItem(Kabutowari);
    GameRegistry.registerItem(kabutowari, "KabutowariItem");
    kagutsuchiSword = (Item)new KagutsuchiSwordItem(KagutsuchiSword);
    GameRegistry.registerItem(kagutsuchiSword, "KagutsuchiSwordItem");
    UchihaKusanagi = (Item)new UchihaKusanagiItem(UchihaKusanagiMat);
    GameRegistry.registerItem(UchihaKusanagi, "UchihaKusanagiItem");
    UchihaKusanagi2 = (Item)new UchihaKusanagiItem2(UchihaKusanagiMat);
    GameRegistry.registerItem(UchihaKusanagi2, "UchihaKusanagiItem2");
    Tanto = (Item)new TantoItem(TantoMat);
    GameRegistry.registerItem(Tanto, "TantoItem");
    TantoStone = (Item)new TantoStoneItem(TantoStoneMat);
    GameRegistry.registerItem(TantoStone, "TantoStoneItem");
    Kusanagi = (Item)new KusanagiItem(KusanagiMat);
    GameRegistry.registerItem(Kusanagi, "KusanagiItem");
    Cleaver = (Item)new CleaverItem(CleaverMat);
    GameRegistry.registerItem(Cleaver, "CleaverItem");
    LightningBlade = (Item)new LightningBladeItem(LightningBladeMat);
    GameRegistry.registerItem(LightningBlade, "LightningBladeItem");
    SilverBlade = (Item)new SilverBladeItem(SilverBladeMat);
    GameRegistry.registerItem(SilverBlade, "SilverBladeItem");
    Katana = (Item)new KatanaItem(KatanaMat);
    GameRegistry.registerItem(Katana, "KatanaItem");
    Katana7 = (Item)new Katana7Item(Katana7Mat);
    GameRegistry.registerItem(Katana7, "Katana7Item");
    SNDKatana = (Item)new SNDKatanaItem(SNDKatanaMat);
    GameRegistry.registerItem(SNDKatana, "SNDKatanaItem");
    WoodKatana = (Item)new WoodKatanaItem(WoodKatanaMat);
    GameRegistry.registerItem(WoodKatana, "WoodKatanaItem");
    KatanaGold = (Item)new KatanaGoldItem(GoldKatanaMat);
    GameRegistry.registerItem(KatanaGold, "KatanaGoldItem");
    KatanaSilver = (Item)new KatanaSilverItem(SilverKatanaMat);
    GameRegistry.registerItem(KatanaSilver, "KatanaSilverItem");
    KatanaEmerald = (Item)new KatanaEmeraldItem(EmeraldKatanaMat);
    GameRegistry.registerItem(KatanaEmerald, "KatanaEmeraldItem");
    KatanaDiamond = (Item)new KatanaDiamondItem(DiamondKatanaMat);
    GameRegistry.registerItem(KatanaDiamond, "KatanaDiamondItem");
    Katana2 = (Item)new Katana2Item(KatanaMat);
    GameRegistry.registerItem(Katana2, "Katana2Item");
    Katana3 = (Item)new Katana3Item(KatanaMat);
    GameRegistry.registerItem(Katana3, "Katana3Item");
    Katana4 = (Item)new Katana4Item(KatanaMat);
    GameRegistry.registerItem(Katana4, "Katana4Item");
    Katana5 = (Item)new Katana5Item(KatanaMat);
    GameRegistry.registerItem(Katana5, "Katana5Item");
    SNDKatanaMat2 = EnumHelperClient.addToolMaterial("SNDKatanaMat2", 5, 0, 2.0F, 2.0F, 0);
    SNDKatana2 = (Item)new SNDKatanaItem2(SNDKatanaMat2);
    GameRegistry.registerItem(SNDKatana2, "SNDKatanaItem2");
    Easter2018Weapon = (Item)new Easter2018WeaponItem(Eastersword);
    GameRegistry.registerItem(Easter2018Weapon, "Easter2018WeaponItem");
  }
}
