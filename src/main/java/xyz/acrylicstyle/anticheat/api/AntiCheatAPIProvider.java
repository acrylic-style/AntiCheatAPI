package xyz.acrylicstyle.anticheat.api;

import org.jetbrains.annotations.Nullable;
import util.reflect.Ref;

public final class AntiCheatAPIProvider {
    private AntiCheatAPIProvider() {}

    @Nullable
    public static AntiCheat getInstance() {
        return (AntiCheat) Ref.forName("xyz.acrylicstyle.anticheat.AntiCheatPlugin").getMethod("getInstance").invoke(null);
    }
}
