package com.jlmr.iratus.generalevents;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class ClassChoiceOpen implements Listener {

    @EventHandler
    public void onFirstJoin(PlayerJoinEvent e){
        Player p = e.getPlayer();

        if(p.hasPlayedBefore()){
           return;
        }
        else{
        }
    }
}
