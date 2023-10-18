package find_color;
import java.util.Scanner;

public class color {

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select 1-st letter of color (B, R, W, BL, Y) :");
            String find = scanner.nextLine().trim().toUpperCase();
            switch (find) {
                case "B": return "BROWN";
                case "R": return "RED";
                case "W": return "WHITE";
                case "BL": return "BLACK";
                case "Y": return "YELLOW";
                default:
                    System.out.println("Wrong letter. Try again.");
            }
        }
    }
}