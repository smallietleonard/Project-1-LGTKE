
import java.util.*; 

public class LGTKE {

  
  public static void main(String[] args) {


    Scanner user_input = new Scanner(System.in);

    System.out.println("Let's get to know eachother!\n\n");

    System.out.println("What's your favorite color?\n\n");

    String something = user_input.nextLine();

    System.out.println("\n\n");

    System.out.println("Yours is " + something + "?");
    System.out.println("\n\nMine is Red\n\n");

    System.out.println("Where were you born?\n\n");
    String response = user_input.nextLine();
    
    System.out.println("\n\nYou were born in " + response +"?");
    System.out.println("\n\nI was born in Appleton, WI\n\n");
    System.out.println("Have you ever been outside the USA?\n\n");
    String third = user_input.nextLine();
    System.out.println("\n\nCool! I have been to Mexico!\n\n");

    System.out.println("What is your favorite baseball team besides the Brewers?\n\n");
    String ew = user_input.nextLine();
    System.out.println("\n\nYou like the " + ew + "?\n\n");
    System.out.println("I only like the Brewers!\n\n");

    System.out.println("Finally, what is your favorite season?\n\n");
    String season = user_input.nextLine();
    System.out.println("\n\nReally...? " + season + "?\n\nMine is Summer :) ");
  }
}
