// NAZMUS SAQIB
// BRIEF OVERVIEW OF PURPOSE

// asks the user to continuously enter the destination of a departed train and by how many minutes it has been late
// when the user inputs "XXXX" the program outputs the total time late and the train that was late by the least amount

import java.util.Scanner; // Needed to make Scanner available

public class TrainCount
{
    public static void main(String[] args)
    {
        askDestination();
    }

    /*asks the user repeatedly for late departed trains, displaying least late train
    and total time late */
    public static void askDestination()
    {
        String dest;
        String shortestDest = "";
        int time;
        int totalTime = 0;
        int shortestTime = 1000;

        int count = 0
            
        dest = inputString("\nWhat is the destination of the train that just departed? ");
        while (!dest.toUpperCase().equals("XXXX")) //while loop stops when "XXXX" is entered
        {
            time = Integer.parseInt(inputString("How many minutes late was it? "));

            totalTime += time;
            if (time < shortestTime) {
                shortestTime = time;
                shortestDest = dest;
            }
            dest = inputString("\nWhat is the destination of the train that just departed? ");

            count++;
        }
        
        if (count == 0) {
            System.out.println("No trains have been late"); // executes when loop stops immediately
        } else {
            System.out.println("The trains were in total "+totalTime+" minutes late.");
            System.out.print("The most punctual train was to " + shortestDest + ". It was "+ shortestTime +" minute late.");
        }
    }

    // returns the input given by the user after a message is displayed
    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String response = scanner.nextLine();
        return response;
    }
}
