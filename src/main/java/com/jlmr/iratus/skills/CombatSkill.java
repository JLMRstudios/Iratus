package com.jlmr.iratus.skills;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

public class CombatSkill implements Listener {

    public double combatXp = 0;
    public int milestone = 0;
    public boolean milestone1 = false;
    public boolean milestone2 = false;
    public boolean milestone3 = false;

    @EventHandler
    public void onKill(EntityDeathEvent e){
        Player p = e.getEntity().getKiller();

        if(!(e.getEntity().getKiller() instanceof Player)){
            return;
        }
        else {
            //  combat xp system, maybe change to biome based system
            switch (e.getEntity().getType()){
                case CREEPER:
                    combatXp = combatXp + 2;
                    break;

                case BLAZE:
                    combatXp = combatXp + 4;
                    break;

                case ZOMBIE:
                    combatXp = combatXp + 1;
                    break;

                case SKELETON:
                    combatXp = combatXp + 1.5;
                    break;

                case EVOKER:
                    combatXp = combatXp + 12;
                    break;

                case VINDICATOR:
                    combatXp = combatXp + 8;
                    break;

                case PILLAGER:
                    combatXp = combatXp + 6;
                    break;

                case RAVAGER:
                    combatXp = combatXp + 20;
                    break;

                case VEX:
                    combatXp = combatXp + 16;
                    break;

                case ENDERMITE:
                    combatXp = combatXp + 4;
                    break;
            }
        }


        if (combatXp >= 1000.0){
            milestone1 = true;
        }
        if (combatXp >= 2500.0){
            milestone2 = true;
        }
        if (combatXp >= 5000.0){
            milestone3 = true;
        }

        if (milestone1 == true){
            milestone++;
        }
        if (milestone2 == true){
            milestone++;
        }
        if (milestone3 == true){
            milestone++;
        }
    }
}
