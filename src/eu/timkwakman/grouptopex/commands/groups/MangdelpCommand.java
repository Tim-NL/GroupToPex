package eu.timkwakman.grouptopex.commands.groups;

import eu.timkwakman.grouptopex.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MangdelpCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (cmd.getName().equalsIgnoreCase("mangdelp")) {

            if (args.length < 2) {
                sender.sendMessage(Main.wrong_args + cmd.getName() + " player permission");
                return false;
            }

            Bukkit.dispatchCommand(sender, "pex group " + args[0] + " remove " + args[1]);
        }

        return false;
    }

}
