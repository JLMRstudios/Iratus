package com.jlmr.iratus.gui;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class StartingGUI {

    public void openStartingGUI(Player player){
        Inventory startingGUI = Bukkit.createInventory(player, 9, "Class Choice");

        //options for main menu
        ItemStack arch = new ItemStack(Material.BOW);
        ItemMeta giveMeta = arch.getItemMeta();
        giveMeta.setDisplayName("§aARCHER");
        ArrayList<String> givelore = new ArrayList<>();
        givelore.add("§7Choose the archer class.");
        giveMeta.addEnchant(Enchantment.LUCK, 1, false);
        giveMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        giveMeta.setLore(givelore);
        arch.setItemMeta(giveMeta);

        ItemStack ass = new ItemStack(Material.IRON_SWORD);
        ItemMeta closeMeta = ass.getItemMeta();
        closeMeta.setDisplayName("§aASSASSIN");
        ArrayList<String> closelore = new ArrayList<>();
        closelore.add("§7Choose the assassin class.");
        closeMeta.addEnchant(Enchantment.LUCK, 1, false);
        closeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        closeMeta.setLore(closelore);
        ass.setItemMeta(closeMeta);

        ItemStack runic = new ItemStack(Material.END_CRYSTAL);
        ItemMeta runeMeta = runic.getItemMeta();
        runeMeta.setDisplayName("§aRUNIC");
        ArrayList<String> runeLore = new ArrayList<>();
        runeLore.add("§7Choose the runic class.");
        runeMeta.addEnchant(Enchantment.LUCK, 1, false);
        runeMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        runeMeta.setLore(runeLore);
        runic.setItemMeta(runeMeta);


        startingGUI.setItem(0, arch);
        startingGUI.setItem(1, ass);
        startingGUI.setItem(2, runic);
        player.openInventory(startingGUI);

    }

}
