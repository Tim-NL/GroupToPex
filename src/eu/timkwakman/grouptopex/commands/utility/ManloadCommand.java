package eu.timkwakman.grouptopex.commands.utility;

import eu.timkwakman.grouptopex.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ManloadCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player p = (Player)sender;

        if (cmd.getName().equalsIgnoreCase("manload")) {

            Bukkit.dispatchCommand(p, "pex reload");
        }
        return false;
    }

}
