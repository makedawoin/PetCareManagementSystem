public class Cat extends Pet {
    public Cat(String name, int age, String ownerName){
        super(name, age, ownerName);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says:  Meow ");
    }
}

