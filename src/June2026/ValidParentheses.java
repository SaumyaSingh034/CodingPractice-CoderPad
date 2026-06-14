package June2026;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args){
        String val = "{}{}()[]{}";
        System.out.println(isValid_airtel(val));

    }

    private static boolean isValid_airtel(String val) {
        Stack<Character> stack = new Stack<>();
        for(char c : val.toCharArray()){
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()) return false;
                char open = stack.pop();
                if(c == ')' && open != '(') return false;
                if(c == '}' && open != '{') return false;
                if(c == ']' && open != '[') return false;
            }
        }
        return stack.isEmpty();
    }
}
