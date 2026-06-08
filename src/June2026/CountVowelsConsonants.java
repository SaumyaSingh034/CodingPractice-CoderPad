package June2026;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String str = "automation";
        countVowelsConsonants(str);
    }

    private static void countVowelsConsonants(String str) {
        str = str.replaceAll("[^a-za-z]", "");
        if (str.isEmpty()) {
            throw new RuntimeException();
        }
        System.out.println(str);
        int vowles=0;
        int cons=0;
        for (char c : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c)!= -1)
                System.out.println("Vowels : " + c);
            else
                System.out.println("Consonants : " + c);


        }
    }
}
