package literatureStats;

public enum SortingOrder {
    NORMAL(false),
    NOT_REVERSED(false),
    DESCENDING(false),
    ASCENDING(true),
    REVERSED(true);
    final boolean reversed = false; // TODO: Initialise this elsewhere

    /**
     * TODO: constructor.
     *  Ensure the class variable is initialised.
     *
     *  @param reversed
     */
    SortingOrder(boolean reversed) {
    }

    /**
     * TODO: isReversed() checks whether the named sort order is reversed
     *
     * @return
     */
    public boolean isReversed() {
        return false;
    }
}
