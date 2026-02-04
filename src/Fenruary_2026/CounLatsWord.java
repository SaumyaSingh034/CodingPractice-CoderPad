package Fenruary_2026;

public class CounLatsWord {
    public static void main(String[] args){
        String input = "I am learning program";
       int length = 0;
       //int i = input.length()-1;
       for(int i=input.length()-1;i>=0;i--){
           if(input.charAt(i) == ' ')
               break;
           else
               length++;
       }
       System.out.println(length);
    }
}
