package alcoholmod.Mathioks.DimensionKamui;

import java.util.logging.Level;
import java.util.logging.Logger;

public class GameLogHelper {
  public static void log(String targetLog, Level level, String message, Object... data) {
    GameLogger var10000 = gameLogger;
    GameLogger.log(targetLog, level, message, data);
  }
  
  public static void log(Level level, String message, Object... data) {
    GameLogger var10000 = gameLogger;
    GameLogger.log(level, message);
  }
  
  public static void log(String targetLog, Level level, Throwable ex, String message, Object... data) {
    GameLogger var10000 = gameLogger;
    GameLogger.log(targetLog, level, ex, message, data);
  }
  
  public static void log(Level level, Throwable ex, String message, Object... data) {
    GameLogger var10000 = gameLogger;
    GameLogger.log(level, ex, message, data);
  }
  
  public static void severe(String message) {
    log(Level.SEVERE, message, new Object[0]);
  }
  
  public static void bigWarning(String format, Object... data) {
    StackTraceElement[] trace = Thread.currentThread().getStackTrace();
    log(Level.WARNING, "****************************************", new Object[0]);
    log(Level.WARNING, "* " + format, data);
    for (int i = 2; i < 8 && i < trace.length; i++) {
      log(Level.WARNING, "*  at %s%s", new Object[] { trace[i].toString(), (i == 7) ? "..." : "" });
    } 
    log(Level.WARNING, "****************************************", new Object[0]);
  }
  
  public static void warning(String message) {
    log(Level.WARNING, message, new Object[0]);
  }
  
  public static void info(String message) {
    log(Level.INFO, message, new Object[0]);
  }
  
  public static Logger getLogger() {
    return gameLogger.getLogger();
  }
  
  public static void writeToLog(Level level, String text) {
    GameLogger var10000 = gameLogger;
    GameLogger.writeToFile(level, text);
  }
  
  private static GameLogger gameLogger = GameLogger.log;
}
