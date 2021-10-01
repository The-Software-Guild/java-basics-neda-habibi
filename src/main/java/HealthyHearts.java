import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HealthyHearts {
    static String input = "";
    static int age;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your age?");
        try{
            input = reader.readLine();
            age = Integer.parseInt(input);
            int maxHeartRate = (220 - age);
            System.out.println("Your maximum heart rate should be " + maxHeartRate +" beats per minute");
            System.out.println("Your target HR Zone is " + (int)Math.floor( maxHeartRate*0.5 )
                    + " - " + (int)Math.ceil(maxHeartRate*0.85)+" beats per minute");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
