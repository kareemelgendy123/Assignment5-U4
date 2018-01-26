/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kareem
 */
public class A5Q3 {

    // Store all the characters on the stack
    private char[] stack;

    // Constructor
    public A5Q3() {
        
        // Creating a of stack of size 8
        stack = new char[8];
    }

    // Method that checks if the word is in the language or not
    public boolean inLang(String word) {
        
        // Looking for the dollar sign
        if (word.charAt(word.length() / 2) != '$') {
            return false;
        }
        
        // If the word is 2 or more characters long then
        if (word.length() >= 2) {

            // Put the characters into a stack
            for (int i = 0; i < word.length(); i++) {
                
                // Adding the letters into the stack
                stack[i] = word.charAt(i);
            }
            
            // If the first and last letters are the same
            if (stack[0] == stack[word.length() - 1]) {
                
                // Remove those characters
                word = word.substring(1, word.length() - 1);
                
                // Returning the word
                return inLang(word);
                
            } else {
                // Not in the language
                return false;
            }
        }
        // In the language
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Creating an object to run methods
        A5Q3 test = new A5Q3();
        
        // Testing different words
        String word = "cat$tac";
        System.out.println(word + ": " + test.inLang(word));
        
        word = "dog$cat";
        System.out.println(word + ": " + test.inLang(word));
    }
}