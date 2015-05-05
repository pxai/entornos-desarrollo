/**
 * 
 */
package org.cuatrovientos.toni.minecraft.monsters;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Giant;
import org.bukkit.entity.MushroomCow;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.PigZombie;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Snowman;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Witch;
import org.bukkit.entity.WitherSkull;
import org.bukkit.entity.Wolf;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Plugin for spawn Monsters in MineCraft
 * @author Toni
 *
 */
public class Monsters extends JavaPlugin { 
	  // we set this logger to show messages on console
	  private static Logger log = Logger.getLogger("Minecraft");
	  
	  public void onLoad() {
		    log.info("Location Plugin> loaded");
	  }
	  
	  public void onEnable() {
	    log.info("Location Plugin> enabled");
	  }
	  
	  public void onDisable() {
		    log.info("Location Plugin> disabled");
	  }
	  
	  public boolean onCommand(CommandSender sender, Command command, 
			     String commandLabel, String[] args) {   
		// Check if command is "monsters"
	    if (commandLabel.equalsIgnoreCase("monsters")) {
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

	    		/////// !!!!GRRRHHHHHH!!!! ///////
	    		// Spawn Monsters!!!! ///////////////
	    		// First, we get the world
	    		World world = myPlayer.getWorld();
	    		// Now we Spawn or generate monsters				
				for (int i = 0; i < 48; i++){
	    			switch (i % 12) {
	    			case 0:
						location.setZ(location.getZ() + 12);
			   			world.spawn(location, Villager.class);
						break;
					case 1:
						location.setZ(location.getZ() - 2);
						location.setX(location.getX() + 5);
			   			world.spawn(location, Giant.class);
						break;
					case 2:
						location.setZ(location.getZ() - 5);
						location.setX(location.getX() + 5);
			   			world.spawn(location, MushroomCow.class);
						break;
					case 3:
						location.setZ(location.getZ() - 5);
						location.setX(location.getX() + 2);
			   			world.spawn(location, IronGolem.class);
						break;
					case 4:
						location.setZ(location.getZ() - 5);
						location.setX(location.getX() - 2);
						world.spawn(location, PigZombie.class);
						break;
					case 5:
						location.setZ(location.getZ() - 5);
						location.setX(location.getX() - 5);
						world.spawn(location, Skeleton.class);
						break;
					case 6:
						location.setZ(location.getZ() - 2);
						location.setX(location.getX() - 5);
						world.spawn(location, Snowman.class);
						break;
					case 7:
						location.setZ(location.getZ() + 2);
						location.setX(location.getX() - 5);
						world.spawn(location, EnderDragon.class);
						break;
					case 8:
						location.setZ(location.getZ() + 5);
						location.setX(location.getX() - 5);
						world.spawn(location, Witch.class);
						break;
					case 9:
						location.setZ(location.getZ() + 5);
						location.setX(location.getX() - 2);
						world.spawn(location, WitherSkull.class);
						break;
					case 10:
						location.setZ(location.getZ() + 5);
						location.setX(location.getX() + 2);
						world.spawn(location, Wolf.class);
						break;
					case 11:
						location.setZ(location.getZ() + 5);
						location.setX(location.getX() + 5);
						world.spawn(location, Zombie.class);
						break;
					}
	    		}
	    	}
	      return true;
	    }
	    return false;
	  }
}
