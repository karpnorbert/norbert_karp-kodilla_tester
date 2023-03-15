public class FirstClass {
    public static void main(String[] args) {
        System.out.println(" ");

        Notebook notebook = new Notebook(600, 1000);
        System.out.println("Notebook weight: " + notebook.weight + " " + "Notebook price: " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();

        System.out.println(" ");

        Notebook heavyNotebook = new Notebook(2000, 1500);
        System.out.println("heavyNotebook weight: " + heavyNotebook.weight + " " + "heavyNotebook price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();

        System.out.println(" ");

        Notebook oldNotebook = new Notebook(1600, 500);
        System.out.println("oldNotebook weight: " + oldNotebook.weight + " " + "oldNotebook price: " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
    }
}