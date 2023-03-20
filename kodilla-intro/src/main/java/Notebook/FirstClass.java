package Notebook;

public class FirstClass {
    public static void main(String[] args) {
        System.out.println(" ");

        Notebook notebook = new Notebook(600, 1000, 2021);
        System.out.println("Notebook.Notebook weight: " + notebook.weight + " " + "Notebook.Notebook price: " + notebook.price + " " + "Notebook.Notebook year: " + notebook.year);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearAndPrice();
        System.out.println(" ");

        Notebook heavyNotebook = new Notebook(2000, 1500, 2010);
        System.out.println("heavyNotebook weight: " + heavyNotebook.weight + " " + "heavyNotebook price: " + heavyNotebook.price + " " + "heavyNotebook year: " + heavyNotebook.year);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearAndPrice();

        System.out.println(" ");

        Notebook oldNotebook = new Notebook(1600, 500, 2000);
        System.out.println("oldNotebook weight: " + oldNotebook.weight + " " + "oldNotebook price: " + oldNotebook.price + " " + "oldNotebook year: " + oldNotebook.year);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearAndPrice();
    }
}