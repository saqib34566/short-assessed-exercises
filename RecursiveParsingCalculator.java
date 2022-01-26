// NAZMUS SAQIB
// BRIEF OVERVIEW OF PURPOSE

//program recusively parses an expression input as a string
// from the following recursively defined language: 
// <EXP> = * <DIGIT> <EXP> | T <EXP> | <DIGIT>
// <DIGIT> = 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | A | B | C 

import java.util.Scanner; // Needed to make Scanner available

public class RecursiveParsingCalculator
{
    
    public static void main(String[] args)
    {
        String expression = inputString("Please input the expression ");
        int answer = evaluateEXP(expression);

        print("The answer is " + answer);
    }
    
    // evaluates a given expression through recursion 
    public static int evaluateEXP (String expression)
    {
        int result;
        int length = expression.length();
        if (length == 1)//length of 1 means its a <digit>
        {
            result = evaluateDigit(expression);
        } else {
            result = evaluateMult(expression);
        }

        return result;
    }

    //recusively evaluates expressions by parsing it each iteration
    public static int evaluateMult(String expression)
    {
        int num1;
        int num2;
        int result;

        //checks if first character is "*"
        if (nextChar(expression).equals("*"))
        {
            String rest = remainingChars(expression);
            String second = nextChar(rest);
            String end = remainingChars(rest);

            num1 = evaluateDigit(second);
            num2 = evaluateEXP(end); //calls rescursive method  evaluateEXP
            
            result = num1 * num2;
            
        } else if(nextChar(expression).equals("T")) { /*checks if first character is "T" */
            String rest = remainingChars(expression);
            int remaining = evaluateEXP(rest); //recursive call 
            result = (remaining) + (remaining + 1) + (remaining + 2);
        } else {
            String first = nextChar(expression);
            String rest = remainingChars(expression);
            String end = remainingChars(rest);

            num1 = evaluateDigit(first);
            num2 = evaluateEXP(end);

            result = num1 * num2;
        }
        return result;
    }

    // corresponding integer of the string is given
    public static int evaluateDigit(String input)
    {
        //checks string for all possible digits
        int result = -1;
        if(input.equals("0")) result = 0;
        else if(input.equals("1")) result = 1;
        else if(input.equals("2")) result = 2;
        else if(input.equals("3")) result = 3;
        else if(input.equals("4")) result = 4;
        else if(input.equals("5")) result = 5;
        else if(input.equals("6")) result = 6;
        else if(input.equals("7")) result = 7;
        else if(input.equals("8")) result = 8;
        else if(input.equals("9")) result = 9;
        else if(input.equals("A")) result = 10;
        else if(input.equals("B")) result = 11;
        else if(input.equals("C")) result = 12;
        else quit();
        
        return result;
    }

    //gets the first character of the string
    public static String nextChar(String input)
    {
        return input.substring(0,1);
    }

    //returns remaining string excluding first character
    public static String remainingChars(String input)
    {
        return input.substring(1);
    }

    //quits the program if incorrect expression given
    public static void quit ()
    {
        print("youre expression is invalid");
        System.exit(0);
    }

    //generic method for taking an input from the user after a prompt
    public static String inputString(String message)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String response = scanner.nextLine();
        return response;
    }
    
    // generic method to print a message
    public static void print(String message)
    {
        System.out.println(message);
    }
}
