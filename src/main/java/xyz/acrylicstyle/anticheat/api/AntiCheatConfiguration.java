package xyz.acrylicstyle.anticheat.api;

import util.CollectionList;
import xyz.acrylicstyle.tomeito_api.providers.ConfigProvider;

import java.util.List;
import java.util.UUID;

public abstract class AntiCheatConfiguration extends ConfigProvider {
    public AntiCheatConfiguration(String path) {
        super(path);
    }

    public abstract CollectionList<UUID> getBypassList();

    public abstract void setBypassList(List<UUID> list);

    public abstract void addBypassList(UUID uuid);

    public abstract void removeBypassList(UUID uuid);

    /**
     * Detects and automatically kicks player?<br />
     * Disabling this option will disable the player kick.
     * @return does detects and kicks player or not
     */
    public abstract boolean kickPlayer();

    public abstract void setKickPlayer(boolean flag);

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

    public abstract int getBlockBreaksThreshold();

    public abstract void setBlockBreaksThreshold(int i);

    public abstract void setBlinkPacketsThreshold(int i);

    public abstract void setFlyVerticalThreshold(int i);

    public abstract void setClicksThreshold(int i);

    public abstract void setSpeedThreshold(int i);

    public abstract void setDisableMovementCheck(boolean flag);

    public abstract boolean isDisableMovementCheck();
}
