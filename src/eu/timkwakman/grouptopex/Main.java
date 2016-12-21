package eu.timkwakman.grouptopex;

import eu.timkwakman.grouptopex.commands.groups.*;
import eu.timkwakman.grouptopex.commands.utility.*;
import eu.timkwakman.grouptopex.commands.users.*;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {


    public static String prefix_red = ChatColor.GRAY + "[" + ChatColor.RED + "Perms" + ChatColor.GRAY + "] ";

    public static String not_implemented = prefix_red + "This command is not yet implemented";
    public static String wrong_args = prefix_red + "Correct use: /";

    public void onEnable()
    {
        System.out.println("[GroupManagerCMD] Plugin is ready! :)");

        // Register commands.
        getCommand("manguaddp").setExecutor(new MangdelpCommand());
        getCommand("mangdelp").setExecutor(new MangdelpCommand());
        getCommand("manglistp").setExecutor(new ManglistpCommand());

        getCommand("manuadd").setExecutor(new ManuaddCommand());
        getCommand("manuaddp").setExecutor(new ManuaddpCommand());
        getCommand("Manuaddsub").setExecutor(new ManuaddsubCommand());
        getCommand("manudel").setExecutor(new ManudelCommand());
        getCommand("manudelsub").setExecutor(new ManudelsubCommand());
        getCommand("manulistp").setExecutor(new ManulistpCommand());

        getCommand("manload").setExecutor(new ManloadCommand());
        getCommand("mansave").setExecutor(new MansaveCommand());
    }

}
