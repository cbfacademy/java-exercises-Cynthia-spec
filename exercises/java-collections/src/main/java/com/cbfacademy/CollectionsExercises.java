package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list

        LinkedList<Integer> newList = new LinkedList<Integer>();
        newList.addFirst(4); // 0
        newList.add(5);
        newList.add(6);
        newList.add(8);
        newList.add(2);
        newList.add(9); 
        newList.add(7);
        newList.add(0);
        newList.add(3, 4);

        int element = newList.element();

        System.out.println(element);

        return newList;

        
        //throw new RuntimeException("Not implemented");
    }

    public Stack<Integer> useStack() {
        
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack

        Stack<Integer> stack = new Stack<Integer>();

        stack.add(5);
        stack.add(6);
        stack.add(8);
        stack.add(9);
        System.out.println(stack.firstElement());
        stack.pop(); 
        stack.push(4); 

        return stack;

       // throw new RuntimeException("Not implemented");

        
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
        //throw new RuntimeException("Not implemented");

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<Integer>();
        arrayDeque.add(5);
        arrayDeque.add(6);
        arrayDeque.add(8);
        arrayDeque.add(9);
        arrayDeque.peek();
        arrayDeque.getLast();
        arrayDeque.poll();
        arrayDeque.element();

    
        System.out.println(arrayDeque.peek());
        System.out.println(arrayDeque.getLast());
        System.out.println(arrayDeque.poll());
        System.out.println(arrayDeque.element());

        return arrayDeque;
        
    
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of keys from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map



        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "TypeScript");
        hashMap.put(2, "Kotlin");
        hashMap.put(3, "Python");
        hashMap.put(4, "Java");
        hashMap.put(5, "JavaScript");
        hashMap.put(6, "Rust");

        Set<Integer> keys = hashMap.keySet();
        System.out.println("Keys in the HashMap: " + keys);

        return hashMap;

         //throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Collections Exercises";
    }
}
