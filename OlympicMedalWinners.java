// NAZMUS SAQIB
// BRIEF OVERVIEW OF PURPOSE

// asks the user to enter 5 olympians with their sport and number of medals won
// which the program outputs the average no. of medals between them all

import java.util.Scanner;

public class OlympicMedalWinners
{
    public static void main(String[] args)
    {
        askOlympian();
    }

    // asks the user to name 5 olympians, their sport and how many medals won
    public static void askOlympian()
    {
        final int MAX_SIZE = 5; //final variable for array size

        String[] olympianName = new String[MAX_SIZE];
        int[] noOfMedals = new int[MAX_SIZE];
        String[] sport = new String[MAX_SIZE];

        for (int i = 0; i < MAX_SIZE; i++)
        {
            olympianName[i] = inputString("\nName Olympians/Paralympian " +(i + 1)+ "? ");
            noOfMedals[i] = Integer.parseInt(inputString("How many medals did he/she win? "));
            sport[i] = inputString("What sport did he/she compete in? ");
        }

        average(noOfMedals, MAX_SIZE);
        reverseOrder(sport, olympianName, noOfMedals, MAX_SIZE);
    }


    // calculates the average amount of medals won in total
    public static void average(int[] medals, int max)
    {
        float total = 0;
        for (int i = 0; i < max; i++)
        {
            total += medals[i];
        }
        int average = (int)Math.rint(total/max);

        System.out.println("Between them they won an average of " + average +" medals each.\n");
    }

    // reverse order output with all values
    public static void reverseOrder(String[] sport, String[] name, int[] medals, int max)
    {
        for(int i = max; i > 0; i--)
        {
            System.out.println(sport[(i-1)] +", "+ name[(i-1)] +", "+ medals[(i-1)]);
        }
    }

    // returns the input given by the user after a message is displayed
    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
