package alcoholmod.Mathioks.block;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class Blockss {
  public static BlockModFire blockAmaterasu;
  
  public static BlueFire BlockBlueFire;
  
  public static BoneBlockDown blockBoneDown;
  
  public static BoneBlockTop blockBoneTop;
  
  public static BoneBlockLowest blockBoneLowest;
  
  public static SubstitutionBlock blockSub;
  
  public static SandBlockDown blockSandDown;
  
  public static SandBlockTop blockSandTop;
  
  public static CongealingBlock blockCongealing;
  
  public static GoldDustBlock blockGoldDust;
  
  public static SummoningMiddle summoningMiddle;
  
  public static SummoningCorner1 summoningCorner1;
  
  public static SummoningSide1 summoningSide1;
  
  public static SummoningCorner2 summoningCorner2;
  
  public static SummoningSide2 summoningSide2;
  
  public static SummoningCorner3 summoningCorner3;
  
  public static SummoningSide3 summoningSide3;
  
  public static SummoningCorner4 summoningCorner4;
  
  public static SummoningSide4 summoningSide4;
  
  public static NaraShadowBlock naraShadowBlock;
  
  public static CrystalTopBlock crystalTopBlock;
  
  public static CrystalBlockDown crystalBlockDown;
  
  public static CrystalBlockLowest crystalBlockLowest;
  
  public static OilBlock oilBlock;
  
  public static KamuiBlock kamuiBlock;
  
  public static JutsuStone jutsuStone;
  
  public static JutsuWater jutsuWater;
  
  public static BloodPrisonBlock bloodPrisonBlock;
  
  public static BloodPrisonFence bloodPrisonFence;
  
  public static UchihaWood uchihaWood;
  
  public static UchihaCloth uchihaCloth;
  
  public static DeathPossessionBL DeathPossessionBL;
  
  public static DeathPossessionBM DeathPossessionBM;
  
  public static DeathPossessionBR DeathPossessionBR;
  
  public static DeathPossessionML DeathPossessionML;
  
  public static DeathPossessionMM DeathPossessionMM;
  
  public static DeathPossessionMR DeathPossessionMR;
  
  public static DeathPossessionTL DeathPossessionTL;
  
  public static DeathPossessionTM DeathPossessionTM;
  
  public static DeathPossessionTR DeathPossessionTR;
  
  public static PaperBomb PaperBomb;
  
  public static void loadBlocks() {
    blockAmaterasu = new BlockModFire("blockAmaterasu");
    BlockBlueFire = new BlueFire("BlockBlueFire");
    blockBoneDown = new BoneBlockDown();
    blockBoneTop = new BoneBlockTop();
    blockBoneLowest = new BoneBlockLowest();
    blockSub = new SubstitutionBlock();
    blockSandDown = new SandBlockDown();
    blockSandTop = new SandBlockTop();
    blockCongealing = new CongealingBlock();
    blockGoldDust = new GoldDustBlock();
    summoningMiddle = new SummoningMiddle();
    summoningCorner1 = new SummoningCorner1();
    summoningSide1 = new SummoningSide1();
    summoningCorner2 = new SummoningCorner2();
    summoningSide2 = new SummoningSide2();
    summoningCorner3 = new SummoningCorner3();
    summoningSide3 = new SummoningSide3();
    summoningCorner4 = new SummoningCorner4();
    summoningSide4 = new SummoningSide4();
    naraShadowBlock = new NaraShadowBlock();
    crystalTopBlock = new CrystalTopBlock();
    crystalBlockDown = new CrystalBlockDown();
    crystalBlockLowest = new CrystalBlockLowest();
    oilBlock = new OilBlock();
    kamuiBlock = new KamuiBlock();
    jutsuStone = new JutsuStone();
    jutsuWater = new JutsuWater();
    bloodPrisonBlock = new BloodPrisonBlock();
    bloodPrisonFence = new BloodPrisonFence();
    uchihaWood = new UchihaWood();
    uchihaCloth = new UchihaCloth();
    DeathPossessionBL = new DeathPossessionBL();
    DeathPossessionBM = new DeathPossessionBM();
    DeathPossessionBR = new DeathPossessionBR();
    DeathPossessionML = new DeathPossessionML();
    DeathPossessionMM = new DeathPossessionMM();
    DeathPossessionMR = new DeathPossessionMR();
    DeathPossessionTL = new DeathPossessionTL();
    DeathPossessionTM = new DeathPossessionTM();
    DeathPossessionTR = new DeathPossessionTR();
    PaperBomb = new PaperBomb();
    registerBlocks();
  }
  
  private static void registerBlocks() {
    GameRegistry.registerBlock((Block)blockAmaterasu, "blockAmaterasu");
    GameRegistry.registerBlock((Block)BlockBlueFire, "BlockBlueFire");
    GameRegistry.registerBlock(blockBoneDown, "blockBoneDown");
    GameRegistry.registerBlock(blockBoneTop, "blockBoneTop");
    GameRegistry.registerBlock(blockBoneLowest, "blockBoneLowest");
    GameRegistry.registerBlock((Block)blockSub, "blockSub");
    GameRegistry.registerBlock(blockSandDown, "blockSandDown");
    GameRegistry.registerBlock(blockSandTop, "blockSandTop");
    GameRegistry.registerBlock(blockCongealing, "blockCongealing");
    GameRegistry.registerBlock((Block)blockGoldDust, "blockGoldDust");
    GameRegistry.registerBlock(summoningMiddle, "summoningMiddle");
    GameRegistry.registerBlock(summoningCorner1, "summoningCorner1");
    GameRegistry.registerBlock(summoningSide1, "summoningSide1");
    GameRegistry.registerBlock(summoningCorner2, "summoningCorner2");
    GameRegistry.registerBlock(summoningSide2, "summoningSide2");
    GameRegistry.registerBlock(summoningCorner3, "summoningCorner3");
    GameRegistry.registerBlock(summoningSide3, "summoningSide3");
    GameRegistry.registerBlock(summoningCorner4, "summoningCorner4");
    GameRegistry.registerBlock(summoningSide4, "summoningSide4");
    GameRegistry.registerBlock(naraShadowBlock, "naraShadowBlock");
    GameRegistry.registerBlock((Block)crystalTopBlock, "crystalTopBlock");
    GameRegistry.registerBlock((Block)crystalBlockDown, "crystalBlockDown");
    GameRegistry.registerBlock(crystalBlockLowest, "crystalBlockLowest");
    GameRegistry.registerBlock(oilBlock, "oilBlock");
    GameRegistry.registerBlock((Block)kamuiBlock, "KamuiBlock");
    GameRegistry.registerBlock((Block)jutsuStone, "JutsuStone");
    GameRegistry.registerBlock((Block)jutsuWater, "JutsuWater");
    GameRegistry.registerBlock(bloodPrisonBlock, "BloodPrisonBlock");
    GameRegistry.registerBlock(bloodPrisonFence, "BloodPrisonFence");
    GameRegistry.registerBlock(uchihaWood, "UchihaWood");
    GameRegistry.registerBlock(uchihaCloth, "UchihaCloth");
    GameRegistry.registerBlock(DeathPossessionBL, "DeathPossessionBL");
    GameRegistry.registerBlock(DeathPossessionBM, "DeathPossessionBM");
    GameRegistry.registerBlock(DeathPossessionBR, "DeathPossessionBR");
    GameRegistry.registerBlock(DeathPossessionML, "DeathPossessionML");
    GameRegistry.registerBlock(DeathPossessionMM, "DeathPossessionMM");
    GameRegistry.registerBlock(DeathPossessionMR, "DeathPossessionMR");
    GameRegistry.registerBlock(DeathPossessionTL, "DeathPossessionTL");
    GameRegistry.registerBlock(DeathPossessionTM, "DeathPossessionTM");
    GameRegistry.registerBlock(DeathPossessionTR, "DeathPossessionTR");
    GameRegistry.registerBlock(PaperBomb, "PaperBomb");
  }
}
