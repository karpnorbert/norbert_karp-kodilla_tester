package random_number;

public class RandomNumberApp {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        randomNumber.chooseNumber(0, 30, 5000);
        System.out.println(randomNumber.getMinChoosenValue());
        System.out.println(randomNumber.getMaxChoosenValue());
    }
}
