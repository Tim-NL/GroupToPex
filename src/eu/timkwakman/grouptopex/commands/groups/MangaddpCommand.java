package eu.timkwakman.grouptopex.commands.groups;

import eu.timkwakman.grouptopex.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MangaddpCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player p = (Player)sender;

        if (cmd.getName().equalsIgnoreCase("mangaddp")) {

            if (args.length < 2) {
                p.sendMessage(Main.wrong_args + cmd.getName() + " group permission");
                return false;
            }

            Bukkit.dispatchCommand(p, "pex group " + args[0] + " add " + args[1]);
        }

        return false;
    }

}
