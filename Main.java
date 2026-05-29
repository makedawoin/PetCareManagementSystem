public class Main {
    public static void main(String[] args) {
        Pet[] pets = new Pet[]{
                new Dog(" Simba ", 3, "Maki"),
                new Cat(" Lomi ", 2, "liya")
        };

        for( Pet pet : pets) {
            pet.displayInfo();
            pet.makeSound();
            pet.feed();
            pet.feed("chicken");
            pet.feed("chicken", 200);

            System.out.println();
        }
    }
}