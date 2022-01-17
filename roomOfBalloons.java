import java.util.Scanner; // Needed to make Scanner available

public class roomOfBalloons
{
    public static void main(String[] args)
    {
        //this prints out a warning stating values that should not be entered into the program, which would cause it to not work
        System.out.println("Do not enter negative numbers and entering strings as program will not function " +
                "\nand enter a decimal value for volume of balloon!");
        //calling all the input methods for the user to provide room length and balloon volume
        int lengthOfRoom = getLength();
        int widthOfRoom = getWidth();
        int heightOfRoom = getHeight();
        double volumeOfBalloon = getBalloonVolume();

        double volumeOfRoom = roomVolume(lengthOfRoom, widthOfRoom, heightOfRoom);
        int totalBalloons = finalRoomCalc(volumeOfRoom, volumeOfBalloon);
        System.out.println("Your room volume is " + volumeOfRoom + " m3");
        System.out.println("You need " + totalBalloons + " balloons.");

    }
    
    //returns the room length given by the user
    public static int getHeight()
    {
        String roomHeight;
        int intRoomHeight;
        Scanner scanner = new Scanner(System.in);

        System.out.println("input room Height in cm: ");
        roomHeight = scanner.nextLine();
        intRoomHeight = Integer.parseInt(roomHeight);

        return intRoomHeight;
    }
    
    //returns the room width given by the user
    public static int getWidth()
    {
        String roomWidth;
        int intRoomWidth;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("input room width in cm: ");
        roomWidth = scanner.nextLine();
        intRoomWidth = Integer.parseInt(roomWidth);

        return intRoomWidth;
    }
    
    //returns the room height given by the user
    public static int getHeight()
    {
        String roomHeight;
        int intRoomHeight;
        Scanner scanner = new Scanner(System.in);

        System.out.println("input room Height in cm: ");
        roomHeight = scanner.nextLine();
        intRoomHeight = Integer.parseInt(roomHeight);

        return intRoomHeight;
    }
    
    //return the volume of the room in m3 after given 3 differnt values as parameters.
    public static double roomVolume(int length, int width, int height)
    {
        double volume;
        double volumeM3;
        final int constant = 1000000;
        volume = length * width * height;
        volumeM3 = volume / constant;

        return volumeM3;
    }
    
    //returns the volume of the balloon in m3 given by the user
    public static double getBalloonVolume()
    {
        Scanner scanner = new Scanner(System.in);
        double balloonVolumeM3;

        System.out.println("What is the volume of the balloon in m3");
        balloonVolumeM3 = scanner.nextDouble();

        return balloonVolumeM3;
    }

    //returns the amount of balloons needed to to fill up a room for a given volume
    public static int finalRoomCalc(double r_volume, double b_volume)
    {
        double balloonsNeeded = r_volume / b_volume;

        return (int)balloonsNeeded;
    }
}

