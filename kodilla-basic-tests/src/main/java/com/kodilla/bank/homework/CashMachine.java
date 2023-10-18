package com.kodilla.bank.homework;
import java.util.ArrayList;
import java.util.List;

public class CashMachine {

    private List<Integer> operations = new ArrayList<>();

    public void payIn(int amount) {
        operations.add(amount);
    }

    public void payOut(int amount) {
        operations.add(-amount);
    }

    public void init(int amount) {
        operations.add(amount);
    }

    public int getSaldo() {
        int sum = 0;
        for (Integer amount : operations) {
            sum += amount;
        }
        return sum;
    }

    public double getAveragePayIn() {
        int sum = 0;
        for (int k = 1; k < operations.size(); k++) {
            if (operations.get(k) > 0)
                sum += operations.get(k);
        }
        return sum / getNumberOfTransactionsIn();
    }

    public double getAveragePayOut() {
        int sum = 0;
        for (int k = 1; k < operations.size(); k++) {
            if (operations.get(k) < 0)
                sum += operations.get(k);
        }
        return -sum / getNumberOfTransactionsOut();
    }


    public int getNumberOfTransactionsIn() {
        int counter = -1;
        for (Integer amount : operations) {
            if (amount > 0)
                counter++;
        }
        return counter;
    }
    public int getNumberOfTransactionsOut(){
        int counter = 0;
        for (Integer amount : operations) {
            if (amount < 0)
                counter++;
        }
        return counter;
    }
}


