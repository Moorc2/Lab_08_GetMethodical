import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double total = 0.0;
        boolean moreItems = true;

        System.out.println("Welcome to the $10 Store!");

        while (moreItems)
        {
            double itemPrice = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 10.00);
            total += itemPrice;
            moreItems = SafeInput.getYNConfirm(in, "Do you have more items");
        }

        System.out.printf("%nYour total is: $%.2f%n", total);
    }
}