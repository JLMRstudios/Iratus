package com.jlmr.iratus.commands;

import com.jlmr.iratus.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player p = (Player) sender;
        if (sender instanceof Player) {
            if (cmd.getName().equalsIgnoreCase("iratusgive")) {
                if (args.length > 0) {
                    if (args[0].equalsIgnoreCase("izanagispear")){
                        p.getInventory().addItem(ItemManager.izanagispear);
                    }
                    if (args[0].equalsIgnoreCase("karuikama")){
                        p.getInventory().addItem(ItemManager.karuikama);
                    }

                } else {
                    p.sendMessage("§4/iratusgive <item>");
                }
            }
        }
        return false;
    }
}