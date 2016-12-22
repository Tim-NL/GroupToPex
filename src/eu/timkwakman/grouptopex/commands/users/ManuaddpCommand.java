package eu.timkwakman.grouptopex.commands.users;

import eu.timkwakman.grouptopex.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class ManuaddpCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("manuaddp")) {

            if (args.length < 2) {
                sender.sendMessage(Main.wrong_args + cmd.getName() + " player permission");
                return false;
            }

            Bukkit.dispatchCommand(sender, "pex user " + args[0] + " add " + args[1]);
        }
        return false;
    }

}
