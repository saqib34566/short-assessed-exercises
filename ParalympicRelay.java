// NAZMUS SAQIB

import java.util.Scanner; // Needed to make Scanner available

public class ParalympicRelay
{
    public static void main(String[] args)
    {
        askUser();
    }

    // UniversalRelaTeam record
    public static class UniversalRelayTeam
    {
        String country;
        int leg1;
        int leg2;
        int leg3;
        int leg4;
    }

    // getter methods for record, returns relevant field
    public static String getCountry(UniversalRelayTeam team) {
        return team.country;
    }
    public static int getLeg1(UniversalRelayTeam team) {
        return team.leg1;
    }
    public static int getLeg2(UniversalRelayTeam team) {
        return team.leg2;
    }
    public static int getLeg3(UniversalRelayTeam team) {
        return team.leg3;
    }
    public static int getLeg4(UniversalRelayTeam team) {
        return team.leg4;
    }

    // setters methods for record, changes the relevant field
    public static UniversalRelayTeam setCountry(UniversalRelayTeam team, String ctry) {
        team.country = ctry;
        return team;
    }
    public static UniversalRelayTeam setLeg1(UniversalRelayTeam team, int l1) {
        team.leg1 = l1;
        return team;
    }
    public static UniversalRelayTeam setLeg2(UniversalRelayTeam team, int l2) {
        team.leg2 = l2;
        return team;
    }
    public static UniversalRelayTeam setleg3(UniversalRelayTeam team, int l3) {
        team.leg3 = l3;
        return team;
    }
    public static UniversalRelayTeam setleg4(UniversalRelayTeam team, int l4) {
        team.leg4 = l4;
        return team;
    }


    // record initialisation method
    public static UniversalRelayTeam createTeam(String ctry, int l1, int l2, int l3, int l4)
    {
        UniversalRelayTeam newTeam = new UniversalRelayTeam();
        
        setCountry(newTeam, ctry);
        setLeg1(newTeam, l1);
        setLeg2(newTeam, l2);
        setleg3(newTeam, l3);
        setleg4(newTeam, l4);
        return newTeam;
    }

    // returns a string displaying the team information
    public static String convertTeamToString(UniversalRelayTeam team)
    {
        return "The " +getCountry(team)+ " team is: Leg 1, T" +getLeg1(team)+ "; Leg 2, T" +getLeg2(team)+ "; Leg 3, T" +getLeg3(team)+ "; Leg 4, T" +getLeg4(team);
    }

    // checks each leg if it is legal or not and returns a message
    public static String checkLegal(UniversalRelayTeam team)
    {
        int l1 = getLeg1(team);
        int l2 = getLeg2(team);
        int l3 = getLeg3(team);
        int l4 = getLeg4(team);

        String legalMessage = "";

        boolean isLegal1 = false;
        boolean isLegal2 = false;
        boolean isLegal3 = false;
        boolean isLegal4 = false;

        if (l1 == 11 || l1 == 13) {
            isLegal1 = true;
        }
        if(l2 == 61 || l1 ==62) {
            isLegal2 = true;
        }

        if (l3 == 35 || l3 == 36) {
            isLegal3 = true;
        }

        if (l4 == 51 || l4 == 52) {
            isLegal4 = true;
        }

        if (isLegal1 && isLegal2 && isLegal3 && isLegal4) { 
            legalMessage = ("All the legs are legal"); // executes if all legs are legal 
        } else {
            if (l1 != 11 && l1 != 13) {
                legalMessage += ("\nLeg 1 (T" +l1+ ") is not legal");
            }
            
            if(l2 != 61 && l2 != 62) {
                legalMessage += ("\nLeg 2 (T" +l2+ ") is not legal");
            }

            if(l3 != 35 && l3 != 36) {
                legalMessage += ("\nLeg 3 (T" +l3+ ") is not legal");
            }

            if(l4 != 51 && l4 != 52) {
                legalMessage += ("\nLeg 4 (T" +l4+ ") is not legal");
            }
        }
        return legalMessage;
    }

    // asks the user for event classification, country and each leg gives an output if it is legal or not
    public static void askUser()
    {
        int maxPoints = Integer.parseInt(inputString("What is the classification (maximum points) of this relay event? "));

        String country = inputString("What country is the team representing? ");
        int leg1 = Integer.parseInt(inputString("What is the disability class for leg 1? T"));
        int leg2 = Integer.parseInt(inputString("What is the disability class for leg 2? T"));
        int leg3 = Integer.parseInt(inputString("What is the disability class for leg 3? T"));
        int leg4 = Integer.parseInt(inputString("What is the disability class for leg 4? T"));

        UniversalRelayTeam userTeam = createTeam(country,leg1,leg2,leg3,leg4);

        System.out.println(convertTeamToString(userTeam));
        System.out.println(checkLegal(userTeam));
    }

    // returns the input given by the user after a message is displayed
    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);

        String response = scanner.nextLine();
        return response;
    }
}
