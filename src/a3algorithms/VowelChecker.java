package a3algorithms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VowelChecker {
     VowelChecker() {}

    /**
     * TODO: isVowel() checks if a String is one of the five English vowels (exclude "y")
     *    Assume lowercase input.
     *
     * @param s
     * @return
     */
    public static boolean isVowel(String s){
        boolean bool;
        char chs = s.charAt(0);

        switch (chs) {
            case 'a': bool = true;
            case 'e': bool = true;
            case 'o': bool = true;
            case 'i': bool = true;
            case 'u': bool = true;
                break;
            default: bool = false;
        }

        return bool;
    }
}
