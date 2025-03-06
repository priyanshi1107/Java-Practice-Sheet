package string;

import java.util.Stack;

public class ReverseWordInString {
    public static String reverseWord(String s) {
        Stack<String> stack = new Stack<>();
        String[] words = s.trim().split("\\s+");

        for(String word : words){
            stack.push(word);
        }

        StringBuilder reverse = new StringBuilder();

        while ( !stack.isEmpty() ){
            reverse.append(stack.pop());
            if(!stack.isEmpty()){
                reverse.append(" ");
            }
        }
        return reverse.toString();
    }
}
