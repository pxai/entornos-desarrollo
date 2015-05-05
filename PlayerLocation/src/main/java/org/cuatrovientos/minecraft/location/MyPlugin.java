
package org.cuatrovientos.minecraft.location; 

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Cow;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Shows player location info using /location command
 * @author Pello Altadill
 * @greetz any
 */
public class MyPlugin extends JavaPlugin { 
  // we set this logger to show messages on console
  private static Logger log = Logger.getLogger("Minecraft");
  
  /**
   * This method is called when the plugin is loaded
   */
  public void onLoad() {
	    log.info("Location Plugin> loaded");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onEnable() {
    log.info("Location Plugin> enabled");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onDisable() {
	    log.info("Location Plugin> disabled");
  }
  
  /**
   * onCommand event, whenever the player sends a command with /command
   * this method will be invoked
   */
  public boolean onCommand(CommandSender sender, Command command, 
		     String commandLabel, String[] args) {   
	// Check if command is "location"
    if (commandLabel.equalsIgnoreCase("location")) {
    	// Check if command was sent by a player
    	if (sender instanceof Player) {
    		// Cast or convert sender to Player
    		Player myPlayer = (Player) sender;
    		
    		// Get location info
    		Location location = myPlayer.getLocation();

    		// Get X,Y,Z coordinates
    		String message = "Player location: ";
    		message = message + " X: " + location.getX();
    		message = message + " Y: " + location.getY();
    		message = message + " Z: " + location.getZ();
    		// show them
    		getServer().broadcastMessage(message);
    		
    		// Get world name and send too
    		message =  "World name: " + myPlayer.getWorld().getName();
    		getServer().broadcastMessage(message);

    		///////// MOOOOOOOOOOOOO /////////
    		// Spawn a cow!!!! ///////////////
    		// First, we get the world
    		World world = myPlayer.getWorld();
    		// Now we Spawn or generate a cow
   			world.spawn(location, Cow.class);
    		
    	}
      return true;
    }
    return false;
  }
}

