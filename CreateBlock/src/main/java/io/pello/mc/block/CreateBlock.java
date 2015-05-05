
package io.pello.mc.block; 

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
 * This plugins creates a block next to the player location
 * with /block command
 * @author Pello Altadill
 * @greetz any
 */
public class CreateBlock extends JavaPlugin { 
  // we set this logger to show messages on console
  private static Logger log = Logger.getLogger("Minecraft");
  
  /**
   * This method is called when the plugin is loaded
   */
  public void onLoad() {
	    log.info("Block Plugin> loaded");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onEnable() {
    log.info("Block Plugin> enabled");
  }
  
  /**
   * This method is called when the plugin is disabled
   */
  public void onDisable() {
	    log.info("Block Plugin> disabled");
  }
  
  /**
   * onCommand event, whenever the player sends a command with /command
   * this method will be invoked
   */
  public boolean onCommand(CommandSender sender, Command command, 
		     String commandLabel, String[] args) {   
	// If the command is block...
    if (commandLabel.equalsIgnoreCase("block")) {
    	// Check if command was sent by a player
    	if (sender instanceof Player) {
    		// Cast or convert sender to Player
    		Player myPlayer = (Player) sender;
    		
    		// Get location info
    		Location location = myPlayer.getLocation();

    		// Get the World through the location
    		World world = location.getWorld();
    		
    		// We move the location slightly
    		location.setY(location.getY() + 4);
    		location.setX(location.getX() + 2);
    		
    		// Get the block in that location and set type
    		Block block = world.getBlockAt(location);
    		block.setType(Material.COAL_BLOCK);

    		// move location one position up
    		location.setY(location.getY() + 1);
    		
    		// and set material
    		block = world.getBlockAt(location);
    		block.setType(Material.COAL_BLOCK);

    		myPlayer.sendMessage("Block created");
    		
    	}

      return true;
    }
    return false;
  }
}

