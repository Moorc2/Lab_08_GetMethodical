import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int favInt = SafeInput.getInt(in, "Enter your favorite integer");
        double favDouble = SafeInput.getDouble(in, "Enter your favorite decimal number");

        System.out.println("\nYour favorite integer is: " + favInt);
        System.out.println("Your favorite decimal number is: " + favDouble);
    }
}