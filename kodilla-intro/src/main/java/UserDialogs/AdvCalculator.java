package UserDialogs;

public class AdvCalculator {
    public static void main(String[] args) {
        AdvCalculator calculator = new AdvCalculator();
        double result = calculator.calculate();
        System.out.println("Result: " + result);
    }
    public double calculate() {
        String userSelected = UserDialogs.getUserSelection();
        int a = UserDialogs.getValue();
        int b = UserDialogs.getValue();
        switch (userSelected) {
            case "ADD": return a + b;
            case "SUB": return a - b;
            case "DIV": return a / b;
            case "MUL": return a * b;
            default: return 0;
        }
    }
}