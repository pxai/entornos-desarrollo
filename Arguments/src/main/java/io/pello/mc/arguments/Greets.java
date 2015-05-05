
package io.pello.mc.arguments; 

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * This plugins sends greets or messages repeteadly
 * showing how to get command arguments
 * @author Pello Altadill
 * @greetz any
 */
public class Greets extends JavaPlugin { 
  // we set this logger to show messages on console
  private static Logger log = Logger.getLogger("Minecraft");
  
  /**
   * This method is called when the plugin is loaded
   */
  public void onLoad() {
	    log.info("Greets Plugin> loaded");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onEnable() {
    log.info("Greets Plugin> enabled");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onDisable() {
	    log.info("Greets Plugin> disabled");
  }
  
  /**
   * onCommand event, whenever the player sends a command with /command
   * this method will be invoked
   */
  public boolean onCommand(CommandSender sender, Command command, 
		     String commandLabel, String[] args) {   
	// If the command is hello...
    if (commandLabel.equalsIgnoreCase("greets")) {
       	// Check if command was sent by a player
    	if (sender instanceof Player) {
    		// Cast or convert sender to Player
    		Player myPlayer = (Player) sender;
    		// Get arguments
    		// Check arguments length, must be 2
    		if (args.length == 2) {
    			log.info("First argument: " + args[0]);
    			log.info("Second argument: " + args[1]);
    			int number = 0;
    			String message = "";
    		
    			message = args[0];
    			number = Integer.parseInt(args[1]);
    		
    			for (int i = 0; i < number; i++) {
    				getServer().broadcastMessage(message);
    			}
    		}
    	}
    	
      return true;
    }
    return false;
  }
}

