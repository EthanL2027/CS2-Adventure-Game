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
      
         command = getCommand("Do you go north or east");
         if (command.equals("north")){
            System.out.println("You see Garlic Pizzeria.");
         }
         else if (command.equals("east")){
            System.out.println("You illegaly enter the building and get shot by the doorman! Game Over! Press run to replay.");
         }
   
         command = getCommand("Would you like to go inside?");
         if (command.equals("yes")){
      System.out.println("pick a slice");
         }
         else if (command.equals ("no")){
            System.out.println("You get hit by a taxi! Game over! Press run to restart.");
         }
      command = getCommand("What slice would you like?");
         if (command.equals("cheese")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
              
         if (command.equals("cheese")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
        else if (command.equals("vodka")){
            System.out.println("Correct! Enjoy the slice!");
         }
         else if (command.equals("pasta")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
         else if (command.equals("grandma")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
         else if (command.equals("barbeque chicken")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
         else if (command.equals("peperoni")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
         else if (command.equals("hawian")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
       else if (command.equals("buffalo chicken")){
            System.out.println("Correct! Enjoy the slice!");
         }
      }
      
      
      else if ( command.equals("n") ) {
         System.out.println("You see Garlic Pizzeria.");
      
         command = getCommand("Would you like to go inside?");
         if (command.equals("yes")){
      System.out.println("pick a slice");
         }
         else if (command.equals ("no")){
            System.out.println("You get hit by a taxi! Game over! Press run to restart.");
         }
      command = getCommand("What slice would you like?");
         if (command.equals("cheese")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
        else if (command.equals("vodka")){
            System.out.println("Correct! Enjoy the slice!");
         }
         else if (command.equals("pasta")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
         else if (command.equals("grandma")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
         else if (command.equals("barbeque chicken")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
         else if (command.equals("peperoni")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
         else if (command.equals("hawian")){
            System.out.println("WRONG ANSWER! Game Over! Press run to replay.");
         }
       else if (command.equals("buffalo chicken")){
            System.out.println("Correct! Enjoy the slice!");
         }
         command=getCommand("Would you like to go north, east, or west");




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
      
       return command;
    } // END OF METHOD
 } // END OF CLASS
