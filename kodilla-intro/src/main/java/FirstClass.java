public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 2000);
        System.out.println("Notebook weight: " + notebook.weight + " " + "Notebook price: " + notebook.price);

        Notebook oldNotebook = new Notebook(1600, 1000);
        System.out.println("oldNotebook weight: " + notebook.weight + " " + "oldNotebook price: " + notebook.price);

        Notebook heavyNotebook = new Notebook(2000, 500);
        System.out.println("heavyNotebook weight: " + notebook.weight + " " + "heavyNotebook price: " + notebook.price);
    }
}