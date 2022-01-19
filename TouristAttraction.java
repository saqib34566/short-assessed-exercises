// NAZMUS SAQIB
// BRIEF OVERVIEW OF PURPOSE

// this program gives information about certain tourist attractions that the user wants to know about,
// such as the opening time and whether or not it is open on bank holidays.


import java.util.Scanner; // Needed to make Scanner available

public class TouristAttraction
{
    public static void main(String[] args)
    {
        int repeat = Integer.parseInt(inputString("How many attractions do you need to know about? "));
        for(int i = 1; i<=repeat; i++)
        {
            askAttraction(i);
        }
    }

    // declaring the class Attraction with its fields
    static class Attraction
    {
        String attractionName;
        int openingTime;
        int closingTime;
        boolean bankHoliday;
    }

    // method that creates a new record of type Attraction
    public static Attraction createAttraction(String name, int openTime, int closeTime, boolean bankHoliday)
    {
        Attraction attraction = new Attraction();
        attraction.attractionName = name;
        attraction.openingTime = openTime;
        attraction.closingTime = closeTime;
        attraction.bankHoliday = bankHoliday;

        return attraction;
    }

    // asks the user what attraction they want know about and prints a message accordingly
    public static void askAttraction(int i)
    {
        String response = inputString("\nName attraction " + i + " ");

        System.out.println(attractionSelection(response));
    }

    // returns the correct information when an attraction name is given as an argument
    public static String attractionSelection(String attraction)
    {
        // initiating the different attraction records
        Attraction edenProject = createAttraction("The Eden Project", 9,6,true);
        Attraction tateModern = createAttraction("Tate Modern", 10, 4, false);
        Attraction londonZoo = createAttraction("London Zoo", 10, 7, true);

        String information;

        if(attraction.equals("The Eden Project")) {
            information = attractionInfo(edenProject, edenProject.bankHoliday);
        }
        else if (attraction.equals("Tate Modern")) {
            information = attractionInfo(tateModern, tateModern.bankHoliday);
        }
        else if (attraction.equals("London Zoo"))  {
            information = attractionInfo(londonZoo, londonZoo.bankHoliday);
        } else {
            information = "I have no information about that attraction";
        }

        return information;
    }

    // method prints out a different message if bank holiday is true or false
    public static String attractionInfo(Attraction attraction, boolean bankHol)
    {
        String message;

        if (bankHol == true)  {
            message = attraction.attractionName + " opens on bank holidays.";
        } else {
            message = attraction.attractionName + " does not open on bank holidays.";
        }
        
        //concatenates the opening and closing hour message the variable message
        message += "\nIt opens at " + attraction.openingTime + "am and closes at " + attraction.closingTime + "pm";

        return message;
    }

    // basic method that returns the response given by the user after being prompted
    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        String response = scanner.nextLine();
        return response;
    }
}
