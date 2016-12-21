package eu.timkwakman.grouptopex.commands.users;

import eu.timkwakman.grouptopex.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ManuaddCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player p = (Player)sender;

        if (cmd.getName().equalsIgnoreCase("manuadd")) {

            if (args.length < 2) {
                p.sendMessage(Main.wrong_args + cmd.getName() + " player group");
                return false;
            }

            Bukkit.dispatchCommand(p, "pex user " + args[0] + " group add " + args[1]);
        }

        return false;
    }

}