package CoderpadQuestions;

public class DistanceBetweenStrings {

    // Input two words returns the shortest distance between their two midpoints in number of characters
    // Words can appear multiple times in any order and should be case insensitive.

    // E.g. for the document="Example we just made up"
    //   shortestDistance( document, "we", "just" ) == 4

    public static double shortestDistance(String document, String word1, String word2) {
        double shortest = document.length();
        String[] words = document.split("[,.]");
        int index = 0;
        double word1Loc = 0;
        double word2Loc = 0;
        for(String word : words){
            if(word.equalsIgnoreCase(word1))
                word1Loc = index + (word.length()/2d);
            else if (word.equalsIgnoreCase(word2)) {
                word2Loc = index + (word.length()/2d);

            }
            if(word1Loc > 0 && word2Loc > 0){
                double current = Math.abs(word1Loc - word2Loc);
                if(current < shortest){
                    shortest = current;
                }
            }
            index += word.length() + 1;
        }
        if(word1Loc == 0 || word2Loc == 0)
            return -1;


        return shortest;
    }

    public static boolean pass() {
        return  shortestDistance(document, "and", "graphic") == 6d &&
                shortestDistance(document, "transfer", "it") == 14d &&
                shortestDistance(document, "Design", "filler" ) == 25d ;
    }

    public static void main(String[] args) {
        if (pass()) {
            System.out.println("Pass");
        } else {
            System.out.println("Some Fail");
        }
    }

    private static final String document;
    static{
        StringBuffer sb = new StringBuffer();
        sb.append("In publishing and graphic design, lorem ipsum is a filler text commonly used to demonstrate the graphic elements");
        sb.append(" lorem ipsum text has been used in typesetting since the 1960s or earlier, when it was popularized by advertisements");
        sb.append(" for Letraset transfer sheets. It was introduced to the Information Age in the mid-1980s by Aldus Corporation, which");

        document = sb.toString();
    }
}