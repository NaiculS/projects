import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;


public class Main extends JavaPlugin {
  PluginManager pm = Bukkit.getServer().getPluginManager();
	Plugin pl;
 
 	public void onEnable(){
 			this.pl=this
			system.out.println("You have enabled the plugin!");
     		 }
	
	public void onDisable(){
			this.pl=null
			system.out.println("You have disabled the plugin!");
		}
 }
  
  
