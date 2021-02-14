// This claas was created by JaTiTV


package de.jatitv.wonderbagshop.main;

import de.jatitv.wonderbagshop.commands.Reload;
import de.jatitv.wonderbagshop.config.Messages;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CmdExecuter_wbsrl implements CommandExecutor {


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (args.length == 0) {
                if (sender.hasPermission("wonderbagshop.command.reload") || sender.hasPermission("wondershop.admin") || sender.isOp()){
                    Reload.reloadConfirmPlayer((Player) sender);
                } else {
                    sender.sendMessage(Messages.NoPermission.replace("[command]", "/wonderbagshop info").replace("[permission]", "wonderbagshop.command.reload"));
                }
            }
        } else {
            if (args.length == 0) {
                Reload.reloadConfirmConsole();
            }else {
                sender.sendMessage("§8[§2Wonder§6Bag§9Shop§8] §cThis command is only for players!");
            }
        }
        return false;
    }
}