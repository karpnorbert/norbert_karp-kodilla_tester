package Application;

public class Application {
    String name;
    double age;
    double height;

    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkName() {
        if (this.name != null){
            if (age > 30 && height > 160) {
                System.out.println("User.User is older than 30 and taller than 160cm! ");
            } else {
                System.out.println("User.User is 30(or younger) or 160 cm (or shorter)!");
            }
        }
    }
}
