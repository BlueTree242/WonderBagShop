// This claas was created by JaTiTV

// ___________________________________________________________________________________
//  __          __             _           ____               _____ _
//  \ \        / /            | |         |  _ \             / ____| |
//   \ \  /\  / /__  _ __   __| | ___ _ __| |_) | __ _  __ _| (___ | |__   ___  _ __
//    \ \/  \/ / _ \| '_ \ / _` |/ _ \ '__|  _ < / _` |/ _` |\___ \| '_ \ / _ \| '_ \
//     \  /\  / (_) | | | | (_| |  __/ |  | |_) | (_| | (_| |____) | | | | (_) | |_) |
//      \/  \/ \___/|_| |_|\__,_|\___|_|  |____/ \__,_|\__, |_____/|_| |_|\___/| .__/
//                                                      __/ |                  | |
//                                                     |___/                   |_|
// ___________________________________________________________________________________

package de.jatitv.wonderbagshop.main;

import de.jatitv.wonderbagshop.Listeners.ShopEvent;
import de.jatitv.wonderbagshop.config.Messages;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.Iterator;
import java.util.logging.Logger;

public final class Main extends JavaPlugin {

    public static Main plugin;
    public static Plugin a;
    public static Economy eco = null;

    @Override
    public void onEnable() {
        // Plugin startup logic
        Logger logger = this.getLogger();

        plugin = this;
        getCommand("wonderbagshop").setExecutor(new CmdExecuter());
        getCommand("wbs").setExecutor(new CmdExecuter());
        getCommand("wonderbagshop").setTabCompleter(new TabComplete());
        getCommand("wbs").setTabCompleter(new TabComplete());
        getCommand("wbsrl").setExecutor(new CmdExecuter_wbsrl());
        a = this;
        Bukkit.getServer().getPluginManager().registerEvents(new ShopEvent(), this);
        Load.LoadSend(getDescription().getVersion());

        int pluginId = 10342; // <-- Replace with the id of your plugin!
        Metrics metrics = new Metrics(this, pluginId);

        // Optional: Add custom charts
        // metrics.addCustomChart(new Metrics.SimplePie("chart_id", () -> "My value"));

        (new UpdateChecker(this, 88889)).getVersion((version) -> {
            String currentVersion = this.getDescription().getVersion();
            if (!currentVersion.equalsIgnoreCase(version)) {
                String foundVersion = ("§bA new version of VillagerMarket was found!");
                String latestVersion = ("§bLatest version: §a" + version + "§b");
                String yourVersion = ("§bYour version §c" + currentVersion + "§b.");
                String downloadVersion = ("§bGet it here for the latest features and bug fixes: §ehttps://www.spigotmc.org/resources/villager-market.82965/");
                Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + foundVersion);
                Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + latestVersion);
                Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + yourVersion);
                Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + downloadVersion);
                Iterator var7 = Bukkit.getOnlinePlayers().iterator();

                while(var7.hasNext()) {
                    Player player = (Player)var7.next();
                    if (player.hasPermission("wonderbagshop.admin")) {
                        player.sendMessage(Messages.PrefixHC + " " + foundVersion);
                        player.sendMessage(Messages.PrefixHC + " " + foundVersion);
                    }
                }
            }

        });
    }
    public static Plugin thisp() {
        return plugin;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Disable.disableSend(getDescription().getVersion());
    }
    public static Main getPlugin() {return plugin;}

}
