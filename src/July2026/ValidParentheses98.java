package July2026;

import java.util.Stack;

public class ValidParentheses98 {
    public static void main(String[] args){
        String str = "( ) { } [ ]";
        System.out.println(findValidParenthes("()[]{}"));
        System.out.println(findValidParenthes("()"));
        System.out.println(findValidParenthes("(]"));
        System.out.println(findValidParenthes("([)]"));
        System.out.println(findValidParenthes("{[]}"));
    }

    private static boolean findValidParenthes(String str) {
        Stack<Character> stack = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if(c == ')' && top != '(') return false;
                if(c == '}' && top != '{') return false;
                if(c==']' && top != '[') return false;
            }

        }
        return stack.isEmpty();
    }
}
