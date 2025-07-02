package OOPs.Inheritence;

public class Dog extends Animal {

    private String breed;

    public Dog() {
        super();
        System.out.println("Default constructor of Dog class");
    }
    public void walk(int numberOfLegs){
        System.out.println("Walk method called from sub class");
    }
    public Dog(String breed, int numberOfLegs, String sound) {
        super(numberOfLegs, sound);
        this.breed = breed;
        super.walk(numberOfLegs);
        System.out.println();
    }

    @Override
    public boolean isGoodForPet(boolean value) {
        System.out.println("isGoodForPet Method from child class");
//        boolean value1 = super.isGoodForPet(value);
//        System.out.println(value1);
        return !value;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}
