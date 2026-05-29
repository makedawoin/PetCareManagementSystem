public class Pet {
    private String name;
    private int age;
    private String ownerName;

    public Pet(String name,int age, String ownerName) {
        this.name = name;
        setAge(age);
        this.ownerName = ownerName;
    }
    public void displayInfo() {
        System.out.println("Pet: " + getName() + " | Age: " + getAge()+ " | Owner: " + getOwnerName());
    }
    public String getName(){

        return name;
    }
    public int getAge() {

        return age;
    }

    public String getOwnerName() {
        return ownerName;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age)  {
      if (age >= 0){
          this.age = age;
      }
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void makeSound() {

        System.out.println("The pet makes a sound.");
    }
    public void feed() {

        System.out.println(getName()+" eats standard food.");
    }
    public void feed(String food) {
        System.out.println(getName()+ " eats " + food + ".");
    }
    public void feed (String food, int amount) {
        System.out.println(getName() + " eats " + amount + " grams of " + food + ".");
    }
}