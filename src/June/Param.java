package June;

import java.util.Stack;

public class Param {
    public static void main(String[] args){
        String str = "{{(())}}";
        System.out.println(balancedParen(str));
    }

    private static boolean balancedParen(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '{' || c== '(' || c == '[')
                stack.push(c);
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c == ')' && top !='(') || (c == '}' && top!='{')
                || (c == ']' && top != '[')){
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }
}
