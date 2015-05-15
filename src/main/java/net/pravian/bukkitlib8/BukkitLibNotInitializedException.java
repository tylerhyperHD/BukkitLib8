package net.pravian.bukkitlib8;

public final class BukkitLibNotInitializedException extends IllegalStateException {

    private static final long serialVersionUID = 1L;

    public BukkitLibNotInitializedException() {
        super("BukkitLib 8 was not initialized properly!");
    }
}
