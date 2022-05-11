package com.jlmr.iratus;

import com.jlmr.iratus.commands.GiveCommands;
import com.jlmr.iratus.commands.SkillGuiCMD;
import com.jlmr.iratus.generalevents.ClassChoiceOpen;
import com.jlmr.iratus.generalevents.EventDisabling;
import com.jlmr.iratus.generalevents.Stats;
import com.jlmr.iratus.items.ItemManager;
import com.jlmr.iratus.items.itemevents.ScythesKamas;
import com.jlmr.iratus.skills.CombatSkill;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.plugin.java.JavaPlugin;

public final class Iratus extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        ItemManager.init();

        this.getServer().getConsoleSender().sendMessage("Wassup homie");
        this.getServer().getPluginManager().registerEvents(new EventDisabling(), this);
        this.getServer().getPluginManager().registerEvents(new Stats(this), this);
        this.getServer().getPluginManager().registerEvents(new ClassChoiceOpen(), this);
        this.getServer().getPluginManager().registerEvents(new CombatSkill(), this);
        this.getServer().getPluginManager().registerEvents(new ScythesKamas(this), this);

        this.getCommand("iratusgive").setExecutor(new GiveCommands());
        this.getCommand("skills").setExecutor(new SkillGuiCMD(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
    
    public void openMainSkillPage(Player p){

        Inventory mainSkillGUI = Bukkit.createInventory(p, 45, "Skills");

        mainSkillGUI.setItem(0, ItemManager.guiBackGround);
        mainSkillGUI.setItem(1, ItemManager.guiBackGround);
        mainSkillGUI.setItem(2, ItemManager.guiBackGround);
        mainSkillGUI.setItem(3, ItemManager.guiBackGround);
        mainSkillGUI.setItem(4, ItemManager.guiBackGround);
        mainSkillGUI.setItem(5, ItemManager.guiBackGround);
        mainSkillGUI.setItem(6, ItemManager.guiBackGround);
        mainSkillGUI.setItem(7, ItemManager.guiBackGround);
        mainSkillGUI.setItem(8, ItemManager.guiBackGround);
        mainSkillGUI.setItem(9, ItemManager.guiBackGround);
        mainSkillGUI.setItem(10, ItemManager.guiBackGround);
        mainSkillGUI.setItem(11, ItemManager.guiBackGround);
        mainSkillGUI.setItem(12, ItemManager.guiBackGround);
        mainSkillGUI.setItem(13, ItemManager.guiBackGround);
        mainSkillGUI.setItem(14, ItemManager.guiBackGround);
        mainSkillGUI.setItem(15, ItemManager.guiBackGround);
        mainSkillGUI.setItem(16, ItemManager.guiBackGround);
        mainSkillGUI.setItem(17, ItemManager.guiBackGround);
        mainSkillGUI.setItem(18, ItemManager.guiBackGround);
        mainSkillGUI.setItem(19, ItemManager.combatSkillItem);
        mainSkillGUI.setItem(20, ItemManager.agilitySkillItem);
        mainSkillGUI.setItem(21, ItemManager.guiBackGround);
        mainSkillGUI.setItem(22, ItemManager.guiBackGround);
        mainSkillGUI.setItem(23, ItemManager.guiBackGround);
        mainSkillGUI.setItem(24, ItemManager.guiBackGround);
        mainSkillGUI.setItem(25, ItemManager.guiBackGround);
        mainSkillGUI.setItem(26, ItemManager.guiBackGround);
        mainSkillGUI.setItem(27, ItemManager.guiBackGround);
        mainSkillGUI.setItem(28, ItemManager.guiBackGround);
        mainSkillGUI.setItem(29, ItemManager.guiBackGround);
        mainSkillGUI.setItem(30, ItemManager.guiBackGround);
        mainSkillGUI.setItem(31, ItemManager.guiBackGround);
        mainSkillGUI.setItem(32, ItemManager.guiBackGround);
        mainSkillGUI.setItem(33, ItemManager.guiBackGround);
        mainSkillGUI.setItem(34, ItemManager.guiBackGround);
        mainSkillGUI.setItem(35, ItemManager.guiBackGround);
        mainSkillGUI.setItem(36, ItemManager.guiBackGround);
        mainSkillGUI.setItem(37, ItemManager.guiBackGround);
        mainSkillGUI.setItem(38, ItemManager.guiBackGround);
        mainSkillGUI.setItem(39, ItemManager.guiBackGround);
        mainSkillGUI.setItem(40, ItemManager.guiBackGround);
        mainSkillGUI.setItem(41, ItemManager.guiBackGround);
        mainSkillGUI.setItem(42, ItemManager.guiBackGround);
        mainSkillGUI.setItem(43, ItemManager.guiBackGround);
        mainSkillGUI.setItem(44, ItemManager.guiBackGround);
    }

    public void openCombatMainPage(Player p){

        Inventory combatGUI = Bukkit.createInventory(p, 45, "combat");


    }

    public void openAgilityMainPage(Player p){

        Inventory agilityGUI = Bukkit.createInventory(p, 45, "agility");


    }
}
