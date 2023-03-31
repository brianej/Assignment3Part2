package literatureStats;

import a3algorithms.TrollSpeaker;

import static literatureStats.FrequencyWord.VOWELS;

/**
 * Code to translate words according to the language is directly inside this enum.
 */
public enum Translation {
    NONE {@Override public String translate(String word) {return word;}},

    TROLL {@Override public String translate(String word) {return TrollSpeaker.translateIntoTroll(word);}},

    /* TODO: translate into British doggie speak. Dogs from different countries
        speak different doggie languages. British dogs speak like this:
        1. Move the first non-vowel cluster to the end of the word.
            This is everything up to but not including the first vowel.
        2. Append "ay" to the word unless:
           2.1 the word originally began with "b" in which case it ends "bark"
               before -> eforebark, but -> utbark
           2.2 the word originally began with "g" in which case it ends "grrrowl"
               with 3 rs but the "g" is the one that was originally at the start
               of the word:
               good	->	oodgrrrowl, great -> eatgrrrrowl, gutenberg -> utenberggrrrowl
           2.3 the word originally began with "r" in which case it ends "rrruf"
               with 3 rs but the first of those is the "r" that was originally
               at the start of the word:
               ross	->	ossrrruf, room	->	oomrrruf
           2.4 the word originally began with "w" in which case
               2.4.1 it ends "woof" with the "w" being the one that was
                     originally at the start of the word
                     was -> aswoof, who -> owhwoof
               2.4.2 unless the word orginally began "wo" in which case it ends
                     "woofWoof" (note the one capital W) where the first "w" is
                     the one that was originally at the start of the word:
                     work -> orkwoofWoof, would -> ouldwoofWoof
        Other examples:
          3 -> 3ay, a -> aay, ay -> ayay, ebook -> ebookay, under -> underay
          An empty word is unchanged.
     */
    DOG {
        public String vowelMover(String args){
            String[] argsSplited = args.split("");
            String[] argsNew = new String[argsSplited.length - 1];
            String nonVowels = "";

            for (int i = 1; i < argsSplited.length; i++) {
                if (VOWELS.contains(argsSplited[i])){
                    break;
                } else {
                    nonVowels = nonVowels + argsSplited[i];
                }
            }

            String[] nonVowelsSplited = nonVowels.split("");

            for (int i = nonVowelsSplited.length; i < (argsSplited.length + nonVowelsSplited.length); i++) {
                if ((i + nonVowelsSplited.length) <= argsSplited.length ) {
                    argsNew[i - nonVowelsSplited.length] = argsSplited[i];
                } else {

                }
            }

        }
        @Override
        public String translate(String word) {
            String translated = "";
            char firstChar = (word.substring(0,1)).charAt(0);
            String restWord = word.substring(1);

            if ((word == " ") || (word == "") || (word == null) || (word.length() == 0)) {
                translated = word;
            }

            switch (firstChar) {
                case 'b':
                    translated = restWord + "ark";
                case 'g':
                    translated = restWord + "rrrowl";
                case 'r':
                    translated = restWord + "rruf";
                case 'w':
                    String firstTwo = word.substring(0,2);
                    String restTwo = word.substring(2);
                    if (firstTwo == "wo"){
                        translated = restTwo + "oofWoof";
                    } else {
                        translated = restWord + "woof";
                    }
                    break;
                default: translated = word + "ay";
            }

            return translated;
        }
    };

    /**
     * TODO: Translates the word component of a {@link FrequencyWord}.
     *
     * @param frequencyWord
     * @return
     */
    public String translate(FrequencyWord frequencyWord) {
        return "TODO: Translation.translate(FrequencyWord)";
    }

    /**
     * The base pattern for translating. DO NOT CHANGE THIS IN ANY WAY.
     *
     * @param word
     * @return
     */
    public abstract String translate(String word);
}
