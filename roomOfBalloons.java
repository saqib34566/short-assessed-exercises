import java.util.Scanner;

public class roomOfBalloons
{
    public static void main(String[] args)
    {
        System.out.println("Do not enter negative numbers and entering strings as program will not function " +
                "\nand enter a decimal value for volume of balloon!");
        int lengthOfRoom = getLength();
        int widthOfRoom = getWidth();
        int heightOfRoom = getHeight();
        double volumeOfBalloon = getBalloonVolume();

        double volumeOfRoom = roomVolume(lengthOfRoom, widthOfRoom, heightOfRoom);
        int totalBalloons = finalRoomCalc(volumeOfRoom, volumeOfBalloon);
        System.out.println("Your room volume is " + volumeOfRoom + " m3");
        System.out.println("You need " + totalBalloons + " balloons.");

    }

    public static int getLength()
    {
        int roomLength;
        Scanner scanner = new Scanner(System.in);

        System.out.println("input room length in cm: ");
        roomLength = scanner.nextInt();

        return roomLength;
    }

    public static int getWidth()
    {
        int roomWidth;
        Scanner scanner = new Scanner(System.in);

        System.out.println("input room width in cm: ");
        roomWidth = scanner.nextInt();

        return roomWidth;
    }

    public static int getHeight()
    {
        int roomHeight;
        Scanner scanner = new Scanner(System.in);

        System.out.println("input room Height in cm: ");
        roomHeight = scanner.nextInt();

        return roomHeight;
    }

    public static double roomVolume(int length, int width, int height)
    {
        double volume;
        double volumeM3;
        final int constant = 1000000;
        volume = length * width * height;
        volumeM3 = volume / constant;

        return volumeM3;
    }

    public static double getBalloonVolume()
    {
        Scanner scanner = new Scanner(System.in);
        double balloonVolumeM3;

        System.out.println("What is the volume of the balloon in m3");
        balloonVolumeM3 = scanner.nextDouble();

        return balloonVolumeM3;
    }

    public static int finalRoomCalc(double r_volume, double b_volume)
    {
        double balloonsNeeded = r_volume / b_volume;

        return (int)balloonsNeeded;
    }
}
