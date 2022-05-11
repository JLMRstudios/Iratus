package com.jlmr.iratus.generalevents;

import com.jlmr.iratus.Iratus;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class GuiHandler implements Listener {

    Iratus plugin;

    public GuiHandler(Iratus plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onMenuClick(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();

        //menu list
        final String skillGUI = "skills";
        final String combatGUI = "combat";
        final String agilityGUI = "agility";

        if (e.getView().getTitle().equalsIgnoreCase(skillGUI)) {
            switch (e.getCurrentItem().getType()) {
                case IRON_SWORD:
                    player.closeInventory();
                    player.getPlayer().getWorld().playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 5, 5);
                    plugin.openCombatMainPage(player);
                    break;
                case FEATHER:
                    player.closeInventory();
                    player.getPlayer().getWorld().playSound(player.getLocation(), Sound.BLOCK_NOTE_BLOCK_PLING, 5, 5);
                    plugin.openAgilityMainPage(player);
                    break;

                case BARRIER:
                    player.closeInventory();
                    player.getPlayer().getWorld().playSound(player.getLocation(), Sound.ENTITY_ZOMBIE_BREAK_WOODEN_DOOR, 5, 5);
                    break;

            }
        }

    }
}
