package July2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class RemoveDuplicateAdjacentChar {
    public static void main(String[] args){
        String str = "abbaca";
        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();
        for(char c : str.toCharArray()){

            if(stack.isEmpty()) {
                stack.push(c);

            }
            else if(stack.peek() == c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        for(char c : stack){
            result.append(c);
        }
        System.out.println(result);
        }

    }

