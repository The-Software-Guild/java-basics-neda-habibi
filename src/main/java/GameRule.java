import java.io.*;
import java.util.Random;

public class GameRule {

    private static String WhoWins(int computerSelection, int userSelection){
        switch (computerSelection - userSelection) {
            case 0:
                return "tie";
            case 1:
            case -2:
                return "computer";
            case 2:
            case -1:
                return "user";
        }

        return "";
    }

    static Random rand = new Random();

    private static int GetComputerSelection(){
        return rand.nextInt(3) + 1;
    }

   public static void main(String[] args){
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String input = "yes";
       int roundNumber;
       int userSelection;
       int userWins;
       int computerWins;
       int ties;

       while (input.toLowerCase().equals("yes")){
           userWins = 0;
           computerWins = 0;
           ties = 0;

           try {
               System.out.print("How many rounds do you want to play: ");
               input = reader.readLine();
               roundNumber = Integer.parseInt(input);
               if(roundNumber > 10 || roundNumber < 1){
                   System.out.println("Round should be between 1 and 10");
                   return;
               }

               for (int i = 1;i <= roundNumber;i++) {
                   System.out.println("Select you Choice (1 = Rock, 2 = Paper, 3 = Scissors): ");
                   input = reader.readLine();
                   userSelection = Integer.parseInt(input);

                   if(userSelection < 1 || userSelection > 3) {
                       System.out.println("Wrong Choice!");
                       i--;
                       continue;
                   }

                   int computerSelection = GetComputerSelection();
                   String result = WhoWins(computerSelection, userSelection);

                   if(result.equals("user")) {
                        userWins++;
                   }
                   else if(result.equals("computer")){
                       computerWins++;
                   }
                   else if(result.equals("tie")){
                       ties++;
                   }

                   System.out.println("Computer: " + computerWins + " You: " + userWins + " ties: " + ties);
               }

               if(computerWins > userWins){
                   System.out.println("I Won!");
               }
               else if(userWins > computerWins){
                   System.out.println("You Won!");
               }
               else{
                   System.out.println("Tied!");
               }

               System.out.println("Do you want to play again?");
               input = reader.readLine();

           }
           catch(Exception e) {
               System.out.println("Please input a number!");
           }
     }
       System.out.println("Thanks for playing!");
   }
}
