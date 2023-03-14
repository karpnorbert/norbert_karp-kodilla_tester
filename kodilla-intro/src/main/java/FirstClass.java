public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(600, 100);
        System.out.println("Notebook weight: " + notebook.weight + " " + "Notebook price: " + notebook.price);
        notebook.checkPrice();

        Notebook oldNotebook = new Notebook(2000, 1500);
        System.out.println("oldNotebook weight: " + oldNotebook.weight + " " + "oldNotebook price: " + oldNotebook.price);
        oldNotebook.checkPrice();

        Notebook heavyNotebook = new Notebook(1600, 500);
        System.out.println("heavyNotebook weight: " + heavyNotebook.weight + " " + "heavyNotebook price: " + heavyNotebook.price);
        heavyNotebook.checkPrice();

    }
}