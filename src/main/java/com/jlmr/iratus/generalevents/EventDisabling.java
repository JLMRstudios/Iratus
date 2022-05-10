package com.jlmr.iratus.generalevents;

import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockExplodeEvent;

public class EventDisabling implements Listener {

    @EventHandler
    public void onBreak(BlockBreakEvent e){
        if(e.getPlayer().getGameMode().equals(GameMode.SURVIVAL)){
            e.setCancelled(true);
        }
        else{
            e.setCancelled(false);
        }

        if(e.getBlock().getType().equals(Material.OAK_LOG)){
            e.setCancelled(false);
        }
    }
    
    @EventHandler
    public void onBlocKExplode(BlockExplodeEvent e){
        e.setCancelled(true);
    }
}
