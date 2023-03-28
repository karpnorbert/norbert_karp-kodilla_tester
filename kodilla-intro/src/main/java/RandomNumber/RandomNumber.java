package RandomNumber;

import java.util.Random;
class RandomNumber {
    private int minChoosenValue = Integer.MAX_VALUE;
    private int maxChoosenValue = Integer.MIN_VALUE;

    public void chooseNumber(int rangeFrom, int rangeTo, int limit) {
        Random random = new Random();
        int sum = 0;
        while (sum < limit) {
            int number = random.nextInt(rangeFrom, rangeTo + 1);
            sum += number;
            if (minChoosenValue > number)
                minChoosenValue = number;
            if (maxChoosenValue < number)
                maxChoosenValue = number;
        }
    }

    public int getMinChoosenValue() {
        return minChoosenValue;
    }

    public int getMaxChoosenValue() {
        return maxChoosenValue;
    }
}
