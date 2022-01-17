import java.util.Scanner;

public class ParkingCharges
{
    public static void main(String[] args)
    {
        String isDisabled = input("Are you disabled? ");
        if (isDisabled.equals("Yes") | isDisabled.equals("yes")) //checks both upper and lowercase responses
        {
            System.out.println("Parking for you is free");
            System.exit(0);
        }

        double parkingCharge = basicCharge();

        if (parkingCharge == 0) {
            //program stops when invalid parking hours given
            System.exit(0);
        } else {
            int discount = discounts();
            double finalCharge = parkingCharge - discount;
            System.out.println("the parking charge for you is "+finalCharge+" pounds");
        }
    }

    //simple method to take in an input after a message prompt
    public static String input(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

    //calculates the normal parking fee based on number hours and returns it
    public static double basicCharge()
    {
        int hours = Integer.parseInt(input("How many hours do you wish to park (1-8)? "));

        if (hours == 1) {
            return 3.00;
        }
        else if (hours >= 2 && hours <= 4) {
            return 4.00;
        }
        else if (hours == 5 | hours == 6 ) {
            return 4.50;
        }
        else if (hours == 7 | hours == 8) {
            return 5.50;
        }  else {
            //outputs when incorrect range of parking hours given
            System.out.println("invalid parking hours");
            return 0;
        }
    }

    //returns the amount of discounts to subtract form parking charge
    public static int discounts()
    {
        String isLocal = input("Do you have an \"I live locally badge\"? ");
        String isOAP = input("Are you an OAP? ");
        int discountCharge = 0;

        if (isLocal.equals("Yes") | isLocal.equals("yes")) {
            discountCharge += 1;
        } else {
            discountCharge += 0;
        }

        if (isOAP.equals("Yes") | isOAP.equals("yes")) {
            discountCharge += 2;
        } else {
            discountCharge += 0;
        }
        return discountCharge;
    }
}
