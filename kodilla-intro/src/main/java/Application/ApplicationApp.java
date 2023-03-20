package Application;

public class ApplicationApp {
    public static void main(String[] args) {

        Application application = new Application("Adam", 40.5, 178);

        System.out.println("Name is: " + application.name + " "+ "Age is: " + application.age + " " + "Height is: " + application.height);
        System.out.println(" ");
        application.checkName();
    }
}
