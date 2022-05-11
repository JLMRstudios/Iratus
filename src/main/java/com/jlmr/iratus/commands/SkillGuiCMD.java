package com.jlmr.iratus.commands;

import com.jlmr.iratus.Iratus;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SkillGuiCMD implements CommandExecutor {

    Iratus plugin;

    public SkillGuiCMD(Iratus plugin){
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            plugin.openMainSkillPage(player);
        }
        return true;
    }
}
