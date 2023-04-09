package literatureStats;

import java.util.Map;
import java.util.TreeMap;

/**
 * A FrequencyDocument stores all the words and their words of an entire single
 * document or file.
 * <p>
 * Every instance must have a configuration file {@link FrequencyReaderConfig}
 */
public class FrequencyDocument {

    /**
     * TODO: words and frequencies stored in a data structure of whatever type you want.
     */
    protected Map<String, FrequencyWord> words;

    protected FrequencyReaderConfig config;

    protected String filename;

    protected String nonWordChars;

    /**
     * If calling the default constructor, you need to explicitly call one of the
     * initialise() methods before you can use the object safely.
     */
    public FrequencyDocument() {
    }

    /**
     * TODO: constructor based on a filename.
     *  For convenience have the constructor initialise the object
     *  and then read the document.
     *
     * @param filename
     */
    public FrequencyDocument(String filename) {
        this.filename = filename;
        initialise(filename);
        readDocument();
    }

    /**
     * TODO: constructor for filename and a pattern specifying characters
     *  that are not allowed in words. For convenience have the constructor
     *  initialise the object and then read the document.
     *
     * @param filename
     * @param nonWordChars
     */
    public FrequencyDocument(String filename, String nonWordChars) {
        this.filename = filename;
        this.nonWordChars = nonWordChars;
    }

    /**
     * TODO: constructor using a configuration object. For convenience have the
     *  constructor initialise the object and then read the document.
     *
     * @param config
     */
    public FrequencyDocument(FrequencyReaderConfig config) {
        this.config = config;
    }

    /**
     * TODO: constructor using a configuration object and a pattern
     *  specifying characters that are not allowed in words. For convenience
     *  have the constructor initialise the object and then read the document.
     *
     * @param config
     * @param nonWordChars
     */
    public FrequencyDocument(FrequencyReaderConfig config,
                             String nonWordChars) {
        this.config = config;
        this.nonWordChars = nonWordChars;
    }

    /**
     * TODO: set or reset the configuration object.
     *
     * @param config
     */
    public void setConfig(FrequencyReaderConfig config) {
        this.config = config;
    }

    /**
     * TODO: Initialise based on a configuration object.
     *
     * @param config
     */
    public void initialise(FrequencyReaderConfig config) {
    }

    /**
     * TODO: initialise based on the filename to read. You must provide
     *  default values for any that are not provided.
     *
     * @param filename
     */
    public void initialise(String filename) {
    }

    /**
     * TODO: initialise based on the filename to read and a pattern
     *  specifying characters that are not allowed in words. You must provide
     *   default values for any that are not provided.
     *
     * @param filename
     * @param nonWordChars
     */
    public void initialise(String filename, String nonWordChars) {
    }

    /**
     * TODO: initialise based on a configuration and a pattern specifying characters
     *  that are not allowed in words. This version of initialise() needs the
     *  full set of information provided.
     *
     * @param config
     * @param nonWordChars
     */
    public void initialise(FrequencyReaderConfig config, String nonWordChars) {
    }

    /**
     * TODO: gets the pattern showing the characters that are not allowed in words.
     *
     * @return
     */
    public String getNonWordChars() {
        return nonWordChars;
    }

    /**
     * TODO: sets the pattern of characters that are not allowed in words.
     *
     * @param nonWordChars
     */
    public void setNonWordChars(String nonWordChars) {
        this.nonWordChars = nonWordChars;
    }

    /**
     * TODO: readDocument() calls the helper class's method to read a file.
     *  In the method here, it may be necessary to convert the data structure
     *  returned into the one used in this class.
     */
    public void readDocument() {
    }

    /**
     * TODO: getStatsNormalisedWords() returns the statistics of normalised words
     *  with the String in the default format provided by the FrequencyWord class.
     *
     * @return
     */
    public String[] getStatsNormalisedWords() {
        return new String[]{"TODO FrequencyDocument.getStatsNormalisedWords()"};
    }

    /**
     * TODO: getStatsNormalisedWords() returns the statistics of normalised words
     *  with the String in the format provided by the parameter.
     *
     * @param pattern
     * @return
     */
    public String[] getStatsNormalisedWords(String pattern) {
        return new String[]{"TODO FrequencyDocument.getStatsNormalisedWords()"};
    }

    /**
     * TODO: printStatsNormalisedWords() prints the statistics of normalised words
     *  with the String in the default format provided by the FrequencyWord class.
     */
    public void printStatsNormalisedWords() {
    }

    /**
     * TODO: printStatsNormalisedWords() prints the statistics of normalised words
     *  with the String in the format provided by the parameter.
     *
     * @param pattern
     */
    public void printStatsNormalisedWords(String pattern) {
    }
}
