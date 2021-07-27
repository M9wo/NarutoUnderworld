package lc208.nam.hooklib.asm;

import java.util.logging.Level;
import java.util.logging.Logger;

public interface HookLogger {
  void debug(String paramString);
  
  void warning(String paramString);
  
  void severe(String paramString);
  
  void severe(String paramString, Throwable paramThrowable);
  
  public static class SystemOutLogger implements HookLogger {
    public void debug(String message) {
      System.out.println("[DEBUG] " + message);
    }
    
    public void warning(String message) {
      System.out.println("[WARNING] " + message);
    }
    
    public void severe(String message) {
      System.out.println("[SEVERE] " + message);
    }
    
    public void severe(String message, Throwable cause) {
      severe(message);
      cause.printStackTrace();
    }
  }
  
  public static class VanillaLogger implements HookLogger {
    private Logger logger;
    
    public VanillaLogger(Logger logger) {
      this.logger = logger;
    }
    
    public void debug(String message) {
      this.logger.fine(message);
    }
    
    public void warning(String message) {
      this.logger.warning(message);
    }
    
    public void severe(String message) {
      this.logger.severe(message);
    }
    
    public void severe(String message, Throwable cause) {
      this.logger.log(Level.SEVERE, message, cause);
    }
  }
}
