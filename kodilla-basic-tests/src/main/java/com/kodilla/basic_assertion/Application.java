package com.kodilla.basic_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        Calculator calculator1 = new Calculator();
        int a1 = 5;
        int b2 = 5;
        int sumResult1 = calculator1.subtrack(a1, b2);
        boolean correct1 = ResultChecker.assertEquals(0, sumResult1);
        if(correct1){
            System.out.println("Metoda subtrack działa poprawnie dla libcz " + a1 + " i " + b2);
        } else {
            System.out.println("Metoda subtrack nie działa poprawnie dla liczb " + a1 + " i " + b2);
        }

        Calculator calculator2 = new Calculator();
        double a2 = 2;
        int b3 = 4;
        double sumResult2 = calculator2.pow(a2, b3);
        boolean correct2 = ResultChecker.assertEquals(16, sumResult2);
        if(correct2){
            System.out.println("Metoda pow działa poprawnie dla libcz " + a2 + " i " + b3);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczb " + a2 + " i " + b3);
        }
    }
}