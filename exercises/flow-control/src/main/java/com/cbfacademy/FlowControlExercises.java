package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list

        List<String> list = new ArrayList<>();
        for(int i = 0; i < numbers.size(); i++) {
            Integer num = numbers.get(i);
            if(num % 3 == 0 && num % 5 == 0){
                list.add("FizzBuzz");
            }
            else if(num % 5 == 0){
                list.add("Buzz");
            }
            else if(num % 3 == 0) {
                list.add("Fizz");
            }
            else {
                list.add(num.toString());
            }
        }
    
        return list;

       // throw new RuntimeException("Not implemented");
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        
        switch (number) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "Invalid month number";
        }
    
    
        //throw new RuntimeException("Not implemented");
    }


    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++){
            numbers.add(i);
        }
        
        //  - determines the sum of all the even numbers in the list
         //  - determines the sum of all the odd numbers in the list
        Integer calculatedSumOfEvens = 0;
        Integer calculatedSumOfOdds = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                calculatedSumOfEvens += number;
            } else {
                calculatedSumOfOdds += number;
            }
        }
        
    
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

        Map<String, Integer> output = new HashMap<>();
        output.put("SumOfEvens", calculatedSumOfEvens);
        output.put("SumOfOdds", calculatedSumOfOdds);
        return output;

    
        //throw new RuntimeException("Not implemented");
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
       
        // Create a new ArrayList to store the reversed elements
        ArrayList<Integer> reverseList = new ArrayList<Integer>();
        
       // Traverse the input numbers list in reverse order and add elements to the reversedList
        for (int i = numbers.size() - 1; i >= 0; i--) {
           reverseList.add(numbers.get(i));
       }

        // Return the reversed list
        return reverseList;

        //throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}

