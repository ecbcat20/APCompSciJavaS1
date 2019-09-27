package boyerMoore;
public class BoyerMoore {
    private final int radix = 256; //number of characters accounted for in the bad char array
    private int[] right; //bad character array
    private String target;
 
    /**
     * @param right
     * the 'bad character' array. this is a list of all characters,
     * whether or not they appear in the target string, and
     * their location in the string if they are in it.
     * if a character shows up more than once in the string,
     * the rightmost (highest) index is recorded in the array,
     * thus the name 'right'
     */
    public BoyerMoore(String target) {
        this.target = target;
        // populates bad character array
        right = new int[radix];
        for (int c = 0; c < radix; c++)
            right[c] = -1;
        for (int j = 0; j < target.length(); j++)
            right[target.charAt(j)] = j;
    }
 
    /**
     * Returns the index of the first occurrence of the pattern string
     * in the text string.
     *
     * @param  text is the field in which we are looking for a match to the target string
     * @return the index of the first target match found in the text, -1 if no match was found
     *        
     */
    public int search(String text) {
        int m = target.length();
        int n = text.length();
        int skip;
        for (int i = 0; i <= n - m; i += skip) {
            skip = 0;
            for (int j = m-1; j >= 0; j--) {
                if (target.charAt(j) != text.charAt(i+j)) {
                    skip = Math.max(1, j - right[text.charAt(i+j)]);
                    break;
                }
            }
            if (skip == 0) return i;
        }
        return -1;
    }
 
 
 
    public static String replace(String text, String target, String replacement) {
 
        BoyerMoore bmAlg = new BoyerMoore(target);
        int location = bmAlg.search(text);
        //loop will continue replacing instances of the pattern until the pattern is no longer found in the text
        while(location!=-1) {
            //if the pattern to be replaced is at the very beginning or end of the text, only one temporary string variable is needed
            if(location>0 && location<text.length()-target.length()) {
                String temp1 = text.substring(0, location);
                String temp2 = text.substring(location+target.length(), text.length());
                text = temp1+replacement+temp2;
            }
            else if(location > 0) {
                String temp = text.substring(0, location);
                text = temp+replacement;
            }
            else {
                String temp = text.substring(target.length(), text.length());
                text = replacement+temp;
            }
            location = bmAlg.search(text);
        }
 
        return text;
    }
 
 
    public static void main(String[] args) {
        String text = "Joe is writing a secret message to his best friend Joe, but Joe doesnt want evidence "
                + "of his involvement, so Joe is omitting one word from the document: Joe";
        String target = "Joe";
        String replacement = "[redacted]";
 
        String output = replace(text,target,replacement);
 
        System.out.println("result ---  " + output);
 
    }
}


