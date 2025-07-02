package OOPs.Inheritence;

public class Animal {
    private int numberOfLegs;
    private String sound;
    private int numberOfEyes;

    public Animal(){
        System.out.println("Default constructor of parent class called.");
    }
    public Animal(int numberOfLegs, String sound) {
        System.out.println("parameterized constructor of parent class called.");
        this.numberOfLegs = numberOfLegs;
        this.sound = sound;
    }

    public void walk(int numberOfLegs){
        System.out.println("Walk method called from parent class");
        this.numberOfEyes = numberOfLegs/2;
    }

    public boolean isGoodForPet(boolean value){
        System.out.println("isGoodForPet Method from parent class");
        return value;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public int getNumberOfEyes() {
        return numberOfEyes;
    }

    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "numberOfLegs=" + numberOfLegs +
                ", sound='" + sound + '\'' +
                '}';
    }
}
