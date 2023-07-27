package com.cbfacademy;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        float oparand1 = 12.0f;
        float operand2 = 20.0f;
        ArithmeticExercise exercise = new ArithmeticExercise();

        
        System.out.println(exercise.AddFloat(oparand1, operand2));
        System.out.println(exercise.SubtractFloat(oparand1, operand2));
        System.out.println(exercise.MultiplyFloat(oparand1, operand2));
        System.out.println(exercise.DivideFloat(oparand1, operand2));

    }
}
