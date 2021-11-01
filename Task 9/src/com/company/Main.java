package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static double div(double firstNumber, double secondNumber){
        if(secondNumber == 0){
            throw new ArithmeticException("Cannot be divided by 0!");
        }
        return firstNumber / secondNumber;
    }

    static int readNumber(int start, int end, int number){
        if(number >= start && number <= end){
            return number;
        }
        else{
            throw new ArrayIndexOutOfBoundsException(number + " out of range of [" + start + ";" + end + "]!");
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double firstNumber = 52.5;
        double secondNumber = 0;
        try {
            System.out.println(div(firstNumber, secondNumber));
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        int number = 0;

        System.out.print("Enter number: ");
        try {
            number = Integer.parseInt(reader.readLine());
            System.out.println(readNumber(-5, 5, number));
        }catch (ArrayIndexOutOfBoundsException | NumberFormatException exception){
            System.out.println(exception.getMessage());
        }
    }
}
