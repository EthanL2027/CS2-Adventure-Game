 import java.util.Scanner;
 public class Main 
 {
    public static void main(String []args) 
    {
       System.out.println("Starting a new adventure...\n");
       
       System.out.println("Your goal is to get to Ethans house, but you must complete steps along the way");
       String command = ""; // stores the user's choices

       // STEP #1: Describe the current scenario
       System.out.println("You are at the center of Saint Vartens park in Murray Hill.");
       //STEP #2: Get user command
       command = getCommand("Do you go (e), (w), (n), or (s)");
       // STEP #3: Select a path based on the user's command
      if ( command.equals("e") ) {
         // NEXT BRANCH...
         System.out.println("You reach the Murray hill muse.");
      }
      else if ( command.equals("n") ) {
         System.out.println("You see Garlic Pizzeria.");
      }
      else if (command.equals("s")) {
         System.out.println("GAME OVER! You reached the FDR and are out of Murray hill. Press run to replay.");
      }
      else if (command.equals("w")) {
         System.out.println("GAME OVER! You reached the fence and got stuck in the park. Press run to replay");
      }


          
    } // END OF MAIN METHOD
    
    /** Method to prompt & process input for the next command
      * @param prompt to display to user, asks for specific input
      * @return user's input command as a lowercase String
    */
    public static String getCommand(String prompt) 
    {
       System.out.println("\n▶︎▶︎▶︎ " + prompt);
       Scanner scan = new Scanner(System.in);
       String command = scan.nextLine().toLowerCase();
       scan.close();
       return command;
    } // END OF METHOD
 } // END OF CLASS
