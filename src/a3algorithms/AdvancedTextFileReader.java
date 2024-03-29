package a3algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdvancedTextFileReader {
    public static ArrayList<String> allInput = new ArrayList<>();


    public static final String START_MARKER = "**START";
    public static final String STOP_MARKER  = "**STOP";

    AdvancedTextFileReader() {}

    /**
     * TODO: advancedReadFile: read all the words of a file between two specific lines.
     *  Process lines in order.
     *  Skip all lines up to and including the start marker.
     *  Process every line (in order) up to but excluding the stop marker.
     *  Process these lines the same as BasicTextFileReader.readFile().
     *  Sample file: input/advanced-01-portion.txt
     *
     * @param filename
     * @return
     */
    public static List<String> advancedReadFile(String filename) {
        final String charsToDelete = "[^A-Za-z0-9'\\s]+";

        boolean started = false;

        try ( final Scanner sc = new Scanner(new File(filename)) ) {
            while ( sc.hasNextLine() ) {
                String line = sc.nextLine();
                String[] allInputA = line.split(" ");
                String starter = allInputA[0];

                if (starter.equals(STOP_MARKER)){
                    started = false;
                }

                if (started){
                    for (int i = 0; i < allInputA.length; i++) {
                        if ((allInputA[i] == " ") || (allInputA[i] == "") || (allInputA[i] == null) || (allInputA[i].length() == 0)) {
                            continue;
                        } else {
                            ArrayList<String> newWord = new ArrayList<>();
                            String newWordS = "";

                            String normalised =
                                    Normaliser.normalise(allInputA[i]);

                            String[] wordSplit = normalised.split("");

                            for (int j = 0; j < wordSplit.length; j++) {
                                if (!(wordSplit[j].matches(charsToDelete))){
                                    newWord.add(wordSplit[j]);
                                }
                            }

                            for (String words : newWord){
                                newWordS += words;
                            }

                            if((!(allInput.contains(newWordS))) && (!((newWordS == " ") || (newWordS == "") || (newWordS == null) || (newWordS.length() == 0)))){
                                allInput.add(newWordS);
                            }
                        }
                    }
                }

                if (starter.equals(START_MARKER)) {
                    started = true;
                }

            }
        } catch ( FileNotFoundException e ) {
            throw new RuntimeException(e);
        }

        return allInput;
    }
}
