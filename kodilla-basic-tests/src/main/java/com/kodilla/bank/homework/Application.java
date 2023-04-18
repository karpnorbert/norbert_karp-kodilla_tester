package com.kodilla.bank.homework;

public class Application {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine();
        cashMachine.init(94874);
        cashMachine.payIn(300);
        cashMachine.payIn(30342);
        cashMachine.payIn(667);
        cashMachine.payIn(7776);
        cashMachine.payOut(45);
        cashMachine.payOut(665);
        cashMachine.payOut(3659);
        System.out.println("Your saldo is equal: " + cashMachine.getSaldo() + " " + "EUR");
        System.out.println("Your Average PayOuts are equal: " + cashMachine.getAveragePayOut() + " " + "EUR");
        System.out.println("Your Average PayIns are equal: " + cashMachine.getAveragePayIn() + " " + "EUR");
        System.out.println("Your number of transaction In is equal: " + cashMachine.getNumberOfTransactionsIn());
        System.out.println("Your number of transaction Out is equal: " + cashMachine.getNumberOfTransactionsOut());
    }
}
