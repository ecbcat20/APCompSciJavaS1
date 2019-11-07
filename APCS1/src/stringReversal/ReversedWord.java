package stringReversal;

import java.util.ArrayList;

public class ReversedWord {
    public String toBeReversed;

    ArrayList<Character> toBeReversed2 = new ArrayList<>();

    public ReversedWord(String s) {
        toBeReversed = s;
    }

    ArrayList<Character> addLetter() {
        for (int i = 0; i < toBeReversed.length(); i++) {
            toBeReversed2.add(toBeReversed.charAt(i));
        }
        return toBeReversed2;
    }

    String returnString() {
        String reversedWord = "";
        for (int i = toBeReversed2.size()-1; i >= 0; i--) {
            reversedWord += toBeReversed2.get(i);
        }
        return reversedWord;
    }

}