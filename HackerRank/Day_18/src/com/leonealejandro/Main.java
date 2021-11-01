package com.leonealejandro;

import java.util.*;

public class Main {

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    void pushCharacter(char c){
        stack.push(c);
    }

    void enqueueCharacter(char c){
        queue.add(c);
    }

    char popCharacter() {
        char x = stack.peek();
        stack.pop();
        return x;
    }

    char dequeueCharacter(){
        char y = queue.peek();
        queue.remove();
        return y;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Main p = new Main();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}
