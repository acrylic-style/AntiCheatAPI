package xyz.acrylicstyle.anticheat.api;

import org.bukkit.configuration.InvalidConfigurationException;
import xyz.acrylicstyle.tomeito_core.providers.ConfigProvider;

import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class AntiCheatConfiguration extends ConfigProvider {
    public AntiCheatConfiguration(String path) throws IOException, InvalidConfigurationException {
        super(path);
    }

    /**
     * @return Detects blink or not
     */
    public abstract boolean detectBlink();

    /**
     * Detects fly or not.<br />
     * Disable this option if your plugin uses velocity that goes up
     * @return Detects fly or not
     */
    public abstract boolean detectFly();

    /**
     * @return Detects click bot or not
     */
    public abstract boolean detectClickBot();

    /**
     * @return Detects speed or not
     */
    public abstract boolean detectSpeed();

    public abstract void setDetectBlink(boolean flag);

    public abstract void setDetectFly(boolean flag);

    public abstract void setDetectClickBot(boolean flag);

    public abstract void setDetectSpeed(boolean flag);

    /**
     * @return Max allowed value of PlayerMoveEvent packets/s.
     */
    public abstract int getBlinkPacketsThreshold();

    /**
     * @return Max allowed value of flight blocks/s
     */
    public abstract int getFlyVerticalThreshold();

    /**
     * @return Max allowed value of clicks per second, aka cps.
     */
    public abstract int getClicksThreshold();

    /**
     * @return Max allowed value of speed, blocks/s
     */
    public abstract int getSpeedThreshold();

    public abstract void setBlinkPacketsThreshold(int i);

    public abstract void setFlyVerticalThreshold(int i);

    public abstract void setClicksThreshold(int i);

    public abstract void setSpeedThreshold(int i);
}
