package dev.fiepaw.my4ndpl;

import dev.fiepaw.my4ndpl.commandKeceabiez;
import org.bukkit.plugin.java.JavaPlugin;

public final class My4ndPL extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        commandKeceabiez commands = new commandKeceabiez();
        getCommand("keceabiez").setExecutor(new commandKeceabiez());
        getLogger().info("PLUGIN LU AKTIF TOL");


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
