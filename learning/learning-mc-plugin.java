import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
  PluginManager pm = Bukkit.getServer().getPluginManager();
	Plugin pl;
 
 public void onEnable(){
 					my.pl=this
      }
	
	public void onDisable(){\
					my.pl=null
			}
 
 if(my.pl=this){
 			system.out.println("You have enabled the plugin!");
 			}
 else{
 			system.out.println("You have disabled the plugin!");
 			}
 }
  
  
