package com.jlmr.iratus.commands;

import com.jlmr.iratus.items.ItemManager;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GiveCommands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        Player player = (Player) sender;
        Player p = (Player) sender;
        if (sender instanceof Player) {
            if (cmd.getName().equalsIgnoreCase("iratusgive")) {
                if (args.length == 0) {
                    p.sendMessage("§4/iratusgive <item>");
                    return true;
                } else {
                    if (args[1].equalsIgnoreCase("karuikama")) {
                        player.getInventory().addItem(ItemManager.karuikama);
                    }
                }
            }
        }
        return false;
    }
}