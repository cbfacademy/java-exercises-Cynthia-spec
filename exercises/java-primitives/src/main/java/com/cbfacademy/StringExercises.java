package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        //TODO - Write code that creates a String from the input array of characters

        String sentence = new String (characters);
        return sentence;
        
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are contained in the input ${text}

        if (text == null || text.isEmpty() || character == null) {
            return 0L;
        }
    
        long count = 0L;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                count++;
            }
        }
    
        return count;
    }
        
       
    

    public Boolean isPalindrome(String word) {
        /* TODO - Write code to determine whether the input ${word} is a palindrome */

        // Initializing an empty string to store the reverse
        // of the original string
        String reverseString = "";

        // Initializing a new boolean variable for the
        // answer
        boolean answer = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            reverseString = reverseString + word.charAt(i);
        }

         // Checking if both the strings are equal
         if (word.equals(reverseString)) {
            answer = true;
         }


         //if (word == reverseString) {
            //answer = true;
           // }
            
        
            return answer; 
        
          
         }
 


        //throw new RuntimeException("Not implemented");
    

    public String getName() {
        return "String Exercises";
    }
}
