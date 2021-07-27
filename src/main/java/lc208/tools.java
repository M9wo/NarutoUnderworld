package lc208;

import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

public class tools {
  public static int freeSpace(ItemStack[] inventory) {
    int ans = 0;
    for (ItemStack stack : inventory) {
      if (stack == null)
        ans++; 
    } 
    return ans;
  }
  
  public static String translateClan(String clan) {
    String[] clans = { 
        "None", "Uchiha", "Uzumaki", "Aburame", "Akimichi", "Hatake", "Hozuki", "Hyuga", "Iburi", "Inuzuka", 
        "Jugo", "Kaguya", "Kurama", "Tsuchigumo", "Nara", "Otsutsuki", "Hagoromo", "Sarutobi", "Fuma", "Senju", 
        "Yuki", "Yamanaka", "Lee", "Chinoike", "Shirogane" };
    for (int i = 0; i < clans.length; i++) {
      if (clan.contains(clans[i]))
        return StatCollector.translateToLocal(clans[i]); 
    } 
    return StatCollector.translateToLocal(clans[0]);
  }
  
  public static String translateRank(String rank) {
    String[] ranks = { 
        "Villager", "Genin", "Chunin", "TokubetsuJonin", "Jonin", "Missing-Nin", "ExplosionCorps", "Taka", "Hebi", "oftheBloodyMist", 
        "Samurai", "Anbu", "MedicalTeam", "IntelTeam", "AnbuCaptain", "MedicalCaptain", "IntelCaptain", "Akatsuki", "KinkakuForce", "12GuardianNinja", 
        "PuppetBrigade", "Academy Student", "7NinjaSwordsmen", "Kage", "AkatsukiLeader", "Sannin", "D-Rank", "C-Rank", "B-Rank", "A-Rank", 
        "S-Rank", "TailedBeast" };
    for (int i = 0; i < ranks.length; i++) {
      if (rank.contains(ranks[i]))
        return StatCollector.translateToLocal(ranks[i]); 
    } 
    return StatCollector.translateToLocal(ranks[0]);
  }
}
