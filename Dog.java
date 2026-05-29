public class Dog extends Pet {

    public  Dog ( String name ,int age , String ownerName) {
        super(name, age ,ownerName);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says:  woof! Woof! ");
    }
}

