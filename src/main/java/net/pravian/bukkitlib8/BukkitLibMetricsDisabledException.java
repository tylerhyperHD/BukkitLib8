package net.pravian.bukkitlib8;

public final class BukkitLibMetricsDisabledException extends IllegalStateException {

    private static final long serialVersionUID = 1L;

    public BukkitLibMetricsDisabledException() {
        super("Metrics are disabled in BukkitLib 8");
    }
}
