package org.example.logics;

import java.util.Stack;

public class BalanceExpression {
    /**
     * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
     * An input string is valid if:
     * Open brackets must be closed by the same type of brackets.
     * Open brackets must be closed in the correct order.
     * Every close bracket has a corresponding open bracket of the same type.
     *
     */

    public static void main(String[] args) {

        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([)]"));     // false
        System.out.println(isValid("{[]}"));     // true
    }


    public static boolean isValid(String str){

        Stack<Character> characterStack = new Stack<>();
        if(str == null || str.isEmpty()){
            return  false;
        }

        for(char c: str.toCharArray())
        {
            if(c=='(' || c=='{'|| c=='['){
                    characterStack.push(c);
            } else if (c==')' || c=='}'|| c==']') {
                if (characterStack.isEmpty()) return  false;
                char top = characterStack.pop();
                if(c==')' && top!='(' ||
                   c=='}' && top!='{' ||
                   c==']' && top!='['
                ) {
                    return  false;
                }
            }else {
                return false;
            }
        }

        return characterStack.isEmpty();
    }
}
