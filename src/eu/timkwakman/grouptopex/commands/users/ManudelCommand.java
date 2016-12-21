package eu.timkwakman.grouptopex.commands.users;

import eu.timkwakman.grouptopex.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ManudelCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (cmd.getName().equalsIgnoreCase("manudel")) {

            if (args.length < 1) {
                sender.sendMessage(Main.wrong_args + cmd.getName() + " player");
                return false;
            }

            Bukkit.dispatchCommand(sender, "pex user " + args[0] + " delete");
        }

        return false;
    }

}