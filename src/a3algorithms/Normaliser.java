package a3algorithms;

public class Normaliser {
    Normaliser() {}

    public static String noWhiteSpace(String original){
        String[] splitedString = new String[]{original.replace(" ", "")};

        return String.join("",splitedString);
    }

    /**
     * TODO: normalise: returns a standardised copy of a String.
     *  Normalised means:
     *     made entirely lowercase
     *     and with all leading and trailing whitespace removed.
     *
     * @param original
     * @return
     */
    public static String normalise(String original) {
        String[] splitedString = noWhiteSpace(original).split("");

        for (int i = 0; i < splitedString.length ; i++) {
            char ori = splitedString[i].charAt(0);

            if ((ori >= 'A') && (ori <= 'Z')){
                ori = (char) (ori + 32);
            }

            splitedString[i] = String.valueOf(ori);
        }

        return String.join("",splitedString);
    }
}
