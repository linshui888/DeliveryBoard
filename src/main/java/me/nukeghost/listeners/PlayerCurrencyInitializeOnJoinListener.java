package me.nukeghost.listeners;

import me.nukeghost.DeliveryBoard;
import me.nukeghost.database.Database;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.UUID;

public class PlayerCurrencyInitializeOnJoinListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        UUID uuid = e.getPlayer().getUniqueId();
        if (!Database.doesPlayerEntryExist(uuid.toString())) {
            Database.saveCurrency(DeliveryBoard.defaultTokenAmount, uuid.toString());
        }
    }
}
