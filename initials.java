// NAME    Nazmus Saqib
// DATE    04/10/2021
// VERSION 1
// BRIEF OVERVIEW OF PURPOSE

// this program prints out the initials (NS) 
// as enlarged letters made up of smaller letters of the same initial

class initials
{
    public static void main (String [] a)
    {
        printNS();
        System.exit(0);
    }

    // prints out a large initial N using N characters
    public static void printN()
    {
        System.out.println("NN    N");
        System.out.println("N N   N");
        System.out.println("N  N  N");
        System.out.println("N   N N");
        System.out.println("N    NN");
        System.out.println();
        return;
    }

    // prints out a large initial S using S characters
    public static void printS()
    {
        System.out.println("SSSSS");
        System.out.println("S");
        System.out.println("SSSSS");
        System.out.println("    S");
        System.out.println("SSSSS");
        return;
    }

    // prints the initials NS in large, N first followed by S
    public static void printNS()
    {
        printN();
        printS();
        return;
    }
}