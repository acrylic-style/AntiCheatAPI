package xyz.acrylicstyle.anticheat.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import util.reflect.Ref;
import xyz.acrylicstyle.anticheat.api.command.CommandBindings;

import java.util.UUID;

public interface AntiCheat {
    @Nullable
    static AntiCheat getInstance() {
        return (AntiCheat) Ref.forName("xyz.acrylicstyle.anticheat.AntiCheatPlugin").getMethod("getInstance").invoke(null);
    }

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
     * @param uuid UUID of player
     * @return Returns how many PlayerInteractEvent (EquipmentSlot.HAND) was called in the past 1 second, 0 if undefined
     */
    int getPlayerClicks(@NotNull UUID uuid);

    /**
     * @param uuid UUID of player
     * @return Returns maximum value of {@link #getPlayerClicks(UUID)}.
     */
    int getMaxPlayerClicks(@NotNull UUID uuid);

    /**
     * Get configuration of anti-cheat.
     * @return Returns AntiCheat Configuration.
     * @throws NullPointerException When configuration is null.
     */
    @NotNull
    AntiCheatConfiguration getConfiguration();
}
