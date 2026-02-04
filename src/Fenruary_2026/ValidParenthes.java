package Fenruary_2026;

import java.util.Stack;

public class ValidParenthes {
    public static void main(String[] args){
        String val = "{}{}()[]{}";
        System.out.println(isValidCheck(val));

    }

    private static boolean isValidCheck(String val) {
        Stack<Character> stack = new Stack<>();
        for(char c : val.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty())return false;
                char open = stack.pop();
                if(c == ')' && open != '(') return false;
                if(c == '}' && open != '{') return false;
                if(c == ']' && open != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
