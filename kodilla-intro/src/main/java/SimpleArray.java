public class SimpleArray {
    public static void main(String[] args) {
        String[] pets = new String[5];
        pets[0] = "dog";
        pets[1] = "cat";
        pets[2] = "cow";
        pets[3] = "rhinoceros";
        pets[4] = "sheep";
        String pet = pets[3];
        System.out.println(pet);

        int number0fElements = pets.length;
        System.out.println("Moja tablica zawiera elementów: " + number0fElements);
    }
}
