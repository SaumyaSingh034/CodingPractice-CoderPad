package InterviewPreparation;

public class RemoveTrailingZero {
    public static void main(String[] args){
        String input= "0000012350609";
        removeTrailingZero(input);
    }

    private static void removeTrailingZero(String input) {
        int index = 0;
        char[] ch = input.toCharArray();
      for(int i=0;i<ch.length;i++){
          if(ch[i] != '0') {
              index = i;
              break;
          }

      }
      System.out.println(input.substring(index));
    }
}
