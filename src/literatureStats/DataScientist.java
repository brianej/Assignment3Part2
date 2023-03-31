package literatureStats;

/**
 * This class sits atop of all the functionality.
 */
public class DataScientist {
    InformationDocument<FrequencyDocument>   experiment1Doc = null;
    InformationDocument<FrequencyDocumentPG> experiment2Doc = null;

    public void experiment1Phase1(){
        System.out.println("Phase 1.1");
        for ( String word :
                experiment1Doc.getTopNWords(300,
                                            SortingOrder.DESCENDING) ) {

            System.out.printf("%s\t->\t%s%n",
                              word,
                              Translation.DOG.translate(word));
        }
    }

    public void experiment1Phase2() {
        System.out.println("Phase 1.2");
        for ( String enumeratedWord :
                experiment1Doc.getTopNWordsEnumerated(3,
                                                      SortingOrder.DESCENDING) ) {

            System.out.print(enumeratedWord);
        }
    }

    public void experiment1Phase3() {
        System.out.println("Phase 1.3");

        for ( FrequencyWord fw :
                experiment1Doc.getTopNFrequencyWords(3,
                                                     SortingOrder.DESCENDING) ) {

            System.out.printf("%s\t->\t%s%n",
                              fw.toString("%4d\t%s"),
                              Translation.DOG.translate(fw));
        }
    }

    public void experiment2Phase1(){
        System.out.println("Phase 2.1");
        for ( String word :
                experiment2Doc.getTopNWords(3,
                                            SortingOrder.DESCENDING) ) {

            System.out.printf("%s\t->\t%s%n",
                              word,
                              Translation.DOG.translate(word));
        }
    }

    public void experiment2Phase2() {
        System.out.println("Phase 2.2");
        for ( String enumeratedWord :
                experiment2Doc.getTopNWordsEnumerated(3,
                                                      SortingOrder.DESCENDING) ) {

            System.out.print(enumeratedWord);
        }
    }

    public void experiment2Phase3() {
        System.out.println("Phase 2.3");

        for ( FrequencyWord fw :
                experiment2Doc.getTopNFrequencyWords(3,
                                                     SortingOrder.DESCENDING) ) {

            System.out.printf("%s\t->\t%s%n",
                              fw.toString("%4d\t%s"),
                              Translation.DOG.translate(fw));
        }
    }

    /**
     * Read one or more documents and calculate some word statistics.
     *
     * @param args A list of files to read
     */
    public void runExperiment1(String[] args) {
        System.out.printf("%nExperiment 1%n");

        try {
            experiment1Doc = new InformationDocument<>(FrequencyDocument.class,
                                                       args[0]);
            experiment1Phase1();
            experiment1Phase2();
            experiment1Phase3();
        } catch ( InstantiationException | IllegalAccessException e ) {
            throw new RuntimeException(e);
        }
    }

    /**
     * As @see DataScientist.runExperiment1() but treats the document as a Project Gutenberg document.
     *
     * @param args A list of files to read
     */
    public void runExperiment2(String[] args) {
        System.out.printf("%nExperiment 2%n");

        InformationDocument<FrequencyDocumentPG> ds;
        try {
            experiment2Doc = new InformationDocument<>(FrequencyDocumentPG.class,
                                                       args[0]);
            experiment2Phase1();
            experiment2Phase2();
            experiment2Phase3();
        } catch ( InstantiationException | IllegalAccessException e ) {
            throw new RuntimeException(e);
        }
    }
}
