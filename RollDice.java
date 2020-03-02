import java.util.Random;
import java.util.Scanner;

/**
 * This program generates a random number based on user input.
 * 
 * @author BenHilderman
 * @version 1.0
 * @since 2020-03-01
 */

public class RollDice {
  // Variables
  static int minInt;
  static int maxInt;
 
  /**
  * Generate random int.
  */
 
  public static void diceRoll(int minInt, int maxInt) {
    Random random = new Random();

    int randomInt = random.nextInt((maxInt - minInt) + 1) + minInt;
    System.out.println("The random number: " + randomInt);
  }
  
  /**
  * User enters minimum and maximum.
  */
  
  public static void main(String[] args) {

    // Create scanner object
    Scanner userInput = new Scanner(System.in);
    System.out.print("Enter the minimum number: ");
    try {
      // User inputs the maximum number
      minInt = userInput.nextInt();
      System.out.print("Enter the maximum number: ");
      try {
        maxInt = userInput.nextInt();
        
        // If max number is > than min, generate random int
        if (maxInt > minInt) {
          diceRoll(minInt, maxInt);

        } else {
          System.out.print("Invalid input");
        }

      } catch (Exception e) {
        System.out.print("Invalid input");
      }

    } catch (Exception e) {
      System.out.print("Invalid input");
    }
  }
}