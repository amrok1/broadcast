package me.amrok.broadcast;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;


public class nbc implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!sender.hasPermission("bc.use")) {
            sender.sendMessage("§c§lНет прав");
            return true;
        }
        if (args.length == 0) {
            sender.sendMessage("§6Использование команды abc:");
            sender.sendMessage("§6/nbc <текст> §f- (Можно использовать цветовой код)");
        }
        if (args.length > 0 && sender.hasPermission("bc.use")) {
            final String message = this.buildMessage(args);
            Bukkit.broadcastMessage("§6§lВНИМАНИЕ!§r " + message.replace("&", "§") + "§7(Написал: " + sender.getName() + "§7)");
            return false;
        }
        return false;
    }

    public String buildMessage(final String[] args) {
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < args.length; ++i) {
            builder.append(String.valueOf(args[i]) + " ");
        }
        return builder.toString();
    }
}

