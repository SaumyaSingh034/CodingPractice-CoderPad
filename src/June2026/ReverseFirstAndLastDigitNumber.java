package June2026;

public class ReverseFirstAndLastDigitNumber {
    public static void main(String[] args){
        int number = 42379;
       System.out.println( reverseFirstLastDigit67(number));
    }

    private static int reverseFirstLastDigit67(int number) {
        if(number < 10 && number > -10){
            return number;
        }
        int lastDigit = number%10;// --> 9
        int temp = number;
        int didgitCount = 0;
        while(temp >=10 ){
            temp /= 10;
            didgitCount++;
        }

        int firstDigit = temp;
        int placeValue = (int) Math.pow(10, didgitCount);
        int middlePart = (number % placeValue)/10;
        return (lastDigit * placeValue) +(middlePart *10) +firstDigit;

    }
}
