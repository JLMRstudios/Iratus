package com.jlmr.iratus.items.itemevents;

import com.jlmr.iratus.Iratus;
import com.jlmr.iratus.items.ItemManager;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

public class IzanagiSpears implements Listener {

    Iratus plugin;

    public IzanagiSpears(Iratus plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent event){
        final Player player = event.getPlayer();
        if(event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
            if (player.getItemInHand().equals(ItemManager.izanagispear)) {

                //  ability functionality test.
                player.sendMessage("Ability worked I think???");

                    new BukkitRunnable(){
                        double t = 0;

                        public void run(){
                            t = t + 0.5;
                            Location loc = player.getLocation();
                            Vector direction = loc.getDirection().normalize();
                            double x = direction.getX() * t;
                            double y = direction.getY() * t + 1.5;
                            double z = direction.getZ() * t;
                            loc.add(x,y,z);
                            player.spawnParticle(Particle.FIREWORKS_SPARK, loc, 1);
                            loc.subtract(x,y,z);

                            if (t > 30){
                                this.cancel();
                            }
                        }
                    }.runTaskTimer(plugin, 0, 1);
            }
        }
    }
}
