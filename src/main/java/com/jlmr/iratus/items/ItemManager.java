package com.jlmr.iratus.items;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class ItemManager{

    public static ItemStack gamemenu1;
    public static ItemStack karuikama;
    public static ItemStack omoikama;
    public static ItemStack unmeikama;
    public static ItemStack combatSkillItem;
    public static ItemStack agilitySkillItem;
    public static ItemStack guiBackGround;

    public static void init(){
        createitem1();
        createKaruiKama();
        createOmoiKama();
        createUnmeiNoKama();
        createMokushirokuNoKama();
        createRenshu();
        createSainanKatana();
        createDaisanjikatana();
        createIzanagiSpear();
        createCombatSkillItem();
        createGUIBackGround();
        createAgilitySkillItem();
    }

    public static void createCombatSkillItem(){
        ItemStack item = new ItemStack(Material.IRON_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Combat Skill");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        item.setItemMeta(meta);
        combatSkillItem = item;
    }

    public static void createAgilitySkillItem(){
        ItemStack item = new ItemStack(Material.FEATHER, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Agility Skill");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        item.setItemMeta(meta);
        agilitySkillItem = item;
    }

    public static void createGUIBackGround(){
        ItemStack item = new ItemStack(Material.GRAY_STAINED_GLASS_PANE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        item.setItemMeta(meta);
        guiBackGround = item;
    }

    public static void createitem1(){
        ItemStack item = new ItemStack(Material.COMPASS);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§dGame menu");
        List<String> lore = new ArrayList<>();
        lore.add("§eClick to open menu!");
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        meta.setLore(lore);
        item.setItemMeta(meta);
        gamemenu1 = item;
    }

    public static void createKaruiKama(){
        ItemStack item = new ItemStack(Material.WOODEN_HOE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.BLUE + "Karui Kama");
        List<String> lore = new ArrayList<>();
        lore.add("");
        meta.setLore(lore);
        item.setItemMeta(meta);
        karuikama = item;
    }

    public static void createOmoiKama(){
        ItemStack item = new ItemStack(Material.STONE_HOE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Omoi Kama");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        item.setItemMeta(meta);
        omoikama = item;
    }

    public static void createUnmeiNoKama(){
        ItemStack item = new ItemStack(Material.IRON_HOE);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Unmei No Kama");
        List<String> lore = new ArrayList<>();
        meta.setLore(lore);
        item.setItemMeta(meta);
        unmeikama = item;
    }

    public static void createMokushirokuNoKama(){
        ItemStack item = new ItemStack(Material.NETHERITE_HOE);
    }

    public static void createRenshu(){
        ItemStack item = new ItemStack(Material.WOODEN_SWORD);
    }

    public static void createSainanKatana(){
        ItemStack item = new ItemStack(Material.STONE_SWORD);
    }

    public static void createDaisanjikatana(){
        ItemStack item = new ItemStack(Material.IRON_SWORD);
    }

    public static void createIzanagiSpear(){
        ItemStack item = new ItemStack(Material.ARROW);
    }
}
