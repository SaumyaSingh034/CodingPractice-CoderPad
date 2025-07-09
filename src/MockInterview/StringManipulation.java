package MockInterview;

public class StringManipulation {
    public static void main(String[] args) {
        String input = "This is Goldman Sachs interview round";
        //This si Goldman shcaS interview dnuor
        reverseAlternateWords(input);
    }

    private static void reverseAlternateWords(String input) {
        if (input == null || input.isEmpty())
            throw new IllegalArgumentException("String is either null or empty");
        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) {
                StringBuilder reverse = new StringBuilder(words[i]);
                result.append(reverse.reverse()).append(" ");
            } else
                result.append(words[i]).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
