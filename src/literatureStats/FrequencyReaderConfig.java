package literatureStats;

public class FrequencyReaderConfig {
    public final String START_MARKER;

    public final String STOP_MARKER;

    public final String DOCUMENT_FILENAME;

    /**
     *  null is the default for empty markers: DO NOT CHANGE THIS.
     */

    public final static String EMPTY_MARKER = null;

    /**
     * Silent is the default verbosity: DO NOT CHANGE THIS.
     */
    public final static Verbosity DEFAULT_VERBOSITY = Verbosity.SILENT;

    private Verbosity verbosity;

    public FrequencyReaderConfig(String dictionaryFilename,
                                 String startMarker,
                                 String stopMarker,
                                 Verbosity verbosity) {

        this.START_MARKER      = startMarker;
        this.STOP_MARKER       = stopMarker;
        this.DOCUMENT_FILENAME = dictionaryFilename;
        this.verbosity         = verbosity;
    }

    /**
     * TODO: get the verbosity for the current configuration.
     *
      * @return
     */
    public Verbosity getVerbosity() {
        return verbosity;
    }

    /**
     * TODO: set the verbosity for the current configuration.
     * @param verbositywant
     */
    public void setVerbosity(Verbosity verbositywant) {
        verbosity = verbositywant;
    }
}
