package eu.timkwakman.grouptopex.commands.others;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ManloadCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("manload")) {

            Bukkit.dispatchCommand(sender, "pex reload");
        }
        return false;
    }

}
