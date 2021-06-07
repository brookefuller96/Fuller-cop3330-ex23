import java.util.Scanner;
import java.lang.*;
import static java.lang.System.*;

public class Exercise23 {
    public static void main(String[] args) {

        System.out.println("Is the car silent when you turn the key? Y or N");
        Scanner input = new Scanner(in);
        String carsilent = input.nextLine();
        String Y = "Y";
        String N = "N";

        if (carsilent.equalsIgnoreCase(Y))
        {
            System.out.println("Are the battery terminals corroded?");
            Scanner input2 = new Scanner(in);
            String betterycorroded = input2.nextLine();

            if (betterycorroded.equalsIgnoreCase(Y))
                System.out.println("Clean terminals and try starting again.");
            if (betterycorroded.equalsIgnoreCase(N))
                System.out.println("Replace cables and try again.");

        return;
        }

        if (carsilent.equalsIgnoreCase(N)) {
            System.out.println("Does the car make a slicking noise?");
            Scanner input2 = new Scanner(in);
            String slickingnoise = input2.nextLine();

            if (slickingnoise.equalsIgnoreCase(Y))
                System.out.println("Replace the battery.");
            if (slickingnoise.equalsIgnoreCase(N))
            {
                System.out.println("Does the car crank up but fail to start?");
                Scanner input3 = new Scanner(in);
                String crankfail = input3.nextLine();

                if (crankfail.equalsIgnoreCase(Y))
                {
                    System.out.println("Check spark plug connections.");
                    return;
                }
                if (crankfail.equalsIgnoreCase(N))
                {
                    System.out.println("Does the engine start and then die?");
                    Scanner input4 = new Scanner(in);
                    String startdie = input4.nextLine();

                   if(startdie.equalsIgnoreCase(Y))
                   {
                       System.out.println("Does you car have fuel injection?");
                       Scanner input5 = new Scanner(in);
                       String fuelinjection = input5.nextLine();

                       if (fuelinjection.equalsIgnoreCase(Y))
                           System.out.println("Get it in for service.");
                       if(fuelinjection.equalsIgnoreCase(N))
                           System.out.println("Check to ensure the choke is opening and closing.");

                       return;
                   }
                    if(startdie.equalsIgnoreCase(N))
                        System.out.println("This should not be possible.");

                }

            }

        }

    }
}