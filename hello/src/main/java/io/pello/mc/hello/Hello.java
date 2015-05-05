
package io.pello.mc.hello; 

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * The simples plugin possible with command handler 
 * for /hello command
 * @author Pello Altadill
 * @greetz any
 */
public class Hello extends JavaPlugin { 
  // we set this logger to show messages on console
  private static Logger log = Logger.getLogger("Minecraft");
  
  /**
   * This method is called when the plugin is loaded
   */
  public void onLoad() {
	    log.info("Hello Plugin> loaded");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onEnable() {
    log.info("Hello Plugin> enabled");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onDisable() {
	    log.info("Hello Plugin> disabled");
  }
  
  /**
   * onCommand event, whenever the player sends a command with /command
   * this method will be invoked
   */
  public boolean onCommand(CommandSender sender, Command command, 
		     String commandLabel, String[] args) {   
	// If the command is hello...
    if (commandLabel.equalsIgnoreCase("hello")) {
    	// We show a message to everybody
    	String message = "Hello, Kaixo, Hola a todos";
    	getServer().broadcastMessage(message);
      return true;
    }
    return false;
  }
}

