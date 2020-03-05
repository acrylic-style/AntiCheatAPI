package xyz.acrylicstyle.anticheat.api;

import org.jetbrains.annotations.Nullable;

import java.lang.reflect.InvocationTargetException;

public final class AntiCheatAPIProvider {
    private AntiCheatAPIProvider() {}

    @Nullable
    public static AntiCheat getInstance() {
        try {
            return (AntiCheat) Class.forName("xyz.acrylicstyle.anticheat.AntiCheatPlugin").getMethod("getInstance").invoke(null);
        } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException e) {
            RuntimeException ex = new RuntimeException("AntiCheat plugin must be loaded to call this method.");
            ex.initCause(e);
            throw ex;
        }
    }
}
