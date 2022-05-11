package com.jlmr.iratus.generalevents;

import com.jlmr.iratus.Iratus;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.scheduler.BukkitRunnable;

public class Stats implements Listener {

    Iratus plugin;

    public Stats(Iratus plugin){
        this.plugin = plugin;
    }

    public static double maxHealth = 100;
    public static double health = 100;
    public static int rune = 0;
    public static int maxRune = 100;
    public static int resistance = 0;
    public static int focus = 0;
    public static int maxFocus = 500;
    String focusState = "☹";

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        if (focus >= 250){
            focusState = "☺";
        }

        new BukkitRunnable() {

            @Override
            public void run() {
                p.setSaturation(20);
                p.setHealthScale(20);
                e.getPlayer().setMaxHealth(maxHealth);

                health = p.getHealth();

                p.spigot().sendMessage(ChatMessageType.ACTION_BAR,
                                TextComponent.fromLegacyText(ChatColor.DARK_RED+""+Math.floor(health) +"/"+maxHealth +" ❤      "
                                        +ChatColor.GREEN +" "+resistance +" ❈ "+"     "
                                        +ChatColor.DARK_PURPLE +""+rune +"/"+maxRune +"✎     "
                                        +ChatColor.YELLOW +"Focus "+focus + " " + focusState));
            }
        }.runTaskTimer(plugin, 0L, 10L);
    }

    @EventHandler
    public void regenRune(PlayerJoinEvent e){
        new BukkitRunnable(){
            public void run() {
                int calculatedInt = maxRune * 1/100;
                rune += calculatedInt;
                if(rune >= rune){
                    rune = rune;
                }
                if(rune < 0){
                    rune = 0;
                }
                if (rune == maxRune){
                    this.cancel();
                }
            }
        }.runTaskTimer(plugin, 0L, 20L);
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent e){
        Player p = e.getEntity();
        if(!p.isDead()){
            return;
        }
        else{
            p.sendMessage(ChatColor.GRAY + "Server:" + ChatColor.RED + "Yikes! You died!");
        }
    }
}
