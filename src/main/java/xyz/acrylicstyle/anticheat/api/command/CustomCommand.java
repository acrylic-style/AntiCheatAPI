package xyz.acrylicstyle.anticheat.api.command;

import org.bukkit.entity.Player;

public interface CustomCommand {
    void onCommand(Player sender, String[] args);
}
