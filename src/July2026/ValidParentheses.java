package July2026;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        String str1 = "()[]{}";
        String str2 = "(]";
        String str3 = "([{}])";
        System.out.println(checkValidParenthese(str1));
        System.out.println(checkValidParenthese(str2));
        System.out.println(checkValidParenthese(str3));
    }

    private static boolean checkValidParenthese(String str1) {
        if(str1 == null || str1.isEmpty()){
            throw new IllegalArgumentException("The String is either Null or Empty");
        }
        Stack<Character> stack = new Stack<>();
        for(char c : str1.toCharArray()){
           if( c == '(' || c == '{' || c == '['){
               stack.push(c);
           } else {
               if (stack.isEmpty())
                   return false;
               char open = stack.pop();
               if(c == ')' && open != '(') return false;
               if(c == '}' && open !='{') return false;
               if(c == ']' && open !='[') return false;
           }
        }
        return stack.isEmpty();
    }
}
