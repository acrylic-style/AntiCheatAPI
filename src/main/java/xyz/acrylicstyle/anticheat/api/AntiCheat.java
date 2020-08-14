package xyz.acrylicstyle.anticheat.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.acrylicstyle.anticheat.api.command.CommandBindings;
import xyz.acrylicstyle.tomeito_api.providers.ConfigProvider;

import java.util.UUID;

public interface AntiCheat {
    /**
     * @param uuid UUID of player
     * @return Returns how many PlayerMoveEvent was called in the past 1 second.
     * @throws NullPointerException When invalid uuid was provided.
     */
    int getPlayerMoves(@NotNull UUID uuid);

    /**
     * @return Command bindings.
     */
    @NotNull
    CommandBindings getCommandBindings();

    /**
     * @return Returns version.yml
     */
    @NotNull
    ConfigProvider getVersionInfo();

    /**
     * @param uuid UUID of player
     * @return Returns how many PlayerInteractEvent (EquipmentSlot.HAND) was called in the past 1 second.
     * @throws NullPointerException When invalid uuid was provided.
     */
    int getPlayerClicks(@NotNull UUID uuid);

    /**
     * Get configuration of anti-cheat.
     * @return Returns AntiCheat Configuration.
     * @throws NullPointerException When configuration is null.
     */
    @NotNull
    AntiCheatConfiguration getConfiguration();
}
