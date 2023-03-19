public class UserApp {
    public static void main (String[] args) {
        User[] users = new User[5];
        users[0] = new User("Jan", 65);
        users[1] = new User("Katarzyna", 50);
        users[2] = new User("Janusz", 17);
        users[3] = new User("Lucjan", 31);
        users[4] = new User("Joanna", 35);
        double averageAge = calculateAverage(users);
        for (int k = 0; k < users.length; k++) {
            if (users[k].getAge() < averageAge) {
                System.out.println(users[k]);

            }
        }
    }


    private static double calculateAverage(User[] users) {
        double sum = 0;
        for (int k = 0; k < users.length; k++) {
            sum += users[k].getAge();
        }
        return sum / users.length;
    }
}
