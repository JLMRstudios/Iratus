package com.jlmr.iratus.items.itemevents;

import com.jlmr.iratus.Iratus;
import com.jlmr.iratus.generalevents.Stats;
import com.jlmr.iratus.items.ItemManager;
import org.bukkit.Location;
import org.bukkit.Particle;
import org.bukkit.Sound;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.meta.FireworkMeta;
import org.bukkit.scheduler.BukkitRunnable;

public class ScythesKamas implements Listener {

    Iratus plugin;

    public ScythesKamas(Iratus plugin){
        this.plugin = plugin;
    }

    @EventHandler
    public void onRightClick(PlayerInteractEvent e){
        Player player = e.getPlayer();
        if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
            if (player.getItemInHand().equals(ItemManager.karuikama)){
                String damage = "15";

                Location eye = player.getEyeLocation();
                Firework firework = (Firework) eye.getWorld().spawnEntity(eye, EntityType.FIREWORK);
                FireworkMeta meta = firework.getFireworkMeta();
                meta.setPower(1);
                firework.setFireworkMeta(meta);
                firework.setShotAtAngle(true);
                firework.setRotation(player.getLocation().getYaw(), player.getLocation().getPitch());
                firework.setVelocity(eye.getDirection().normalize().multiply(2));
                firework.setBounce(true);
                firework.setCustomName(damage);
                firework.setShooter(player);
                player.getWorld().playSound(player.getLocation(), Sound.ENTITY_FIREWORK_ROCKET_LAUNCH, 5, 5);

                new BukkitRunnable() {

                    public void run() {
                        if (firework.isDead()) {
                            cancel();
                        }
                        else{
                            firework.getWorld().spawnParticle(Particle.EXPLOSION_HUGE, firework.getLocation(), 7);
                            firework.getWorld().playSound(firework.getLocation(), Sound.ENTITY_GENERIC_EXPLODE, 5, 5);
                            for (Entity entity : firework.getNearbyEntities(5, 5, 5)) {
                                if (entity instanceof LivingEntity) {
                                    LivingEntity livingentity = (LivingEntity) entity;
                                    if (!livingentity.equals(player) && !livingentity.equals(firework)) {
                                        livingentity.damage(Integer.parseInt(firework.getCustomName()));
                                    }
                                }
                            }
                            cancel();
                        }
                    }
                }.runTaskTimer(plugin, firework.getFireworkMeta().getPower() * 10 + 10, 0L);

                e.setCancelled(true);

                if (Stats.rune <= 19){
                    e.setCancelled(true);
                    return;
                }
                else{
                    Stats.rune = Stats.rune - 20;
                }
            }
        }
    }
}
