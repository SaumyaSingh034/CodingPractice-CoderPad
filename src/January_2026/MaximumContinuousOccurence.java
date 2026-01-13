package January_2026;

public class MaximumContinuousOccurence {
    public static void main(String[] args) {
        String str = "aaabbcdddde";
        findMaximumContinuousOccurence(str);
        findMaximumContinuousOccurence("a");
        findMaximumContinuousOccurence("aa");
        findMaximumContinuousOccurence("ab");
        findMaximumContinuousOccurence("aaabbb");
        findMaximumContinuousOccurence("aaAAAbb");

    }

    private static void findMaximumContinuousOccurence(String str) {
        if (str == null || str.length() == 0) {
            System.out.println("Empty String");
            return;
        }

        int currentCount = 1;
        int maxCount = 1;
        char maxChar = str.charAt(0);
        str = str.toLowerCase();
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                currentCount++;
            } else {
                currentCount = 1;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxChar = str.charAt(i);
            }
        }
        System.out.println(maxChar + " ---> " + maxCount);


    }
}
