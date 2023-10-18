package com.kodilla.basic_assertion;

public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }
    public int subtrack(int a1, int b2){
        return a1 - b2;
    }

    public double pow(double a2, int b3){
        double result = a2;
        for (int k = 2; k <= b3; k++){
            result *= a2;
        }
        return result;
   }

}

