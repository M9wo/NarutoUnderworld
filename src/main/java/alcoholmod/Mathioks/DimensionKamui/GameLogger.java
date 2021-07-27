package alcoholmod.Mathioks.DimensionKamui;

import alcoholmod.Mathioks.AlcoholMod;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GameLogger {
  public static GameLogger log = new GameLogger();
  
  static File tutorialFolder;
  
  static File tutorialLogFolder;
  
  static File configTutorialFolder;
  
  private static String dir = System.getenv("AppData") + "/.minecraft/";
  
  private static boolean configured;
  
  private Logger myLog;
  
  private static void configureLogging() {
    log.myLog = Logger.getLogger("TUTORIAL-DIMENSION");
    configured = true;
  }
  
  public static void log(String targetLog, Level level, String msg, Object... data) {
    Logger.getLogger(targetLog).log(level, String.format(msg, data));
  }
  
  public static void log(Level level, String msg) {
    if (!configured)
      configureLogging(); 
    log.myLog.log(level, String.format(msg, new Object[0]));
  }
  
  public static void log(String targetLog, Level level, Throwable ex, String msg, Object... data) {
    Logger.getLogger(targetLog).log(level, String.format(msg, data), ex);
  }
  
  public static void log(Level level, Throwable ex, String msg, Object... data) {
    if (!configured)
      configureLogging(); 
    log.myLog.log(level, String.format(msg, data), ex);
  }
  
  public static void severe(String msg, Object... data) {
    log(Level.SEVERE, msg);
  }
  
  public static void warning(String msg, Object... data) {
    log(Level.WARNING, msg);
  }
  
  public static void info(String msg) {
    log(Level.INFO, msg);
  }
  
  public Logger getLogger() {
    return this.myLog;
  }
  
  public static void createFolders() {
    tutorialFolder = new File(dir, "Tutorial");
    tutorialLogFolder = new File(dir + "Tutorial/TutorialLog/");
    configTutorialFolder = new File(dir + "Tutorial/Configs/");
    if (!tutorialFolder.exists() || !configTutorialFolder.exists()) {
      tutorialFolder.mkdirs();
      tutorialLogFolder.mkdirs();
      configTutorialFolder.mkdirs();
    } 
  }
  
  public static void writeToFile(Level level, String text) {
    String newLine = System.getProperty("line.separator");
    try {
      File file = new File(tutorialLogFolder, "Log.log");
      FileWriter writer = new FileWriter(file, true);
      writer.write("[" + AlcoholMod.modInstance + "][" + level + "] : " + text + newLine);
      writer.close();
    } catch (IOException var6) {
      var6.printStackTrace();
    } 
  }
  
  public static String getFilePath() {
    return dir;
  }
}
