package Exception.CustomException;

import java.util.Scanner;

public class InvalidAgeFile {
  public static void main(String[] args) throws InvalidAgeException{
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your age ?");
    int age = scanner.nextInt();
    try{
        if (age < 18) {
            throw new InvalidAgeException("Age less then 18");
        } else {
            System.out.println("Please go ahead and vote");
        }
    }catch (InvalidAgeException e){
      System.out.println("Came to catch block");
        throw new InvalidAgeException("Age less then 18");
    }catch (Exception e){
      System.out.println("Came to generic");
    }finally{
      System.out.println("This is always executed irrespective of anything.");
    }
  }
}
