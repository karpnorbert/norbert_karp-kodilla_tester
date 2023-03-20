public class RandomNumberApp {
    public static void main(String[] args) {
        Randomizer randomizer = new Randomizer();
        randomizer.runCalculations();
        System.out.println(randomizer.getMax());
        System.out.println(randomizer.getMin());
    }
}
}
