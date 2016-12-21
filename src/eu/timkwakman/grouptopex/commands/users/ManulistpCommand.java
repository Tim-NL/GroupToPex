package eu.timkwakman.grouptopex.commands.users;

import eu.timkwakman.grouptopex.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class ManulistpCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {
        Player p = (Player)sender;

        if (cmd.getName().equalsIgnoreCase("manulistp")) {

            if (args.length < 1) {
                p.sendMessage(Main.wrong_args + cmd.getName() + " player");
                return false;
            }

            Bukkit.dispatchCommand(p, "pex user " + args[0] + " list");
        }
        return false;
    }

}
