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

import de.jatitv.wonderbagshop.commands.Reload;
import de.jatitv.wonderbagshop.commands.Shop;
import de.jatitv.wonderbagshop.DefultValue.DefultValue;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdExecuter implements CommandExecutor {

    private void Version(String version) {
        String VER = version;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                if (player.hasPermission("wonderbagshop.command")) {
                    if (Bukkit.getPluginManager().getPlugin("NBTAPI") != null) {
                        Shop.openShop(player);
                    } else {
                        Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4NBTAPI could not be connected / found! " +
                                "§9Please download it here: §6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefultValue.PrefixHC);
                        player.sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefultValue.PrefixHC);
                    }
                } else {
                    player.sendMessage(DefultValue.NoPermission.replace("[cmd]", "/wonderbagshop").replace("[perm]", "wonderbagshop.command"));
                }
            } else {
                switch (args[0].toLowerCase()) {
                    case "info":
                    case "plugin":
                    case "pl":
                    case "version":
                    case "ver":
                        if (player.hasPermission("wonderbagshop.command.info") || player.hasPermission("wonderbagshop.admin") || player.isOp()){
                            sender.sendMessage(DefultValue.Prefix + "§8-------- §4Plugin-Info §8--------");
                            sender.sendMessage(DefultValue.Prefix + "§2");
                            sender.sendMessage(DefultValue.Prefix + "§2This plugin was developed by §9JaTiTV §8(german)§2.");
                            sender.sendMessage(DefultValue.Prefix + "§2");
                            sender.sendMessage(DefultValue.Prefix + "§2Twitch: §ehttps://www.twitch.tv/jatitv");
                            sender.sendMessage(DefultValue.Prefix + "§2Support-Discord: §eComming Soon!");
                            sender.sendMessage(DefultValue.Prefix + "§2Spigot: §eComming Soon!");
                            sender.sendMessage(DefultValue.Prefix + "§2");
                            sender.sendMessage(DefultValue.Prefix + "§2Version: §9" + Main.getPlugin().getDescription().getVersion());
                            sender.sendMessage(DefultValue.Prefix + "§2API: §9" + Main.getPlugin().getDescription().getAPIVersion());
                            sender.sendMessage(DefultValue.Prefix + "§2");
                            sender.sendMessage(DefultValue.Prefix + "§8--------------------------");

                            if (Bukkit.getPluginManager().getPlugin("NBTAPI") == null) {
                                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                        "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefultValue.PrefixHC);
                                player.sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                        "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefultValue.PrefixHC);
                            }
                            if (Bukkit.getPluginManager().getPlugin("Vault") == null) {
                                Bukkit.getConsoleSender().sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4Vault could not be connected / found! §9Please download it here: " +
                                        "§6https://www.spigotmc.org/resources/vault.34315/§4\n" + DefultValue.PrefixHC);
                                player.sendMessage(DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§4NBTAPI could not be connected / found! §9Please download it here: " +
                                        "§6https://www.spigotmc.org/resources/nbt-api.7939/§4\n" + DefultValue.PrefixHC);
                            }

                        } else {
                            player.sendMessage(DefultValue.NoPermission.replace("[cmd]", "/wonderbagshop info")
                                    .replace("[perm]", "wonderbagshop.command.info"));
                        }
                        break;
                    case "reload":
                    case "rl":
                        if (player.hasPermission("wonderbagshop.command.reload") || player.isOp()){
                        Reload.reloadConfirmPlayer(player);
                        } else {
                            player.sendMessage(DefultValue.NoPermission.replace("[cmd]", "/wonderbagshop reload")
                                    .replace("[perm]", "wonderbagshop.command.reload"));
                        }
                        break;
                    case "help":
                    default:
                        if (player.hasPermission("wonderbagshop.command.admin") || player.isOp()){
                            player.sendMessage(DefultValue.Help);
                        } else {
                            player.sendMessage(DefultValue.NoPermission.replace("[cmd]", "/wonderbagshop help")
                                    .replace("[perm]", "wonderbagshop.command"));
                        }
                        break;
                }
            }
        } else {
            if (args.length == 1) {
                switch (args[0].toLowerCase()) {
                    case "info":
                    case "plugin":
                    case "pl":
                    case "version":
                    case "ver":
                        sender.sendMessage(DefultValue.PrefixHC + "§8-------- §4Plugin-Info §8--------");
                        sender.sendMessage(DefultValue.PrefixHC + "§2");
                        sender.sendMessage(DefultValue.PrefixHC + "§2This plugin was developed by §9JaTiTV §8(german)§2.");
                        sender.sendMessage(DefultValue.PrefixHC + "§2");
                        sender.sendMessage(DefultValue.PrefixHC + "§2Twitch: §ehttps://www.twitch.tv/jatitv");
                        sender.sendMessage(DefultValue.PrefixHC + "§2Support-Discord: §eComming Soon!");
                        sender.sendMessage(DefultValue.PrefixHC + "§2Spigot: §eComming Soon!");
                        sender.sendMessage(DefultValue.PrefixHC + "§2");
                        sender.sendMessage(DefultValue.PrefixHC + "§2Version: §9" + Main.getPlugin().getDescription().getVersion());
                        sender.sendMessage(DefultValue.PrefixHC + "§2API: §9" + Main.getPlugin().getDescription().getAPIVersion());
                        sender.sendMessage(DefultValue.PrefixHC + "§2");
                        sender.sendMessage(DefultValue.PrefixHC + "§8-----------------------------");
                        break;
                    default:
                        sender.sendMessage("§4\n" + DefultValue.PrefixHC + "§8------ §2Wonder§6Bag§9Shop §chelp §8------§4\n" + DefultValue.PrefixHC +
                                "§4\n" + DefultValue.PrefixHC + "§8'§b/wonderbagshop§8' §eOeffnet diese help.§4\n" + DefultValue.PrefixHC +
                                "§8'§b/wonderbagshop shop§8' §eOeffnet den Shop.§4\n" + DefultValue.PrefixHC + "§8'§b/wonderbagshop reload§8' §eLaed die Cofig neu.§4\n"
                                + DefultValue.PrefixHC + "§4\n" + DefultValue.PrefixHC + "§8----------------------------");
                        break;
                    case "rl":
                    case "reload":
                        Reload.reloadConfirmConsole();
                        break;
                }
            }else{
                sender.sendMessage("§8[§2Wonder§6Bag§9Shop§8] §cThis command is only for players!");
            }
        }
        return false;
    }


}
