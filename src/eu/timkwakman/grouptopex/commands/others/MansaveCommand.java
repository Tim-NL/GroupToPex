package eu.timkwakman.grouptopex.commands.others;

import eu.timkwakman.grouptopex.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

public class MansaveCommand implements CommandExecutor {


    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        if (cmd.getName().equalsIgnoreCase("mansave")) {

            sender.sendMessage(Main.not_implemented);
        }
        return false;
    }

}
