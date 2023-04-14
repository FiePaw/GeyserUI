package dev.fiepaw.my4ndpl;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.geysermc.cumulus.form.SimpleForm;
import org.geysermc.floodgate.api.player.FloodgatePlayer;
import org.jetbrains.annotations.NotNull;
import org.geysermc.floodgate.api.FloodgateApi;

import java.util.UUID;


public class commandKeceabiez implements CommandExecutor {

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command cmd, @NotNull String label, @NotNull String[] args) {
        if (!(sender instanceof Player)) { return true; }

        if (cmd.getName().equalsIgnoreCase("keceabiez")) {
            for(Player onlinePlayer : Bukkit.getOnlinePlayers()) {
                UUID uuid = onlinePlayer.getUniqueId();
                FloodgatePlayer player = FloodgateApi.getInstance().getPlayer(uuid);
                player.sendForm(SimpleForm.builder()
                        .title("§dNih Tod jan lama")
                        .content("§bGanti bahasa cug :v")
                        .button("§l§6kek nya keren dah")
                        .button("§l§aGua takut ada yang nyaingin ac")
                        .button("§l§cBissmilah")
                        .button("§l§eAllahuakbar").build());
            }
        }
        return true;
    }
}

