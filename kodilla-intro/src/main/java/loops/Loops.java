package loops;

public class Loops {
    public static void main(String[] args) {
       int[] numbers = {2,3,1,3,5};

       int suma = 0;

       for (int i = 0; i <= 4; i++){
           suma += numbers[i];
       }
       System.out.println(suma);
    }
}
