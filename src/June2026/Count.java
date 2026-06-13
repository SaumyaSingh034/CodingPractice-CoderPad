package June2026;

public class Count {
    public static void main(String[] args){
        String str = "Saumya123%$&&^&%##@SinghAutomation299@Singh";
        countLetterNumberSpecialChars(str);
    }

    private static void countLetterNumberSpecialChars(String str) {
        int countLetter = 0, countNum = 0, countSpecial = 0;
        for(char c: str.toCharArray()){
            if(Character.isDigit(c))
                countNum++;
            else if (Character.isLetter(c)) {
                countLetter++;
            }else{
                countSpecial++;
            }
        }
        System.out.println("Letter : "+countLetter+ " Number : "+countNum+" Special : "+countSpecial);
    }
}
