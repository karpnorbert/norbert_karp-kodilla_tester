package notebook;

public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void oldNotebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void heavyNotebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("This price is good");
        } else {
            System.out.println("This noteboook is expensiv!");
        }
    }

    public  void checkWeight(){
        if (this.weight <= 600) {
            System.out.println("This device is lightweight");
        } else if (this.weight > 600 && this.weight <= 1600){
            System.out.println("this device is not very heavy");
        } else {
            System.out.println("This device is heavy");
        }
    }
    public void checkYearAndPrice(){
        if (this.year > 2020 && this.price >= 1000){
            System.out.println("This notebook is new with good price, for sure it's worth to buy");
        } else if (this.year < 2021 && this.year > 2008 && this.price <= 1800){
            System.out.println("This notebook isn't worth to buy!");
        } else  if (this.year < 2010 && this.price <= 600){
            System.out.println("This notebook is to old and to expensiv!");
        } else {
            System.out.println("None of the criteria match your search!");
        }
    }
}
