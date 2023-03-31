package a3algorithms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BasicTextFileReader {
    BasicTextFileReader() {}

    public static ArrayList<String> allInput = new ArrayList<>();

    /**
     * TODO: readFile: read all the words of a file.
     *  Process lines in order.
     *  Remove charsToDelete.
     *  Split each line into its words.
     *  Add a normalised version of each word but only if it is not already present.
     *  Do not add "words" that are blank.
     *  Sample input: input/*.txt
     *
     * @param filename
     * @return
     */
    public static List<String> readFile(String filename) {
        final String charsToDelete = "[^A-Za-z0-9'\\s]+";

        try ( final Scanner sc = new Scanner(new File(filename)) ) {
            while ( sc.hasNextLine() ) {
                String line = sc.nextLine();
                String[] allInputA = line.split(" ");
//                System.out.println(Arrays.toString(allInputA) );

                for (int i = 0; i < allInputA.length; i++) {
//                    System.out.println(allInputA[i]);
//                    System.out.println(allInputA[i].length());
                    if ((allInputA[i] == " ") || (allInputA[i] == "") || (allInputA[i] == null) || (allInputA[i].length() == 0)) {
                        continue;
                    } else {
                        String normalised =
                                Normaliser.normalise(allInputA[i]);

                        if(!(allInput.contains(normalised))){
                            allInput.add(normalised);
                        }
                    }
                }
            }
        } catch ( FileNotFoundException e ) {
            throw new RuntimeException(e);
        }

        if (allInput.size() == 0){
            return null;
        } else {
            return allInput;
        }
    }

    public static void main(String[] args) {
//        String space = " ";
//        System.out.println(space.length());
        String file = "/Users/brianjauw/Downloads/Assignment3Part2/input" +
                "/macbeth" +
                ".txt";
        System.out.println(readFile(file));
    }
}
