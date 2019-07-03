package com.naiculs.test;

import org.bukkit.entity.Player;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.*;
import org.bukkit.event.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.entity.Entity;
import org.bukkit.potion.*;

public class Test extends JavaPlugin {
    PotionEffect nightvision;
    @Override
    public void onEnable() {
        this.getCommand("helloworld").setExecutor(new helloworld());
        getServer().getPluginManager().registerEvents(new permvision(), this);
       nightvision = new PotionEffect(PotionEffectType.NIGHT_VISION, 1000000, 0, true, true);
    }

    @Override
    public void onDisable(){

    }

    public class helloworld implements CommandExecutor {
        // This method is called, when somebody uses our command
        @Override
        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
               sender.sendMessage("Hello world!");
            }
            // If the player (or console) uses our command correct, we can return true
            return true;
        }

    }

    public class permvision implements Listener{
        @EventHandler
        public void onPlayerJoin(PlayerJoinEvent event) {
            event.getPlayer().addPotionEffect(nightvision);
        }
        @EventHandler
        public void onPlayerRespawn(PlayerRespawnEvent event){
            event.getPlayer().addPotionEffect(nightvision);
        }
        @EventHandler
        public void onPlayerMove (PlayerMoveEvent event){
            event.getPlayer().addPotionEffect(nightvision);
        }
    }

}
