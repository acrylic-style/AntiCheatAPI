package xyz.acrylicstyle.anticheat.api;

import org.jetbrains.annotations.Nullable;
import util.reflect.Ref;

public final class AntiCheatAPIProvider {
    private AntiCheatAPIProvider() {}

    /**
     * @deprecated Use {@link AntiCheat#getInstance()} instead
     */
    @Nullable
    @Deprecated
    public static AntiCheat getInstance() {
        return AntiCheat.getInstance();
    }
}
