package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine();
        cashMachine.init(24425);
        cashMachine.payIn(300);
        cashMachine.payIn(30342);
        cashMachine.payIn(667);
        cashMachine.payIn(7776);
        cashMachine.payOut(45);
        cashMachine.payOut(665);
        cashMachine.payOut(3659);
        System.out.println(cashMachine.getSaldo());
        System.out.println(cashMachine.getAveragePayOut());
        System.out.println(cashMachine.getAveragePayIn());
        System.out.println(cashMachine.getNumberOfTransactionsIn());
        System.out.println(cashMachine.getNumberOfTransactionsOut());
    }
}
