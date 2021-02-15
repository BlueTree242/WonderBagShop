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

import de.jatitv.wonderbagshop.config.Config;
import de.jatitv.wonderbagshop.config.Messages;
import de.jatitv.wonderbagshop.config.Shop;
import org.bukkit.Bukkit;

public class Disable {

    public static void disableSend(String version) {
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4-----------------------------------------------------------------------------------");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2 __          __             _           §6____               §9_____ _                 ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2 \\ \\        / /            | |         §6|  _ \\             §9/ ____| |                ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2  \\ \\  /\\  / /__  _ __   __| | ___ _ __§6| |_) | __ _  __ _§9| (___ | |__   ___  _ __  ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2   \\ \\/  \\/ / _ \\| '_ \\ / _` |/ _ \\ '__§6|  _ < / _` |/ _` |§9\\___ \\| '_ \\ / _ \\| '_ \\ ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2    \\  /\\  / (_) | | | | (_| |  __/ |  §6| |_) | (_| | (_| |§9____) | | | | (_) | |_) |");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2     \\/  \\/ \\___/|_| |_|\\__,_|\\___|_|  §6|____/ \\__,_|\\__, |§9_____/|_| |_|\\___/| .__/ ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2                                                    §6 __/ |                  §9| |    ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2                                                    §6|___/                   §9|_|    ");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Autor: §6JaTiTV");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4Version: §6" + version);
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§2");
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Config.configDisable();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Messages.messagesDisable();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Shop.shopDisable();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§8-------------------------------");
        Vault.vaultDisable();
        Bukkit.getConsoleSender().sendMessage(Messages.PrefixHC + "§4-----------------------------------------------------------------------------------");
    }

}
