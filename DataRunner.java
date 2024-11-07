import java.util.Scanner;
//class instantiation
public class DataRunner {
  public static void main(String[] args) {
//Opens scanner class
    Scanner input = new Scanner(System.in);
/*Instantiates a UserStory object called elements which utilizes the information from each of the txt files
  and passes them as arguments for the UserStory constructor.
*/
    UserStory elements = new UserStory("atomic.txt", "symbol.txt", "name.txt","mass.txt");
    
    // prints the information for each of the elements.
    System.out.println(elements);
// Beginning of user input prompt which also gathers the users response to determine the next step of the program.
    System.out.println("Are you searching for information regarding a particular element?");
    String interest= input.nextLine();
/*
If the user responds yes to the prompt, they will then be prompted about which element they are interested in.
Their answer to this will then store that value as a variable and search the PeriodicTable[] array and find the
element with the same name using the method findElementByName(). Once it finds an element it will print the corresponding
information.
*/
if (interest.equalsIgnoreCase("yes")) {
    System.out.println("Which element are you searching for?");
    String decision = input.nextLine();
    // call a method that looks for the element in the array
 String results = elements.findElementByName(decision);
  System.out.println(results);

  // If the user responds no, this will be the output and the program will terminate.
}else{
  System.out.println("Good luck studying for your test!!!");
  }
//closes scanner
    input.close();
    
  }
}