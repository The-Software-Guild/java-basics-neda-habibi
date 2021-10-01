import java.io.*;
import java.util.Random;

    public class DogGenetics {
        static Random rand = new Random();
        static String input = "";

        private static int GetPercentage(){
            return rand.nextInt(101) ;
        }

        public static void main(String[] args) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("What is your dog's name?");
                input = reader.readLine();
                System.out.println("Well then, I have this highly reliable report on " + input + "'s prestigious background right here." );
                System.out.println(input + " is:" );
                System.out.println(GetPercentage() + "% St. Bernard" );
                System.out.println(GetPercentage() + "% Chihuahua" );
                System.out.println(GetPercentage() + "% Dramatic RedNosed Asian Pug" );
                System.out.println(GetPercentage() + "% Common Cur" );
                System.out.println(GetPercentage() + "% King Doberman" );
                System.out.println("Wow, that's QUITE the dog!" );

            }
            catch(Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
