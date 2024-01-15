package me.amrok.broadcast;

import org.bukkit.plugin.java.JavaPlugin;

public final class BMain extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("nbc").setExecutor(new nbc());
        getCommand("bcspam").setExecutor(new spamcmd());
    }

    @Override
    public void onDisable() {
    }
}
