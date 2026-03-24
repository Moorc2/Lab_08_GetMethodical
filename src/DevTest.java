import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Test getInt
        int number = SafeInput.getInt(in, "Enter any integer");
        System.out.println("You entered: " + number);

        // Test getDouble
        double decimal = SafeInput.getDouble(in, "Enter any decimal number");
        System.out.println("You entered: " + decimal);

        // Test getRangedInt
        int ranged = SafeInput.getRangedInt(in, "Enter a number", 1, 10);
        System.out.println("You entered: " + ranged);
    }
}