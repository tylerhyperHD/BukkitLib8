package net.pravian.bukkitlib8.util;

import net.minecraft.server.v1_8_R2.EntityPlayer;
import net.minecraft.server.v1_8_R2.MinecraftServer;
import net.pravian.bukkitlib8.InternalExceptionHandler;

/**
 * Represents all Server-related utilities.
 */
public class ServerUtils {

    private ServerUtils() {
    }
    /**
     * Purges all whitelisted people from whitelist.txt.
     *
     * @return The amount of players removed from the whitelist whitelisted.
     */
    public static int purgeWhitelist() {
        String[] whitelisted = MinecraftServer.getServer().getPlayerList().getWhitelisted();
        int size = whitelisted.length;
       for (EntityPlayer player : MinecraftServer.getServer().getPlayerList().players) {
            MinecraftServer.getServer().getPlayerList().getWhitelist().remove(player.getProfile());
        }
        try
        {
            MinecraftServer.getServer().getPlayerList().getWhitelist().save();
        }
        catch (Exception ex)
        {
            InternalExceptionHandler.handle(ex);
        }        
        return size;
    }


    /**
     * Validates if the whitelist is enabled.
     *
     * @return true if the whitelist is enabled.
     */
    public static boolean whitelistEnabled() {
        return MinecraftServer.getServer().getPlayerList().getHasWhitelist();
    }

    /**
     * Enables/disables the whitelist.
     *
     * @param enabled true if the whitelist should be enabled.
     */
    public static void setWhitelistEnabled(boolean enabled) {
        MinecraftServer.getServer().getPlayerList().setHasWhitelist(enabled);
    }

    /**
     * Returns the version of the software running the server.
     *
     * @return The software version.
     */
    public static String getServerVersion() {
        return MinecraftServer.getServer().getVersion();
    }

    /**
     * Returns the MineCraft server instance running the server.
     *
     * @return The MinecraftServer instance.
     */
    public static MinecraftServer getMineCraftServer() {
        return MinecraftServer.getServer();
    }
}
