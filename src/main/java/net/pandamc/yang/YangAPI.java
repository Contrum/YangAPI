package net.pandamc.yang;

import net.pandamc.yang.knockback.KnockbackProfiler;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class YangAPI {

    public static void setKnockbackProfile(KnockbackProfiler profile) {
        throw new IllegalPluginAccessException("You using the oldest version or dont use Yang");
    }

    public boolean isInQueue(UUID uuid) {
        throw new IllegalPluginAccessException("You using the oldest version or dont use Yang");
    }

    public boolean isInMatch(UUID uuid) {
        throw new IllegalPluginAccessException("You using the oldest version or dont use Yang");
    }

    public boolean isInStaffMode(UUID uuid) {
        throw new IllegalPluginAccessException("You using the oldest version or dont use Yang");
    }

    public boolean isInSpectating(UUID uuid) {
        throw new IllegalPluginAccessException("You using the oldest version or dont use Yang");
    }

    public boolean isInEvent(UUID uuid) {
        throw new IllegalPluginAccessException("You using the oldest version or dont use Yang");
    }

    public boolean isInLobby(UUID uuid) {
        throw new IllegalPluginAccessException("You using the oldest version or dont use Yang");
    }
}
