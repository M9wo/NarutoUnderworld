package alcoholmod.Mathioks;

import alcoholmod.Mathioks.ExtraFunctions.SyncAQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncAffiliationMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuFormActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuKindMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuScaleMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncBijuuUnlockMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakuganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncByakugouMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraControlMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncChakraExperienceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncClanMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSealMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncCurseSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDeathPossessionMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncDrunkenFistMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncEarthReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncEightGatesStageMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncFireReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncGenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIburiMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIntelligenceMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncIzanagiMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJouganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJouganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncJutsuPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKarmaSealTypeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKenjutsuSkillsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKetsuryuganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKetsuryuganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncKuramaMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLandMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLavaChakraModeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLevelMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncLightningReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncNinjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncRankMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSSQuestsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageModeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSageVersionMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganActiveMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSharinganUnlockMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncShurikenjutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsModeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsOrbsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsSageMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsShieldMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSixPathsStateMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSkillPointsMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSpeedMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncStorylineMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSummoningMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoAMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncSusanoSizeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncTaijutsuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncTaijutsuModeMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWaterReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncWindReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYangReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYinReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncYinyangReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncboilReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncbyakuganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynccrystalReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncdustReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncexplosionReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynciceReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynclavaReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncmagnetReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncmangekyouSharinganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncrinneganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncscorchReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncsharinganiconMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncshikotsumyakuMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncsteelReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncstormReleaseMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynctenseiganMessage;
import alcoholmod.Mathioks.ExtraFunctions.SynctrackAllMessage;
import alcoholmod.Mathioks.ExtraFunctions.SyncwoodReleaseMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncBijuuTransformMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncCurseSealTransformMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncHealthMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncSusanoTransformMessage;
import alcoholmod.Mathioks.TransformationsRealPackage.SyncTransformMessage;
import alcoholmod.Mathioks.proxys.ServerProxy;
import cpw.mods.fml.common.network.simpleimpl.IMessage;
import cpw.mods.fml.relauncher.Side;
import java.util.Set;
import lc208.nam.packets.SyncNekoMessage;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.Potion;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.IExtendedEntityProperties;

public class ExtendedPlayer implements IExtendedEntityProperties {
  public static final String EXT_PROP_NAME = "ChakraPlayer";
  
  private final EntityPlayer player;
  
  private int maxMana;
  
  private int manaRegenTimer;
  
  private int maxSenjutsu;
  
  private int senjutsuRegenTimer;
  
  public static final int MANA_WATCHER = 23;
  
  public static final int SENJUTSU_WATCHER = 24;
  
  private int BijuuTexture;
  
  private int BijuuModel;
  
  private int BijuuCurseSealTexture;
  
  private int BijuuCurseSealModel;
  
  private boolean isTransformed;
  
  public Entity target;
  
  public int targetID;
  
  public boolean trackAll;
  
  public boolean gotBook;
  
  public boolean got1500Present;
  
  public boolean got5000Present;
  
  public int health;
  
  public double Kenjutsu;
  
  public double Taijutsu;
  
  public int Genjutsu;
  
  public double Speed;
  
  public int Intelligence;
  
  public int Clan;
  
  public int Rank;
  
  public int Jinchuriki;
  
  public int Sharingan;
  
  public int Kinjutsu;
  
  public boolean SageMode;
  
  public int Ninjutsu;
  
  public int Senjutsu;
  
  public ItemStack equippedItem;
  
  public int Shurikenjutsu;
  
  public int Summoning;
  
  public int Affiliation;
  
  public int Land;
  
  public boolean DrunkenFist;
  
  public boolean TaijutsuMode;
  
  public int Level;
  
  public int ChakraExperience;
  
  public int SkillPoints;
  
  public int WindRelease;
  
  public int FireRelease;
  
  public int WaterRelease;
  
  public int LightningRelease;
  
  public int EarthRelease;
  
  public int yinrelease;
  
  public int yangrelease;
  
  public int yinyangrelease;
  
  public int woodRelease;
  
  public int lavaRelease;
  
  public int scorchRelease;
  
  public int boilRelease;
  
  public int magnetRelease;
  
  public int stormRelease;
  
  public int iceRelease;
  
  public int explosionRelease;
  
  public int steelRelease;
  
  public int crystalRelease;
  
  public int dustRelease;
  
  public int shikotsumyaku;
  
  public int byakugan;
  
  public int tenseigan;
  
  public int sharinganicon;
  
  public int mangekyouSharingan;
  
  public int rinnegan;
  
  public boolean ByakuganActive;
  
  public boolean SharinganActive;
  
  public boolean CurseSealActive;
  
  public int SusanoActive;
  
  public boolean SusanoTransformed;
  
  public boolean SusanoA;
  
  public int Izanagi;
  
  public boolean LavaChakraMode;
  
  public boolean ChakraControl;
  
  public int DQuests;
  
  public int CQuests;
  
  public int BQuests;
  
  public int AQuests;
  
  public int SQuests;
  
  public int SSQuests;
  
  public int Iburi;
  
  public int Kurama;
  
  public int CurseSeal;
  
  public boolean CurseSealTransformed;
  
  public boolean BijuuTransformed;
  
  public boolean BijuuFormActive;
  
  public int BijuuTransformTexture;
  
  public int BijuuTransformModel;
  
  public int BijuuScale;
  
  public double Size;
  
  public int JutsuPoints;
  
  public int BijuuKind;
  
  public int KenjutsuSkills;
  
  public int Storyline;
  
  public int ByakuganSize;
  
  public boolean SixPaths;
  
  public int Ketsuryugan;
  
  public boolean KetsuryuganActive;
  
  private boolean preventTransform;
  
  private int CurseSize;
  
  private int SusanoSize;
  
  private int SageVersion;
  
  private boolean SageActive;
  
  private int DeathPossession;
  
  private double SharinganUnlock;
  
  private double BijuuUnlock;
  
  private double SharinganSize;
  
  private int EightGatesStage;
  
  private int Byakugou;
  
  private int Jougan;
  
  private int KarmaSealType;
  
  private int KarmaSealSize;
  
  private boolean JouganActive;
  
  private boolean KarmaSealActive;
  
  private boolean SixPathsMode;
  
  private int SixPathsOrbs;
  
  private boolean SixPathsShield;
  
  private boolean sixpathssage;
  
  private boolean sixpathsstate;
  
  private boolean nekomode;
  
  public ExtendedPlayer(EntityPlayer player) {
    this.player = player;
    this.maxMana = 25;
    this.manaRegenTimer = 0;
    this.player.getDataWatcher().addObject(23, Integer.valueOf(this.maxMana));
    this.Sharingan = 0;
    this.BijuuTexture = 0;
    this.BijuuModel = 1;
    this.BijuuCurseSealTexture = 0;
    this.BijuuCurseSealModel = 1;
    this.isTransformed = false;
    this.target = null;
    this.targetID = 0;
    this.trackAll = false;
    this.gotBook = false;
    this.got1500Present = false;
    this.got5000Present = false;
    this.health = 0;
    this.Kenjutsu = 1.0D;
    this.Taijutsu = 1.0D;
    this.Genjutsu = 0;
    this.Speed = 0.1D;
    this.Intelligence = 0;
    this.Clan = 0;
    this.Rank = 0;
    this.Jinchuriki = 0;
    this.maxSenjutsu = 0;
    this.senjutsuRegenTimer = 0;
    this.player.getDataWatcher().addObject(24, Integer.valueOf(this.maxSenjutsu));
    this.Kinjutsu = 0;
    this.SageMode = false;
    this.Ninjutsu = 25;
    this.Senjutsu = 0;
    this.Shurikenjutsu = 0;
    this.Summoning = 0;
    this.Affiliation = 0;
    this.Land = 0;
    this.DrunkenFist = false;
    this.TaijutsuMode = false;
    this.Level = 0;
    this.ChakraExperience = 0;
    this.SkillPoints = 0;
    this.WindRelease = 0;
    this.FireRelease = 0;
    this.WaterRelease = 0;
    this.LightningRelease = 0;
    this.EarthRelease = 0;
    this.yinrelease = 0;
    this.yangrelease = 0;
    this.yinyangrelease = 0;
    this.woodRelease = 0;
    this.lavaRelease = 0;
    this.scorchRelease = 0;
    this.boilRelease = 0;
    this.magnetRelease = 0;
    this.stormRelease = 0;
    this.iceRelease = 0;
    this.explosionRelease = 0;
    this.steelRelease = 0;
    this.crystalRelease = 0;
    this.dustRelease = 0;
    this.shikotsumyaku = 0;
    this.byakugan = 0;
    this.tenseigan = 0;
    this.sharinganicon = 0;
    this.mangekyouSharingan = 0;
    this.rinnegan = 0;
    this.ByakuganActive = false;
    this.SharinganActive = false;
    this.CurseSealActive = false;
    this.SusanoActive = 0;
    this.SusanoTransformed = false;
    this.SusanoA = false;
    this.Izanagi = 0;
    this.LavaChakraMode = false;
    this.ChakraControl = false;
    this.DQuests = 0;
    this.CQuests = 0;
    this.BQuests = 0;
    this.AQuests = 0;
    this.SQuests = 0;
    this.SSQuests = 0;
    this.Iburi = 0;
    this.Kurama = 0;
    this.CurseSeal = 0;
    this.CurseSealTransformed = false;
    this.BijuuTransformed = false;
    this.BijuuFormActive = false;
    this.BijuuTransformTexture = 0;
    this.BijuuTransformModel = 1;
    this.BijuuScale = 0;
    this.Size = 0.0D;
    this.JutsuPoints = 0;
    this.BijuuKind = 0;
    this.KenjutsuSkills = 0;
    this.Storyline = 0;
    this.ByakuganSize = 0;
    this.SixPaths = false;
    this.Ketsuryugan = 0;
    this.KetsuryuganActive = false;
    this.preventTransform = false;
    this.CurseSize = 0;
    this.SusanoSize = 0;
    this.SageVersion = 0;
    this.SageActive = false;
    this.DeathPossession = 0;
    this.SharinganUnlock = 0.1D;
    this.BijuuUnlock = 0.1D;
    this.SharinganSize = 0.0D;
    this.EightGatesStage = 0;
    this.Byakugou = 0;
    this.Jougan = 0;
    this.JouganActive = false;
    this.KarmaSealActive = false;
    this.KarmaSealSize = 0;
    this.KarmaSealType = 0;
    this.SixPathsMode = false;
    this.SixPathsOrbs = 0;
    this.SixPathsShield = false;
    this.sixpathssage = false;
    this.sixpathsstate = false;
    this.nekomode = false;
  }
  
  public static final void register(EntityPlayer player) {
    player.registerExtendedProperties("ChakraPlayer", new ExtendedPlayer(player));
  }
  
  public static final ExtendedPlayer get(EntityPlayer player) {
    return (ExtendedPlayer)player.getExtendedProperties("ChakraPlayer");
  }
  
  public void copy(ExtendedPlayer props) {
    this.player.getDataWatcher().updateObject(23, Integer.valueOf(props.getCurrentMana()));
    this.maxMana = props.maxMana;
    this.manaRegenTimer = props.manaRegenTimer;
    this.player.getDataWatcher().updateObject(24, Integer.valueOf(props.getCurrentSenjutsu()));
    this.maxSenjutsu = props.maxSenjutsu;
    this.senjutsuRegenTimer = props.senjutsuRegenTimer;
    this.Sharingan = props.Sharingan;
    this.BijuuTexture = props.BijuuTexture;
    this.BijuuModel = props.BijuuModel;
    this.BijuuCurseSealTexture = props.BijuuCurseSealTexture;
    this.BijuuCurseSealModel = props.BijuuCurseSealModel;
    this.isTransformed = false;
    this.trackAll = props.trackAll;
    this.gotBook = props.gotBook;
    this.got1500Present = props.got1500Present;
    this.got5000Present = props.got5000Present;
    this.health = props.health;
    this.Kenjutsu = props.Kenjutsu;
    this.Taijutsu = props.Taijutsu;
    this.Genjutsu = props.Genjutsu;
    this.Speed = props.Speed;
    this.Intelligence = props.Intelligence;
    this.Clan = props.Clan;
    this.Rank = props.Rank;
    this.Jinchuriki = props.Jinchuriki;
    this.Kinjutsu = props.Kinjutsu;
    this.SageMode = props.SageMode;
    this.Ninjutsu = props.Ninjutsu;
    this.Senjutsu = props.Senjutsu;
    this.Shurikenjutsu = props.Shurikenjutsu;
    this.Summoning = props.Summoning;
    this.Affiliation = props.Affiliation;
    this.Land = props.Land;
    this.DrunkenFist = props.DrunkenFist;
    this.TaijutsuMode = props.TaijutsuMode;
    this.Level = props.Level;
    this.ChakraExperience = props.ChakraExperience;
    this.SkillPoints = props.SkillPoints;
    this.WindRelease = props.WindRelease;
    this.FireRelease = props.FireRelease;
    this.WaterRelease = props.WaterRelease;
    this.LightningRelease = props.LightningRelease;
    this.EarthRelease = props.EarthRelease;
    this.yinrelease = props.yinrelease;
    this.yangrelease = props.yangrelease;
    this.yinyangrelease = props.yinyangrelease;
    this.woodRelease = props.woodRelease;
    this.lavaRelease = props.lavaRelease;
    this.scorchRelease = props.scorchRelease;
    this.boilRelease = props.boilRelease;
    this.magnetRelease = props.magnetRelease;
    this.stormRelease = props.stormRelease;
    this.iceRelease = props.iceRelease;
    this.explosionRelease = props.explosionRelease;
    this.steelRelease = props.steelRelease;
    this.crystalRelease = props.crystalRelease;
    this.dustRelease = props.dustRelease;
    this.shikotsumyaku = props.shikotsumyaku;
    this.byakugan = props.byakugan;
    this.tenseigan = props.tenseigan;
    this.sharinganicon = props.sharinganicon;
    this.mangekyouSharingan = props.mangekyouSharingan;
    this.rinnegan = props.rinnegan;
    this.SharinganActive = props.SharinganActive;
    this.ByakuganActive = props.ByakuganActive;
    this.CurseSealActive = props.CurseSealActive;
    this.SusanoActive = props.SusanoActive;
    this.SusanoTransformed = props.SusanoTransformed;
    this.SusanoA = props.SusanoA;
    this.Izanagi = props.Izanagi;
    this.LavaChakraMode = props.LavaChakraMode;
    this.ChakraControl = props.ChakraControl;
    this.DQuests = props.DQuests;
    this.CQuests = props.CQuests;
    this.BQuests = props.BQuests;
    this.AQuests = props.AQuests;
    this.SQuests = props.SQuests;
    this.SSQuests = props.SSQuests;
    this.Iburi = props.Iburi;
    this.Kurama = props.Kurama;
    this.CurseSeal = props.CurseSeal;
    this.CurseSealTransformed = props.CurseSealTransformed;
    this.BijuuTransformed = props.BijuuTransformed;
    this.BijuuFormActive = props.BijuuFormActive;
    this.BijuuTransformTexture = props.BijuuTransformTexture;
    this.BijuuTransformModel = props.BijuuTransformModel;
    this.BijuuScale = props.BijuuScale;
    this.Size = props.Size;
    this.JutsuPoints = props.JutsuPoints;
    this.BijuuKind = props.BijuuKind;
    this.KenjutsuSkills = props.KenjutsuSkills;
    this.Storyline = props.Storyline;
    this.ByakuganSize = props.ByakuganSize;
    this.SixPaths = props.SixPaths;
    this.Ketsuryugan = props.Ketsuryugan;
    this.KetsuryuganActive = props.KetsuryuganActive;
    this.CurseSize = props.CurseSize;
    this.SusanoSize = props.SusanoSize;
    this.SageVersion = props.SageVersion;
    this.SageActive = props.SageActive;
    this.DeathPossession = props.DeathPossession;
    this.SharinganUnlock = props.SharinganUnlock;
    this.BijuuUnlock = props.BijuuUnlock;
    this.SharinganSize = props.SharinganSize;
    this.EightGatesStage = props.EightGatesStage;
    this.Byakugou = props.Byakugou;
    this.Jougan = props.Jougan;
    this.KarmaSealType = props.KarmaSealType;
    this.KarmaSealSize = props.KarmaSealSize;
    this.JouganActive = props.JouganActive;
    this.KarmaSealActive = props.KarmaSealActive;
    this.SixPathsMode = props.SixPathsMode;
    this.SixPathsOrbs = props.SixPathsOrbs;
    this.SixPathsShield = props.SixPathsShield;
    this.sixpathssage = props.sixpathssage;
    this.sixpathsstate = props.sixpathsstate;
    this.nekomode = props.nekomode;
  }
  
  public final void saveNBTData(NBTTagCompound compound) {
    NBTTagCompound properties = new NBTTagCompound();
    properties.setInteger("CurrentMana", this.player.getDataWatcher().getWatchableObjectInt(23));
    properties.setInteger("MaxMana", this.maxMana);
    properties.setInteger("ManaRegenTimer", this.manaRegenTimer);
    properties.setInteger("CurrentSenjutsu", this.player.getDataWatcher().getWatchableObjectInt(24));
    properties.setInteger("MaxSenjutsu", this.maxSenjutsu);
    properties.setInteger("SenjutsuRegenTimer", this.senjutsuRegenTimer);
    properties.setInteger("Sharingan", this.Sharingan);
    properties.setInteger("BijuuTexture", this.BijuuTexture);
    properties.setInteger("BijuuModel", this.BijuuModel);
    properties.setInteger("BijuuCurseSealTexture", this.BijuuCurseSealTexture);
    properties.setInteger("BijuuCurseSealModel", this.BijuuCurseSealModel);
    properties.setBoolean("IsTransformed", this.isTransformed);
    properties.setBoolean("TrackAll", this.trackAll);
    properties.setBoolean("GotBook", this.gotBook);
    properties.setBoolean("got1500Present", this.got1500Present);
    properties.setBoolean("got5000Present", this.got5000Present);
    properties.setInteger("health", this.health);
    properties.setDouble("Kenjutsu", this.Kenjutsu);
    properties.setDouble("Taijutsu", this.Taijutsu);
    properties.setInteger("Genjutsu", this.Genjutsu);
    properties.setDouble("Speed", this.Speed);
    properties.setInteger("Intelligence", this.Intelligence);
    properties.setInteger("Clan", this.Clan);
    properties.setInteger("Rank", this.Rank);
    properties.setInteger("Jinchuriki", this.Jinchuriki);
    properties.setInteger("Kinjutsu", this.Kinjutsu);
    properties.setBoolean("SageMode", this.SageMode);
    properties.setInteger("Ninjutsu", this.Ninjutsu);
    properties.setInteger("Senjutsu", this.Senjutsu);
    properties.setInteger("Shurikenjutsu", this.Shurikenjutsu);
    properties.setInteger("Summoning", this.Summoning);
    properties.setInteger("Affiliation", this.Affiliation);
    properties.setInteger("Land", this.Land);
    properties.setBoolean("DrunkenFist", this.DrunkenFist);
    properties.setBoolean("TaijutsuMode", this.TaijutsuMode);
    properties.setInteger("Level", this.Level);
    properties.setInteger("ChakraExperience", this.ChakraExperience);
    properties.setInteger("SkillPoints", this.SkillPoints);
    properties.setInteger("WindRelease", this.WindRelease);
    properties.setInteger("FireRelease", this.FireRelease);
    properties.setInteger("WaterRelease", this.WaterRelease);
    properties.setInteger("LightningRelease", this.LightningRelease);
    properties.setInteger("EarthRelease", this.EarthRelease);
    properties.setInteger("yinrelease", this.yinrelease);
    properties.setInteger("yangrelease", this.yangrelease);
    properties.setInteger("yinyangrelease", this.yinyangrelease);
    properties.setInteger("woodRelease", this.woodRelease);
    properties.setInteger("lavaRelease", this.lavaRelease);
    properties.setInteger("scorchRelease", this.scorchRelease);
    properties.setInteger("boilRelease", this.boilRelease);
    properties.setInteger("magnetRelease", this.magnetRelease);
    properties.setInteger("stormRelease", this.stormRelease);
    properties.setInteger("iceRelease", this.iceRelease);
    properties.setInteger("explosionRelease", this.explosionRelease);
    properties.setInteger("steelRelease", this.steelRelease);
    properties.setInteger("crystalRelease", this.crystalRelease);
    properties.setInteger("dustRelease", this.dustRelease);
    properties.setInteger("shikotsumyaku", this.shikotsumyaku);
    properties.setInteger("byakugan", this.byakugan);
    properties.setInteger("tenseigan", this.tenseigan);
    properties.setInteger("sharinganicon", this.sharinganicon);
    properties.setInteger("mangekyouSharingan", this.mangekyouSharingan);
    properties.setInteger("rinnegan", this.rinnegan);
    properties.setBoolean("SharinganActive", this.SharinganActive);
    properties.setBoolean("ByakuganActive", this.ByakuganActive);
    properties.setBoolean("CurseSealActive", this.CurseSealActive);
    properties.setInteger("SusanoActive", this.SusanoActive);
    properties.setBoolean("SusanoTransformed", this.SusanoTransformed);
    properties.setBoolean("SusanoA", this.SusanoA);
    properties.setInteger("Izanagi", this.Izanagi);
    properties.setBoolean("LavaChakraMode", this.LavaChakraMode);
    properties.setBoolean("ChakraControl", this.ChakraControl);
    properties.setInteger("DQuests", this.DQuests);
    properties.setInteger("CQuests", this.CQuests);
    properties.setInteger("BQuests", this.BQuests);
    properties.setInteger("AQuests", this.AQuests);
    properties.setInteger("SQuests", this.SQuests);
    properties.setInteger("SSQuests", this.SSQuests);
    properties.setInteger("Iburi", this.Iburi);
    properties.setInteger("Kurama", this.Kurama);
    properties.setInteger("CurseSeal", this.CurseSeal);
    properties.setBoolean("CurseSealTransformed", this.CurseSealTransformed);
    properties.setBoolean("BijuuTransformed", this.BijuuTransformed);
    properties.setBoolean("BijuuFormActive", this.BijuuFormActive);
    properties.setInteger("BijuuTransformTexture", this.BijuuTransformTexture);
    properties.setInteger("BijuuTransformModel", this.BijuuTransformModel);
    properties.setInteger("BijuuScale", this.BijuuScale);
    properties.setDouble("Size", this.Size);
    properties.setInteger("JutsuPoints", this.JutsuPoints);
    properties.setInteger("BijuuKind", this.BijuuKind);
    properties.setInteger("KenjutsuSkills", this.KenjutsuSkills);
    properties.setInteger("Storyline", this.Storyline);
    properties.setInteger("ByakuganSize", this.ByakuganSize);
    properties.setBoolean("SixPaths", this.SixPaths);
    properties.setInteger("Ketsuryugan", this.Ketsuryugan);
    properties.setBoolean("KetsuryuganActive", this.KetsuryuganActive);
    properties.setInteger("CurseSize", this.CurseSize);
    properties.setInteger("SusanoSize", this.SusanoSize);
    properties.setInteger("SageVersion", this.SageVersion);
    properties.setBoolean("SageActive", this.SageActive);
    properties.setInteger("DeathPossession", this.DeathPossession);
    properties.setDouble("SharinganUnlock", this.SharinganUnlock);
    properties.setDouble("BijuuUnlock", this.BijuuUnlock);
    properties.setDouble("SharinganSize", this.SharinganSize);
    properties.setInteger("EightGatesStage", this.EightGatesStage);
    properties.setInteger("Byakugou", this.Byakugou);
    properties.setInteger("Jougan", this.Jougan);
    properties.setInteger("KarmaSealType", this.KarmaSealType);
    properties.setInteger("KarmaSealSize", this.KarmaSealSize);
    properties.setBoolean("JouganActive", this.JouganActive);
    properties.setBoolean("KarmaSealActive", this.KarmaSealActive);
    properties.setBoolean("SixPathsMode", this.SixPathsMode);
    properties.setInteger("SixPathsOrbs", this.SixPathsOrbs);
    properties.setBoolean("SixPathsShield", this.SixPathsShield);
    properties.setBoolean("SixPathsSage", this.sixpathssage);
    properties.setBoolean("SixPathsState", this.sixpathsstate);
    properties.setBoolean("nekomode", this.nekomode);
    compound.setTag("ChakraPlayer", (NBTBase)properties);
  }
  
  public final void loadNBTData(NBTTagCompound compound) {
    NBTTagCompound properties = (NBTTagCompound)compound.getTag("ChakraPlayer");
    this.player.getDataWatcher().updateObject(23, Integer.valueOf(properties.getInteger("CurrentMana")));
    this.maxMana = properties.getInteger("MaxMana");
    this.manaRegenTimer = properties.getInteger("ManaRegenTimer");
    this.player.getDataWatcher().updateObject(24, Integer.valueOf(properties.getInteger("CurrentSenjutsu")));
    this.maxSenjutsu = properties.getInteger("MaxSenjutsu");
    this.senjutsuRegenTimer = properties.getInteger("SenjutsuRegenTimer");
    this.Sharingan = properties.getInteger("Sharingan");
    this.BijuuTexture = properties.getInteger("BijuuTexture");
    this.BijuuModel = properties.getInteger("BijuuModel");
    this.BijuuCurseSealTexture = properties.getInteger("BijuuCurseSealTexture");
    this.BijuuCurseSealModel = properties.getInteger("BijuuCurseSealModel");
    this.isTransformed = properties.getBoolean("IsTransformed");
    this.trackAll = properties.getBoolean("TrackAll");
    this.gotBook = properties.getBoolean("GotBook");
    this.got1500Present = properties.getBoolean("got1500Present");
    this.got5000Present = properties.getBoolean("got5000Present");
    this.health = properties.getInteger("health");
    this.Kenjutsu = properties.getDouble("Kenjutsu");
    this.Taijutsu = properties.getDouble("Taijutsu");
    this.Genjutsu = properties.getInteger("Genjutsu");
    this.Speed = properties.getDouble("Speed");
    this.Intelligence = properties.getInteger("Intelligence");
    this.Clan = properties.getInteger("Clan");
    this.Rank = properties.getInteger("Rank");
    this.Jinchuriki = properties.getInteger("Jinchuriki");
    this.Kinjutsu = properties.getInteger("Kinjutsu");
    this.SageMode = properties.getBoolean("SageMode");
    this.Ninjutsu = properties.getInteger("Ninjutsu");
    this.Senjutsu = properties.getInteger("Senjutsu");
    this.Shurikenjutsu = properties.getInteger("Shurikenjutsu");
    this.Summoning = properties.getInteger("Summoning");
    this.Affiliation = properties.getInteger("Affiliation");
    this.Land = properties.getInteger("Land");
    this.DrunkenFist = properties.getBoolean("DrunkenFist");
    this.TaijutsuMode = properties.getBoolean("TaijutsuMode");
    this.Level = properties.getInteger("Level");
    this.ChakraExperience = properties.getInteger("ChakraExperience");
    this.SkillPoints = properties.getInteger("SkillPoints");
    this.WindRelease = properties.getInteger("WindRelease");
    this.FireRelease = properties.getInteger("FireRelease");
    this.WaterRelease = properties.getInteger("WaterRelease");
    this.LightningRelease = properties.getInteger("LightningRelease");
    this.EarthRelease = properties.getInteger("EarthRelease");
    this.yinrelease = properties.getInteger("yinrelease");
    this.yangrelease = properties.getInteger("yangrelease");
    this.yinyangrelease = properties.getInteger("yinyangrelease");
    this.woodRelease = properties.getInteger("woodRelease");
    this.lavaRelease = properties.getInteger("lavaRelease");
    this.scorchRelease = properties.getInteger("scorchRelease");
    this.boilRelease = properties.getInteger("boilRelease");
    this.magnetRelease = properties.getInteger("magnetRelease");
    this.stormRelease = properties.getInteger("stormRelease");
    this.iceRelease = properties.getInteger("iceRelease");
    this.explosionRelease = properties.getInteger("explosionRelease");
    this.steelRelease = properties.getInteger("steelRelease");
    this.crystalRelease = properties.getInteger("crystalRelease");
    this.dustRelease = properties.getInteger("dustRelease");
    this.shikotsumyaku = properties.getInteger("shikotsumyaku");
    this.byakugan = properties.getInteger("byakugan");
    this.tenseigan = properties.getInteger("tenseigan");
    this.sharinganicon = properties.getInteger("sharinganicon");
    this.mangekyouSharingan = properties.getInteger("mangekyouSharingan");
    this.rinnegan = properties.getInteger("rinnegan");
    this.SharinganActive = properties.getBoolean("SharinganActive");
    this.ByakuganActive = properties.getBoolean("ByakuganActive");
    this.CurseSealActive = properties.getBoolean("CurseSealActive");
    this.SusanoActive = properties.getInteger("SusanoActive");
    this.SusanoTransformed = properties.getBoolean("SusanoTransformed");
    this.SusanoA = properties.getBoolean("SusanoA");
    this.Izanagi = properties.getInteger("Izanagi");
    this.LavaChakraMode = properties.getBoolean("LavaChakraMode");
    this.ChakraControl = properties.getBoolean("ChakraControl");
    this.DQuests = properties.getInteger("DQuests");
    this.CQuests = properties.getInteger("CQuests");
    this.BQuests = properties.getInteger("BQuests");
    this.AQuests = properties.getInteger("AQuests");
    this.SQuests = properties.getInteger("SQuests");
    this.SSQuests = properties.getInteger("SSQuests");
    this.Iburi = properties.getInteger("Iburi");
    this.Kurama = properties.getInteger("Kurama");
    this.CurseSeal = properties.getInteger("CurseSeal");
    this.CurseSealTransformed = properties.getBoolean("CurseSealTransformed");
    this.BijuuTransformed = properties.getBoolean("BijuuTransformed");
    this.BijuuFormActive = properties.getBoolean("BijuuFormActive");
    this.BijuuTransformTexture = properties.getInteger("BijuuTransformTexture");
    this.BijuuTransformModel = properties.getInteger("BijuuTransformModel");
    this.BijuuScale = properties.getInteger("BijuuScale");
    this.Size = properties.getDouble("Size");
    this.JutsuPoints = properties.getInteger("JutsuPoints");
    this.BijuuKind = properties.getInteger("BijuuKind");
    this.KenjutsuSkills = properties.getInteger("KenjutsuSkills");
    this.Storyline = properties.getInteger("Storyline");
    this.ByakuganSize = properties.getInteger("ByakuganSize");
    this.SixPaths = properties.getBoolean("SixPaths");
    this.Ketsuryugan = properties.getInteger("Ketsuryugan");
    this.KetsuryuganActive = properties.getBoolean("KetsuryuganActive");
    this.CurseSize = properties.getInteger("CurseSize");
    this.SusanoSize = properties.getInteger("SusanoSize");
    this.SageVersion = properties.getInteger("SageVersion");
    this.SageActive = properties.getBoolean("SageActive");
    this.DeathPossession = properties.getInteger("DeathPossession");
    this.SharinganUnlock = properties.getDouble("SharinganUnlock");
    this.BijuuUnlock = properties.getDouble("BijuuUnlock");
    this.SharinganSize = properties.getDouble("SharinganSize");
    this.EightGatesStage = properties.getInteger("EightGatesStage");
    this.Byakugou = properties.getInteger("Byakugou");
    this.Jougan = properties.getInteger("Jougan");
    this.KarmaSealType = properties.getInteger("KarmaSealType");
    this.KarmaSealSize = properties.getInteger("KarmaSealSize");
    this.JouganActive = properties.getBoolean("JouganActive");
    this.KarmaSealActive = properties.getBoolean("KarmaSealActive");
    this.SixPathsMode = properties.getBoolean("SixPathsMode");
    this.SixPathsOrbs = properties.getInteger("SixPathsOrbs");
    this.SixPathsShield = properties.getBoolean("SixPathsShield");
    this.sixpathssage = properties.getBoolean("SixPathsSage");
    this.sixpathsstate = properties.getBoolean("SixPathsState");
    this.nekomode = properties.getBoolean("nekomode");
  }
  
  private static final String getSaveKey(EntityPlayer player) {
    return player.getCommandSenderName() + ":ChakraPlayer";
  }
  
  public static final void loadProxyData(EntityPlayer player) {
    ExtendedPlayer playerData = get(player);
    NBTTagCompound savedData = ServerProxy.getEntityData(getSaveKey(player));
    if (savedData != null)
      playerData.loadNBTData(savedData); 
    PacketDispatcher.sendTo(new SyncPlayerPropsMessage(player), (EntityPlayerMP)player);
  }
  
  public void init(Entity entity, World world) {}
  
  public void onUpdate() {
    if (!this.player.worldObj.isRemote) {
      if (this.Ninjutsu != this.maxMana || this.Senjutsu != this.maxSenjutsu) {
        this.maxMana = this.Ninjutsu;
        this.maxSenjutsu = this.Senjutsu;
        PacketDispatcher.sendTo(new SyncPlayerPropsMessage(this.player), (EntityPlayerMP)this.player);
      } 
      if (updateManaTimer()) {
        if (getCurrentMana() < getMaxMana())
          regenMana(2); 
        if (this.player.dimension == 35) {
          consumeMana(4);
          if (getCurrentMana() <= 1)
            this.player.travelToDimension(0); 
        } 
      } 
      if (!getCurseSealActive() && !getSageActive() && updateSenjutsuTimer())
        if (getClanName().contains("Jugo")) {
          regenSenjutsu(2);
        } else {
          regenSenjutsu(1);
        }  
      if (getCurseSealActive() && this.player.worldObj.getWorldTime() % 100L == 0L)
        consumeSenjutsu(3); 
      if (getSageActive() && this.player.worldObj.getWorldTime() % 40L == 0L)
        consumeSenjutsu(3); 
      if (this.ChakraExperience < 1 + getLevel() / 4) {
        if (this.ChakraExperience <= 0)
          this.ChakraExperience = 0; 
      } else {
        setLevel(getLevel() + 1);
        PacketDispatcher.sendTo((IMessage)new SyncLevelMessage(this.player), (EntityPlayerMP)this.player);
        int i = getLevel() / 250;
        int origjp = getJutsuPoints();
        int origsp = getSkillPoints();
        if (getLevel() % 5 == 0) {
          setJutsuPoints(getJutsuPoints() + i + 3);
          PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(this.player), (EntityPlayerMP)this.player);
          setSkillPoints(getSkillPoints() + i + 3);
          PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage(this.player), (EntityPlayerMP)this.player);
        } else {
          setJutsuPoints(getJutsuPoints() + i + 1);
          PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(this.player), (EntityPlayerMP)this.player);
          setSkillPoints(getSkillPoints() + i + 1);
          PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage(this.player), (EntityPlayerMP)this.player);
        } 
        this.ChakraExperience -= 1 + (getLevel() - 1) / 4;
        PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(this.player), (EntityPlayerMP)this.player);
        this.player.addChatComponentMessage((IChatComponent)new ChatComponentText("You reached Level " + getLevel() + ". Rewards: +" + (getSkillPoints() - origsp) + " SP and +" + (getJutsuPoints() - origjp) + " JP."));
      } 
      if (getSharinganActive())
        if (getClan() == 1) {
          if (getSharingan() == 1) {
            if (this.player.worldObj.getWorldTime() % 100L == 0L)
              consumeMana(3); 
          } else if (getSharingan() == 2) {
            if (this.player.worldObj.getWorldTime() % 200L == 0L)
              consumeMana(3); 
          } else if (getSharingan() == 3 && getSharinganSize() == 0.0D) {
            if (this.player.worldObj.getWorldTime() % 400L == 0L)
              consumeMana(3); 
          } else if (getSharingan() >= 3 && getSharinganSize() == 1.0D && this.player.worldObj.getWorldTime() % 1000L == 0L) {
            consumeMana(3);
          } 
        } else {
          if (getSharingan() == 1 && this.player.worldObj.getWorldTime() % 45L == 0L)
            consumeMana(3); 
          if (getSharingan() == 2 && this.player.worldObj.getWorldTime() % 80L == 0L)
            consumeMana(3); 
          if (getSharingan() == 3 && getSharinganSize() == 0.0D && this.player.worldObj.getWorldTime() % 150L == 0L)
            consumeMana(3); 
          if (getSharingan() >= 4 && getSharinganSize() == 1.0D && this.player.worldObj.getWorldTime() % 500L == 0L)
            consumeMana(3); 
        }  
      if (getKetsuryuganActive())
        if (getClan() == 23) {
          if (this.player.worldObj.getWorldTime() % 500L == 0L)
            consumeMana(3); 
        } else if (this.player.worldObj.getWorldTime() % 250L == 0L) {
          consumeMana(3);
        }  
    } 
  }
  
  private boolean updateManaTimer() {
    if (!getSharinganActive() && !getByakuganActive()) {
      if (this.manaRegenTimer > 0)
        this.manaRegenTimer--; 
      if (this.manaRegenTimer == 0) {
        this.manaRegenTimer = 20;
        return true;
      } 
    } 
    return false;
  }
  
  public final void regenMana(int amount) {
    setCurrentMana(getCurrentMana() + amount);
  }
  
  public final void fixLimitStats() {
    if (this.Taijutsu > 11.02D)
      this.Taijutsu = 11.02D; 
    if (this.Genjutsu > 200)
      this.Genjutsu = 200; 
    if (this.Shurikenjutsu > 100)
      this.Shurikenjutsu = 100; 
    if (this.Summoning > 300)
      this.Summoning = 300; 
    if (this.Kinjutsu > 100)
      this.Kinjutsu = 100; 
    if (this.Senjutsu > 2995)
      this.Senjutsu = 2995; 
    if (this.health > 500)
      this.health = 500; 
    if (this.Speed > 0.205D)
      this.Speed = 0.205D; 
  }
  
  public final boolean consumeMana(int amount) {
    int mana = this.player.getDataWatcher().getWatchableObjectInt(23);
    boolean sufficient = (amount <= mana);
    this.player.getDataWatcher().updateObject(23, Integer.valueOf(mana - ((amount < mana) ? amount : mana)));
    return sufficient;
  }
  
  public final void replenishMana() {
    this.player.getDataWatcher().updateObject(23, Integer.valueOf(this.maxMana));
  }
  
  public final int getCurrentMana() {
    return this.player.getDataWatcher().getWatchableObjectInt(23);
  }
  
  public final void setCurrentMana(int amount) {
    this.player.getDataWatcher().updateObject(23, Integer.valueOf((amount > 0) ? ((amount < this.maxMana) ? amount : this.maxMana) : 0));
  }
  
  public final int getMaxMana() {
    return this.maxMana;
  }
  
  public final void setMaxMana(int amount) {
    this.maxMana = (amount > 0) ? amount : 0;
    PacketDispatcher.sendTo(new SyncPlayerPropsMessage(this.player), (EntityPlayerMP)this.player);
  }
  
  public void MatchMaxMana() {
    this.maxMana = this.Intelligence;
    PacketDispatcher.sendTo(new SyncPlayerPropsMessage(this.player), (EntityPlayerMP)this.player);
  }
  
  private boolean updateSenjutsuTimer() {
    if (this.senjutsuRegenTimer > 0)
      this.senjutsuRegenTimer--; 
    if (this.senjutsuRegenTimer == 0) {
      this.senjutsuRegenTimer = (getCurrentSenjutsu() < getMaxSenjutsu()) ? 20 : 0;
      return true;
    } 
    return false;
  }
  
  public final void regenSenjutsu(int amount) {
    if (!getCurseSealActive())
      setCurrentSenjutsu(getCurrentSenjutsu() + amount); 
  }
  
  public final boolean consumeSenjutsu(int amount) {
    int senjutsu = this.player.getDataWatcher().getWatchableObjectInt(24);
    boolean sufficient = (amount <= senjutsu);
    this.player.getDataWatcher().updateObject(24, Integer.valueOf(senjutsu - ((amount < senjutsu) ? amount : senjutsu)));
    return sufficient;
  }
  
  public final void replenishSenjutsu() {
    this.player.getDataWatcher().updateObject(24, Integer.valueOf(this.maxSenjutsu));
  }
  
  public final int getCurrentSenjutsu() {
    return this.player.getDataWatcher().getWatchableObjectInt(24);
  }
  
  public final void setCurrentSenjutsu(int amount) {
    this.player.getDataWatcher().updateObject(24, Integer.valueOf((amount > 0) ? ((amount < this.maxSenjutsu) ? amount : this.maxSenjutsu) : 0));
  }
  
  public final int getMaxSenjutsu() {
    return this.maxSenjutsu;
  }
  
  public final void setMaxSenjutsu(int amount) {
    this.maxSenjutsu = (amount > 0) ? amount : 0;
    PacketDispatcher.sendTo(new SyncPlayerPropsMessage(this.player), (EntityPlayerMP)this.player);
  }
  
  public void MatchMaxSenjutsu() {
    this.maxSenjutsu = this.Intelligence;
    PacketDispatcher.sendTo(new SyncPlayerPropsMessage(this.player), (EntityPlayerMP)this.player);
  }
  
  public int getCurseSealTexture() {
    return this.BijuuCurseSealTexture;
  }
  
  public void setCurseSealTexture(int i) {
    this.BijuuCurseSealTexture = 0;
  }
  
  public void setCurseSealTexture(int i, Side side) {
    this.BijuuCurseSealTexture = 0;
    if (side.isServer()) {
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public String getCurseSealTextureName() {
    return (this.BijuuCurseSealTexture == 0) ? "Killerwolf" : "Killerwolf";
  }
  
  public int getCurseSealModel() {
    return this.BijuuCurseSealModel;
  }
  
  public void setCurseSealModel(int i) {
    this.BijuuCurseSealModel = i;
  }
  
  public void setCurseSealModel(int i, Side side) {
    this.BijuuCurseSealModel = i;
    if (side.isServer()) {
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public String getCurseSealModelName() {
    if (this.BijuuCurseSealModel == 0)
      return StatCollector.translateToLocal("werewolf.menu.model.normal"); 
    return (this.BijuuCurseSealModel == 1) ? StatCollector.translateToLocal("werewolf.menu.model.wolf") : "Error";
  }
  
  public int getBijuuTexture() {
    return this.BijuuTransformTexture;
  }
  
  public void setBijuuTexture(int i) {
    this.BijuuTransformTexture = 0;
  }
  
  public void setBijuuTexture(int i, Side side) {
    this.BijuuTransformTexture = 0;
    if (side.isServer()) {
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public String getBijuuTextureName() {
    return (this.BijuuTransformTexture == 0) ? "Killerwolf" : "Killerwolf";
  }
  
  public int getBijuuModel() {
    return this.BijuuTransformModel;
  }
  
  public void setBijuuModel(int i) {
    this.BijuuTransformModel = i;
  }
  
  public void setBijuuModel(int i, Side side) {
    this.BijuuTransformModel = i;
    if (side.isServer()) {
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public String getBijuuModelName() {
    if (this.BijuuTransformModel == 0)
      return StatCollector.translateToLocal("werewolf.menu.model.normal"); 
    return (this.BijuuTransformModel == 1) ? StatCollector.translateToLocal("werewolf.menu.model.wolf") : "Error";
  }
  
  public boolean getTransformed() {
    return this.isTransformed;
  }
  
  public boolean getPreventTransform() {
    return this.preventTransform;
  }
  
  public void setPreventTransform(boolean set) {
    this.preventTransform = set;
  }
  
  public void tryTransformed() {
    if (this.isTransformed) {
      this.isTransformed = false;
      PacketDispatcher.sendTo((IMessage)new SyncTransformMessage(this.player), (EntityPlayerMP)this.player);
    } else if (!this.preventTransform) {
      this.isTransformed = true;
      PacketDispatcher.sendTo((IMessage)new SyncTransformMessage(this.player), (EntityPlayerMP)this.player);
    } 
    Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
    PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
  }
  
  public void setTransformed(boolean state, Side side) {
    boolean temp = this.isTransformed;
    this.isTransformed = state;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncTransformMessage(this.player), (EntityPlayerMP)this.player);
      if ((state && !temp) || state || !temp);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public void setTransformedServer(boolean state) {
    boolean temp = this.isTransformed;
    this.isTransformed = state;
    PacketDispatcher.sendTo((IMessage)new SyncTransformMessage(this.player), (EntityPlayerMP)this.player);
    if ((state && !temp) || state || !temp);
    Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
    PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
  }
  
  public boolean getSusanoTransformed() {
    return this.SusanoTransformed;
  }
  
  public void trySusanoTransformed() {
    if (this.SusanoTransformed) {
      this.SusanoTransformed = false;
      if (this.player.isPotionActive(Potion.nightVision.id) && this.player.getActivePotionEffect(Potion.nightVision).getDuration() < 311)
        this.player.removePotionEffect(Potion.nightVision.id); 
      PacketDispatcher.sendTo((IMessage)new SyncSusanoTransformMessage(this.player), (EntityPlayerMP)this.player);
    } else {
      this.SusanoTransformed = true;
      PacketDispatcher.sendTo((IMessage)new SyncSusanoTransformMessage(this.player), (EntityPlayerMP)this.player);
    } 
    Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
    PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
  }
  
  public void setSusanoTransformed(boolean state, Side side) {
    boolean temp = this.SusanoTransformed;
    this.SusanoTransformed = state;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSusanoTransformMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getCurseSealTransformed() {
    return this.CurseSealTransformed;
  }
  
  public void tryCurseSealTransformed() {
    if (this.CurseSealTransformed) {
      this.CurseSealTransformed = false;
      if (this.player.isPotionActive(Potion.nightVision.id) && this.player.getActivePotionEffect(Potion.nightVision).getDuration() < 311)
        this.player.removePotionEffect(Potion.nightVision.id); 
      PacketDispatcher.sendTo((IMessage)new SyncCurseSealTransformMessage(this.player), (EntityPlayerMP)this.player);
    } else {
      this.CurseSealTransformed = true;
      PacketDispatcher.sendTo((IMessage)new SyncCurseSealTransformMessage(this.player), (EntityPlayerMP)this.player);
    } 
    Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
    PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
  }
  
  public void setCurseSealTransformed(boolean state, Side side) {
    boolean temp = this.CurseSealTransformed;
    this.CurseSealTransformed = state;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncCurseSealTransformMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getBijuuTransformed() {
    return this.BijuuTransformed;
  }
  
  public void tryBijuuTransformed() {
    if (this.BijuuTransformed) {
      this.BijuuTransformed = false;
      if (this.player.isPotionActive(Potion.nightVision.id) && this.player.getActivePotionEffect(Potion.nightVision).getDuration() < 311)
        this.player.removePotionEffect(Potion.nightVision.id); 
      PacketDispatcher.sendTo((IMessage)new SyncBijuuTransformMessage(this.player), (EntityPlayerMP)this.player);
    } else {
      this.BijuuTransformed = true;
      PacketDispatcher.sendTo((IMessage)new SyncBijuuTransformMessage(this.player), (EntityPlayerMP)this.player);
    } 
    Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
    PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
  }
  
  public void setBijuuTransformed(boolean state, Side side) {
    boolean temp = this.BijuuTransformed;
    this.BijuuTransformed = state;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncBijuuTransformMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getBijuuScale() {
    return this.BijuuScale;
  }
  
  public void setBijuuScale(int d) {
    this.BijuuScale = d;
  }
  
  public void setBijuuScale(int d, Side side) {
    this.BijuuScale = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncBijuuScaleMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public double getSize() {
    return this.Size;
  }
  
  public void setSize(double d) {
    this.Size = d;
  }
  
  public void setSize(double d, Side side) {
    this.Size = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSizeMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public double getSharinganSize() {
    return this.SharinganSize;
  }
  
  public void setSharinganSize(double d) {
    this.SharinganSize = d;
  }
  
  public void setSharinganSize(double d, Side side) {
    this.SharinganSize = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSharinganSizeMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getHealth() {
    return this.health;
  }
  
  public void setHealth(int i) {
    this.health = i;
  }
  
  public void setHealth(int i, Side side) {
    this.health = i;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncHealthMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public double getSpeed() {
    return this.Speed;
  }
  
  public void setSpeed(double d) {
    this.Speed = d;
  }
  
  public void setSpeed(double d, Side side) {
    this.Speed = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSpeedMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public double getKenjutsu() {
    return this.Kenjutsu;
  }
  
  public void setKenjutsu(double d) {
    this.Kenjutsu = d;
  }
  
  public void setKenjutsu(double d, Side side) {
    this.Kenjutsu = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncKenjutsuMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public double getTaijutsu() {
    return this.Taijutsu;
  }
  
  public void setTaijutsu(double d) {
    this.Taijutsu = d;
  }
  
  public void setTaijutsu(double d, Side side) {
    this.Taijutsu = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncTaijutsuMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getGenjutsu() {
    return this.Genjutsu;
  }
  
  public void setGenjutsu(int d) {
    this.Genjutsu = d;
  }
  
  public void setGenjutsu(int d, Side side) {
    this.Genjutsu = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncGenjutsuMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getIntelligence() {
    return this.Intelligence;
  }
  
  public void setIntelligence(int d) {
    this.Intelligence = d;
  }
  
  public void setIntelligence(int d, Side side) {
    this.Intelligence = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncIntelligenceMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getKinjutsu() {
    return this.Kinjutsu;
  }
  
  public void setKinjutsu(int d) {
    this.Kinjutsu = d;
  }
  
  public void setKinjutsu(int d, Side side) {
    this.Kinjutsu = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncKinjutsuMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getSageMode() {
    return this.SageMode;
  }
  
  public void setSageMode(boolean d) {
    this.SageMode = d;
  }
  
  public void setSageMode(boolean d, Side side) {
    this.SageMode = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSageModeMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getDrunkenFist() {
    return this.DrunkenFist;
  }
  
  public void setDrunkenFist(boolean d) {
    this.DrunkenFist = d;
  }
  
  public void setDrunkenFist(boolean d, Side side) {
    this.DrunkenFist = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncDrunkenFistMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getIzanagi() {
    return this.Izanagi;
  }
  
  public void setIzanagi(int d) {
    this.Izanagi = d;
  }
  
  public void setIzanagi(int d, Side side) {
    this.Izanagi = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncIzanagiMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getIburi() {
    return this.Iburi;
  }
  
  public void setIburi(int d) {
    this.Iburi = d;
  }
  
  public void setIburi(int d, Side side) {
    this.Iburi = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncIburiMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getKurama() {
    return this.Kurama;
  }
  
  public void setKurama(int d) {
    this.Kurama = d;
  }
  
  public void setKurama(int d, Side side) {
    this.Kurama = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncKuramaMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getClan() {
    return this.Clan;
  }
  
  public void setClan(int d) {
    this.Clan = d;
  }
  
  public void setClan(int d, Side side) {
    this.Clan = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncClanMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getRank() {
    return this.Rank;
  }
  
  public void setRank(int d) {
    this.Rank = d;
  }
  
  public void setRank(int d, Side side) {
    this.Rank = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncRankMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getNinjutsu() {
    return this.Ninjutsu;
  }
  
  public void setNinjutsu(int d) {
    this.Ninjutsu = d;
  }
  
  public void setNinjutsu(int d, Side side) {
    this.Ninjutsu = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncNinjutsuMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getSenjutsu() {
    return this.Senjutsu;
  }
  
  public void setSenjutsu(int d) {
    this.Senjutsu = d;
  }
  
  public void setSenjutsu(int d, Side side) {
    this.Senjutsu = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSenjutsuMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getWindRelease() {
    return this.WindRelease;
  }
  
  public void setWindRelease(int d) {
    this.WindRelease = d;
  }
  
  public void setWindRelease(int d, Side side) {
    this.WindRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncWindReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getFireRelease() {
    return this.FireRelease;
  }
  
  public void setFireRelease(int d) {
    this.FireRelease = d;
  }
  
  public void setFireRelease(int d, Side side) {
    this.FireRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncFireReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getWaterRelease() {
    return this.WaterRelease;
  }
  
  public void setWaterRelease(int d) {
    this.WaterRelease = d;
  }
  
  public void setWaterRelease(int d, Side side) {
    this.WaterRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncWaterReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getLightningRelease() {
    return this.LightningRelease;
  }
  
  public void setLightningRelease(int d) {
    this.LightningRelease = d;
  }
  
  public void setLightningRelease(int d, Side side) {
    this.LightningRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncLightningReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getEarthRelease() {
    return this.EarthRelease;
  }
  
  public void setEarthRelease(int d) {
    this.EarthRelease = d;
  }
  
  public void setEarthRelease(int d, Side side) {
    this.EarthRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncEarthReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getYinRelease() {
    return this.yinrelease;
  }
  
  public void setYinRelease(int d) {
    this.yinrelease = d;
  }
  
  public void setYinRelease(int d, Side side) {
    this.yinrelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncYinReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getYinyangRelease() {
    return this.yinyangrelease;
  }
  
  public void setYinyangRelease(int d) {
    this.yinyangrelease = d;
  }
  
  public void setYinyangRelease(int d, Side side) {
    this.yinyangrelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncYinyangReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getYangRelease() {
    return this.yangrelease;
  }
  
  public void setYangRelease(int d) {
    this.yangrelease = d;
  }
  
  public void setYangRelease(int d, Side side) {
    this.yangrelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncYangReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getwoodRelease() {
    return this.woodRelease;
  }
  
  public void setwoodRelease(int d) {
    this.woodRelease = d;
  }
  
  public void setwoodRelease(int d, Side side) {
    this.woodRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncwoodReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getlavaRelease() {
    return this.lavaRelease;
  }
  
  public void setlavaRelease(int d) {
    this.lavaRelease = d;
  }
  
  public void setlavaRelease(int d, Side side) {
    this.lavaRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SynclavaReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getscorchRelease() {
    return this.scorchRelease;
  }
  
  public void setscorchRelease(int d) {
    this.scorchRelease = d;
  }
  
  public void setscorchRelease(int d, Side side) {
    this.scorchRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncscorchReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getboilRelease() {
    return this.boilRelease;
  }
  
  public void setboilRelease(int d) {
    this.boilRelease = d;
  }
  
  public void setboilRelease(int d, Side side) {
    this.boilRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncboilReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getmagnetRelease() {
    return this.magnetRelease;
  }
  
  public void setmagnetRelease(int d) {
    this.magnetRelease = d;
  }
  
  public void setmagnetRelease(int d, Side side) {
    this.magnetRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncmagnetReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getstormRelease() {
    return this.stormRelease;
  }
  
  public void setstormRelease(int d) {
    this.stormRelease = d;
  }
  
  public void setstormRelease(int d, Side side) {
    this.stormRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncstormReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int geticeRelease() {
    return this.iceRelease;
  }
  
  public void seticeRelease(int d) {
    this.iceRelease = d;
  }
  
  public void seticeRelease(int d, Side side) {
    this.iceRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SynciceReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getexplosionRelease() {
    return this.explosionRelease;
  }
  
  public void setexplosionRelease(int d) {
    this.explosionRelease = d;
  }
  
  public void setexplosionRelease(int d, Side side) {
    this.explosionRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncexplosionReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getsteelRelease() {
    return this.steelRelease;
  }
  
  public void setsteelRelease(int d) {
    this.steelRelease = d;
  }
  
  public void setsteelRelease(int d, Side side) {
    this.steelRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncsteelReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getcrystalRelease() {
    return this.crystalRelease;
  }
  
  public void setcrystalRelease(int d) {
    this.crystalRelease = d;
  }
  
  public void setcrystalRelease(int d, Side side) {
    this.crystalRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SynccrystalReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getKenjutsuSkills() {
    return this.KenjutsuSkills;
  }
  
  public void setKenjutsuSkills(int d) {
    this.KenjutsuSkills = d;
  }
  
  public void setKenjutsuSkills(int d, Side side) {
    this.KenjutsuSkills = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncKenjutsuSkillsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getdustRelease() {
    return this.dustRelease;
  }
  
  public void setdustRelease(int d) {
    this.dustRelease = d;
  }
  
  public void setdustRelease(int d, Side side) {
    this.dustRelease = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncdustReleaseMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getshikotsumyaku() {
    return this.shikotsumyaku;
  }
  
  public void setshikotsumyaku(int d) {
    this.shikotsumyaku = d;
  }
  
  public void setshikotsumyaku(int d, Side side) {
    this.shikotsumyaku = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncshikotsumyakuMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getbyakugan() {
    return this.byakugan;
  }
  
  public void setbyakugan(int d) {
    this.byakugan = d;
  }
  
  public void setbyakugan(int d, Side side) {
    this.byakugan = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncbyakuganMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int gettenseigan() {
    return this.tenseigan;
  }
  
  public void settenseigan(int d) {
    this.tenseigan = d;
  }
  
  public void settenseigan(int d, Side side) {
    this.tenseigan = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SynctenseiganMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getKetsuryugan() {
    return this.Ketsuryugan;
  }
  
  public void setKetsuryugan(int d) {
    this.Ketsuryugan = d;
  }
  
  public void setKetsuryugan(int d, Side side) {
    this.Ketsuryugan = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncKetsuryuganMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getsharinganicon() {
    return this.sharinganicon;
  }
  
  public void setsharinganicon(int d) {
    this.sharinganicon = d;
  }
  
  public void setsharinganicon(int d, Side side) {
    this.sharinganicon = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncsharinganiconMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getmangekyouSharingan() {
    return this.mangekyouSharingan;
  }
  
  public void setmangekyouSharingan(int d) {
    this.mangekyouSharingan = d;
  }
  
  public void setmangekyouSharingan(int d, Side side) {
    this.mangekyouSharingan = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncmangekyouSharinganMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getrinnegan() {
    return this.rinnegan;
  }
  
  public void setrinnegan(int d) {
    this.rinnegan = d;
  }
  
  public void setrinnegan(int d, Side side) {
    this.rinnegan = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncrinneganMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getShurikenjutsu() {
    return this.Shurikenjutsu;
  }
  
  public void setShurikenjutsu(int d) {
    this.Shurikenjutsu = d;
  }
  
  public void setShurikenjutsu(int d, Side side) {
    this.Shurikenjutsu = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncShurikenjutsuMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getSummoning() {
    return this.Summoning;
  }
  
  public void setSummoning(int d) {
    this.Summoning = d;
  }
  
  public void setSummoning(int d, Side side) {
    this.Summoning = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSummoningMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getTaijutsuMode() {
    return this.TaijutsuMode;
  }
  
  public void setTaijutsuMode(boolean d) {
    this.TaijutsuMode = d;
  }
  
  public void setTaijutsuMode(boolean d, Side side) {
    this.TaijutsuMode = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncTaijutsuModeMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getChakraControl() {
    return this.ChakraControl;
  }
  
  public void setChakraControl(boolean d) {
    this.ChakraControl = d;
  }
  
  public void setChakraControl(boolean d, Side side) {
    this.ChakraControl = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncChakraControlMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getSharinganActive() {
    return this.SharinganActive;
  }
  
  public void setSharinganActive(boolean d) {
    this.SharinganActive = d;
  }
  
  public void setSharinganActive(boolean d, Side side) {
    this.SharinganActive = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSharinganActiveMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getKetsuryuganActive() {
    return this.KetsuryuganActive;
  }
  
  public void setKetsuryuganActive(boolean d) {
    this.KetsuryuganActive = d;
  }
  
  public void setKetsuryuganActive(boolean d, Side side) {
    this.KetsuryuganActive = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncKetsuryuganActiveMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getSixPaths() {
    return this.SixPaths;
  }
  
  public void setSixPaths(boolean d) {
    this.SixPaths = d;
  }
  
  public void setSixPaths(boolean d, Side side) {
    this.SixPaths = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSixPathsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getByakuganActive() {
    return this.ByakuganActive;
  }
  
  public void setByakuganActive(boolean d) {
    this.ByakuganActive = d;
  }
  
  public void setByakuganActive(boolean d, Side side) {
    this.ByakuganActive = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncByakuganActiveMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean gettrackAll() {
    return this.trackAll;
  }
  
  public void settrackAll(boolean d) {
    this.trackAll = d;
  }
  
  public void settrackAll(boolean d, Side side) {
    this.trackAll = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SynctrackAllMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getBijuuFormActive() {
    return this.BijuuFormActive;
  }
  
  public void setBijuuFormActive(boolean d) {
    this.BijuuFormActive = d;
  }
  
  public void setBijuuFormActive(boolean d, Side side) {
    this.BijuuFormActive = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncBijuuFormActiveMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getCurseSealActive() {
    return this.CurseSealActive;
  }
  
  public void setCurseSealActive(boolean d) {
    this.CurseSealActive = d;
  }
  
  public void setCurseSealActive(boolean d, Side side) {
    this.CurseSealActive = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncCurseSealActiveMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getSusanoA() {
    return this.SusanoA;
  }
  
  public void setSusanoA(boolean d) {
    this.SusanoA = d;
  }
  
  public void setSusanoA(boolean d, Side side) {
    this.SusanoA = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSusanoAMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getLavaChakraMode() {
    return this.LavaChakraMode;
  }
  
  public void setLavaChakraMode(boolean d) {
    this.LavaChakraMode = d;
  }
  
  public void setLavaChakraMode(boolean d, Side side) {
    this.LavaChakraMode = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncLavaChakraModeMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getSusanoActive() {
    return this.SusanoActive;
  }
  
  public void setSusanoActive(int d) {
    this.SusanoActive = d;
  }
  
  public void setSusanoActive(int d, Side side) {
    this.SusanoActive = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSusanoMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getAffiliation() {
    return this.Affiliation;
  }
  
  public void setAffiliation(int d) {
    this.Affiliation = d;
  }
  
  public void setAffiliation(int d, Side side) {
    this.Affiliation = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncAffiliationMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getLand() {
    return this.Land;
  }
  
  public void setLand(int d) {
    this.Land = d;
  }
  
  public void setLand(int d, Side side) {
    this.Land = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncLandMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getSharingan() {
    return this.Sharingan;
  }
  
  public void setSharingan(int amount) {
    this.Sharingan = amount;
  }
  
  public void setSharingan(int amount, Side side) {
    this.Sharingan = amount;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSharinganMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public double getSharinganUnlock() {
    return this.SharinganUnlock;
  }
  
  public void setSharinganUnlock(double d) {
    this.SharinganUnlock = d;
  }
  
  public void setSharinganUnlock(double d, Side side) {
    this.SharinganUnlock = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSharinganUnlockMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public double getBijuuUnlock() {
    return this.BijuuUnlock;
  }
  
  public void setBijuuUnlock(double d) {
    this.BijuuUnlock = d;
  }
  
  public void setBijuuUnlock(double d, Side side) {
    this.BijuuUnlock = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncBijuuUnlockMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getByakuganSize() {
    return this.ByakuganSize;
  }
  
  public void setByakuganSize(int amount) {
    this.ByakuganSize = amount;
  }
  
  public void setByakuganSize(int amount, Side side) {
    this.ByakuganSize = amount;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncByakuganSizeMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getLevel() {
    return this.Level;
  }
  
  public void setLevel(int d) {
    this.Level = d;
  }
  
  public void setLevel(int d, Side side) {
    this.Level = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncLevelMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getChakraExperience() {
    return this.ChakraExperience;
  }
  
  public void setChakraExperience(int d) {
    this.ChakraExperience = d;
  }
  
  public void setChakraExperience(int d, Side side) {
    this.ChakraExperience = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncChakraExperienceMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getBijuuKind() {
    return this.BijuuKind;
  }
  
  public void setBijuuKind(int d) {
    this.BijuuKind = d;
  }
  
  public void setBijuuKind(int d, Side side) {
    this.BijuuKind = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncBijuuKindMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getDQuests() {
    return this.DQuests;
  }
  
  public void setDQuests(int d) {
    this.DQuests = d;
  }
  
  public void setDQuests(int d, Side side) {
    this.DQuests = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncDQuestsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getCQuests() {
    return this.CQuests;
  }
  
  public void setCQuests(int d) {
    this.CQuests = d;
  }
  
  public void setCQuests(int d, Side side) {
    this.CQuests = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncCQuestsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getBQuests() {
    return this.BQuests;
  }
  
  public void setBQuests(int d) {
    this.BQuests = d;
  }
  
  public void setBQuests(int d, Side side) {
    this.BQuests = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncBQuestsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getAQuests() {
    return this.AQuests;
  }
  
  public void setAQuests(int d) {
    this.AQuests = d;
  }
  
  public void setAQuests(int d, Side side) {
    this.AQuests = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncAQuestsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getSQuests() {
    return this.SQuests;
  }
  
  public void setSQuests(int d) {
    this.SQuests = d;
  }
  
  public void setSQuests(int d, Side side) {
    this.SQuests = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSQuestsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getSSQuests() {
    return this.SSQuests;
  }
  
  public void setSSQuests(int d) {
    this.SSQuests = d;
  }
  
  public void setSSQuests(int d, Side side) {
    this.SSQuests = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSSQuestsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getStoryline() {
    return this.Storyline;
  }
  
  public void setStoryline(int d) {
    this.Storyline = d;
  }
  
  public void setStoryline(int d, Side side) {
    this.Storyline = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncStorylineMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getDeathPossession() {
    return this.DeathPossession;
  }
  
  public void setDeathPossession(int d) {
    this.DeathPossession = d;
  }
  
  public void setDeathPossession(int d, Side side) {
    this.DeathPossession = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncDeathPossessionMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getCurseSeal() {
    return this.CurseSeal;
  }
  
  public void setCurseSeal(int d) {
    this.CurseSeal = d;
  }
  
  public void setCurseSeal(int d, Side side) {
    this.CurseSeal = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncCurseSealMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getCurseSize() {
    return this.CurseSize;
  }
  
  public void setCurseSize(int d) {
    this.CurseSize = d;
  }
  
  public void setCurseSize(int d, Side side) {
    this.CurseSize = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncCurseSizeMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getSageVersion() {
    return this.SageVersion;
  }
  
  public void setSageVersion(int d) {
    this.SageVersion = d;
  }
  
  public void setSageVersion(int d, Side side) {
    this.SageVersion = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSageVersionMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getSageActive() {
    return this.SageActive;
  }
  
  public void setSageActive(boolean d) {
    this.SageActive = d;
  }
  
  public void setSageActive(boolean d, Side side) {
    this.SageActive = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSageActiveMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getSusanoSize() {
    return this.SusanoSize;
  }
  
  public void setSusanoSize(int d) {
    this.SusanoSize = d;
  }
  
  public void setSusanoSize(int d, Side side) {
    this.SusanoSize = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSusanoSizeMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getJutsuPoints() {
    return this.JutsuPoints;
  }
  
  public void setJutsuPoints(int d) {
    this.JutsuPoints = d;
  }
  
  public void setJutsuPoints(int d, Side side) {
    this.JutsuPoints = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncJutsuPointsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getSkillPoints() {
    return this.SkillPoints;
  }
  
  public void setSkillPoints(int d) {
    this.SkillPoints = d;
  }
  
  public void setSkillPoints(int d, Side side) {
    this.SkillPoints = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSkillPointsMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getEightGatesStage() {
    return this.EightGatesStage;
  }
  
  public void setEightGatesStage(int amount) {
    this.EightGatesStage = amount;
  }
  
  public void setEightGatesStage(int amount, Side side) {
    this.EightGatesStage = amount;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncEightGatesStageMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getByakugou() {
    return this.Byakugou;
  }
  
  public void setByakugou(int amount) {
    this.Byakugou = amount;
  }
  
  public void setByakugou(int amount, Side side) {
    this.Byakugou = amount;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncByakugouMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getJougan() {
    return this.Jougan;
  }
  
  public void setJougan(int amount) {
    this.Jougan = amount;
  }
  
  public void setJougan(int amount, Side side) {
    this.Jougan = amount;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncJouganMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getKarmaSealType() {
    return this.KarmaSealType;
  }
  
  public void setKarmaSealType(int amount) {
    this.KarmaSealType = amount;
  }
  
  public void setKarmaSealType(int amount, Side side) {
    this.KarmaSealType = amount;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncKarmaSealTypeMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public int getKarmaSealSize() {
    return this.KarmaSealSize;
  }
  
  public void setKarmaSealSize(int amount) {
    this.KarmaSealSize = amount;
  }
  
  public void setKarmaSealSize(int amount, Side side) {
    this.KarmaSealSize = amount;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncKarmaSealSizeMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getJouganActive() {
    return this.JouganActive;
  }
  
  public void setJouganActive(boolean d) {
    this.JouganActive = d;
  }
  
  public void setJouganActive(boolean d, Side side) {
    this.JouganActive = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncJouganActiveMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getKarmaSealActive() {
    return this.KarmaSealActive;
  }
  
  public void setKarmaSealActive(boolean d) {
    this.KarmaSealActive = d;
  }
  
  public void setKarmaSealActive(boolean d, Side side) {
    this.KarmaSealActive = d;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncKarmaSealActiveMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getSixPathsMode() {
    return this.SixPathsMode;
  }
  
  public void setSixPathsMode(boolean d) {
    this.SixPathsMode = d;
  }
  
  public void setSixPathsMode(boolean d, Side side) {
    this.SixPathsMode = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSixPathsModeMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public int getSixPathsOrbs() {
    return this.SixPathsOrbs;
  }
  
  public void setSixPathsOrbs(int amount) {
    this.SixPathsOrbs = amount;
  }
  
  public void setSixPathsOrbs(int amount, Side side) {
    this.SixPathsOrbs = amount;
    if (side.isServer()) {
      PacketDispatcher.sendTo((IMessage)new SyncSixPathsOrbsMessage(this.player), (EntityPlayerMP)this.player);
      Set players = ((WorldServer)this.player.worldObj).getEntityTracker().getTrackingPlayers((Entity)this.player);
      PacketDispatcher.sendToPlayers(new TrackingMessage(this.player), players);
    } 
  }
  
  public boolean getSixPathsShield() {
    return this.SixPathsShield;
  }
  
  public void setSixPathsShield(boolean d) {
    this.SixPathsShield = d;
  }
  
  public void setSixPathsShield(boolean d, Side side) {
    this.SixPathsShield = d;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSixPathsShieldMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getSixPathsSage() {
    return this.sixpathssage;
  }
  
  public void setSixPathsSage(boolean b) {
    this.sixpathssage = b;
  }
  
  public void setSixPathsSage(boolean b, Side side) {
    this.sixpathssage = b;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSixPathsSageMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public boolean getSixPathsState() {
    return this.sixpathsstate;
  }
  
  public void setSixPathsState(boolean b) {
    this.sixpathsstate = b;
  }
  
  public void setSixPathsState(boolean b, Side side) {
    this.sixpathsstate = b;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncSixPathsStateMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public String getAffiliationName() {
    if (getAffiliation() == 1)
      return "Akatsuki"; 
    if (getAffiliation() == 2)
      return "Amegakure"; 
    if (getAffiliation() == 3)
      return "Getsugakure"; 
    if (getAffiliation() == 4)
      return "Hoshigakure"; 
    if (getAffiliation() == 5)
      return "Ishigakure"; 
    if (getAffiliation() == 6)
      return "Iwagakure"; 
    if (getAffiliation() == 7)
      return "Jomae"; 
    if (getAffiliation() == 8)
      return "Kirigakure"; 
    if (getAffiliation() == 9)
      return "Konohagakure"; 
    if (getAffiliation() == 10)
      return "Kumogakure"; 
    if (getAffiliation() == 11)
      return "kusagakure"; 
    if (getAffiliation() == 12)
      return "nadeshiko"; 
    if (getAffiliation() == 13)
      return "Otogakure"; 
    if (getAffiliation() == 14)
      return "Ryuchi Cave"; 
    if (getAffiliation() == 15)
      return "Shimogakure"; 
    if (getAffiliation() == 16)
      return "Sunagakure"; 
    if (getAffiliation() == 17)
      return "Takigakure"; 
    if (getAffiliation() == 18)
      return "Takumi"; 
    if (getAffiliation() == 19)
      return "Tanigakure"; 
    if (getAffiliation() == 20)
      return "Mount Myoboku"; 
    if (getAffiliation() == 21)
      return "Yugagakure"; 
    if (getAffiliation() == 22)
      return "Yukigakure"; 
    if (getAffiliation() == 23)
      return "Yumegakure"; 
    return (getAffiliation() == 24) ? "Shikotsu" : "N/A";
  }
  
  public String getClanName() {
    if (getClan() == 1)
      return "Uchiha Clan"; 
    if (getClan() == 2)
      return "Uzumaki Clan"; 
    if (getClan() == 3)
      return "Aburame Clan"; 
    if (getClan() == 4)
      return "Akimichi Clan"; 
    if (getClan() == 5)
      return "Hatake Clan"; 
    if (getClan() == 6)
      return "Hozuki Clan"; 
    if (getClan() == 7)
      return "Hyuga Clan"; 
    if (getClan() == 8)
      return "Iburi Clan"; 
    if (getClan() == 9)
      return "Inuzuka Clan"; 
    if (getClan() == 10)
      return "Jugo Clan"; 
    if (getClan() == 11)
      return "Kaguya Clan"; 
    if (getClan() == 12)
      return "Kurama Clan"; 
    if (getClan() == 13)
      return "Tsuchigumo Clan"; 
    if (getClan() == 14)
      return "Nara Clan"; 
    if (getClan() == 15)
      return "Otsutsuki Clan"; 
    if (getClan() == 16)
      return "Hagoromo Clan"; 
    if (getClan() == 17)
      return "Sarutobi Clan"; 
    if (getClan() == 18)
      return "Fuma Clan"; 
    if (getClan() == 19)
      return "Neko Clan"; 
    if (getClan() == 20)
      return "Yuki Clan"; 
    if (getClan() == 21)
      return "Yamanaka Clan"; 
    if (getClan() == 22)
      return "Lee Clan"; 
    if (getClan() == 23)
      return "Chinoike Clan"; 
    return (getClan() == 24) ? "Shirogane Clan" : "N/A";
  }
  
  public String getClanLastname() {
    if (getClan() == 1)
      return "Uchiha"; 
    if (getClan() == 2)
      return "Uzumaki"; 
    if (getClan() == 3)
      return "Aburame"; 
    if (getClan() == 4)
      return "Akimichi"; 
    if (getClan() == 5)
      return "Hatake"; 
    if (getClan() == 6)
      return "Hozuki"; 
    if (getClan() == 7)
      return "Hyuga"; 
    if (getClan() == 8)
      return "Iburi"; 
    if (getClan() == 9)
      return "Inuzuka"; 
    if (getClan() == 10)
      return "Jugo"; 
    if (getClan() == 11)
      return "Kaguya"; 
    if (getClan() == 12)
      return "Kurama"; 
    if (getClan() == 13)
      return "Tsuchigumo"; 
    if (getClan() == 14)
      return "Nara"; 
    if (getClan() == 15)
      return "Otsutsuki"; 
    if (getClan() == 16)
      return "Hagoromo"; 
    if (getClan() == 17)
      return "Sarutobi"; 
    if (getClan() == 18)
      return "Fuma"; 
    if (getClan() == 19)
      return "Neko"; 
    if (getClan() == 20)
      return "Yuki"; 
    if (getClan() == 21)
      return "Yamanaka"; 
    if (getClan() == 22)
      return "Lee"; 
    if (getClan() == 23)
      return "Chinoike"; 
    return (getClan() == 24) ? "Shirogane" : "N/A";
  }
  
  public String getRankName() {
    if (getRank() == 21)
      return "Academy Student"; 
    if (getRank() == 1)
      return "Genin"; 
    if (getRank() == 2)
      return "Chunin"; 
    if (getRank() == 3)
      return "Tokubetsu Jonin"; 
    if (getRank() == 4)
      return "Jonin"; 
    if (getRank() == 5)
      return "Missing-Nin"; 
    if (getRank() == 6)
      return "Explosion Corps"; 
    if (getRank() == 7)
      return "Taka"; 
    if (getRank() == 8)
      return "Hebi"; 
    if (getRank() == 9)
      return "of the Bloody Mist"; 
    if (getRank() == 10)
      return "Samurai"; 
    if (getRank() == 11)
      return "Anbu"; 
    if (getRank() == 12)
      return "Medical Team"; 
    if (getRank() == 13)
      return "Intel Team"; 
    if (getRank() == 14)
      return "Anbu Captain"; 
    if (getRank() == 15)
      return "Medical Captain"; 
    if (getRank() == 16)
      return "Intel Captain"; 
    if (getRank() == 17)
      return "Akatsuki"; 
    if (getRank() == 18)
      return "Kinkaku Force"; 
    if (getRank() == 19)
      return "12 Guardian Ninja"; 
    if (getRank() == 20)
      return "Puppet Brigade"; 
    if (getRank() == 22)
      return "7 Ninja Swordsmen o/t Mist"; 
    if (getRank() == 23)
      return "Kage"; 
    if (getRank() == 24)
      return "Akatsuki Leader"; 
    if (getRank() == 25)
      return "Sannin"; 
    if (getRank() == 26)
      return "D-Rank"; 
    if (getRank() == 27)
      return "C-Rank"; 
    if (getRank() == 28)
      return "B-rank"; 
    if (getRank() == 29)
      return "A-Rank"; 
    if (getRank() == 30)
      return "S-Rank"; 
    return (getRank() == 31) ? "Tailed Beast" : "Villager";
  }
  
  public void fixStats() {
    if (this.Genjutsu > 200)
      this.Genjutsu = 60; 
    if (this.LightningRelease > 1)
      this.LightningRelease = 1; 
    if (this.WaterRelease > 1)
      this.WaterRelease = 1; 
    if (this.WindRelease > 1)
      this.WindRelease = 1; 
    if (this.FireRelease > 1)
      this.FireRelease = 1; 
    if (this.EarthRelease > 1)
      this.EarthRelease = 1; 
    if (this.woodRelease > 1)
      this.woodRelease = 1; 
    if (this.dustRelease > 1)
      this.dustRelease = 1; 
    if (this.crystalRelease > 1)
      this.crystalRelease = 1; 
    if (this.steelRelease > 1)
      this.steelRelease = 1; 
    if (this.explosionRelease > 1)
      this.explosionRelease = 1; 
    if (this.iceRelease > 1)
      this.iceRelease = 1; 
    if (this.stormRelease > 1)
      this.stormRelease = 1; 
    if (this.magnetRelease > 1)
      this.magnetRelease = 1; 
    if (this.boilRelease > 1)
      this.boilRelease = 1; 
    if (this.scorchRelease > 1)
      this.scorchRelease = 1; 
    if (this.lavaRelease > 1)
      this.lavaRelease = 1; 
    if (this.yinyangrelease > 1)
      this.yinyangrelease = 1; 
    if (this.yangrelease > 1)
      this.yangrelease = 1; 
    if (this.yinrelease > 1)
      this.yinrelease = 1; 
  }
  
  public boolean isNekomode() {
    return this.nekomode;
  }
  
  public void setNekomode(boolean b, Side side) {
    this.nekomode = b;
    if (side.isServer())
      PacketDispatcher.sendTo((IMessage)new SyncNekoMessage(this.player), (EntityPlayerMP)this.player); 
  }
  
  public void setNekomode(boolean b) {
    this.nekomode = b;
  }
}
