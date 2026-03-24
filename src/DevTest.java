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

        // Test getRangedDouble
        double rangedDec = SafeInput.getRangedDouble(in, "Enter a decimal number", 0.5, 10.0);
        System.out.println("You entered: " + rangedDec);

        // Test getYNConfirm
        boolean answer = SafeInput.getYNConfirm(in, "Do you want to continue");
        System.out.println("You answered: " + answer);

        // Test getRegExString - SSN pattern
        String ssn = SafeInput.getRegExString(in, "Enter a SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("SSN entered: " + ssn);

        // Test getRegExString - UC Student M number
        String mNum = SafeInput.getRegExString(in, "Enter your M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("M number entered: " + mNum);

        // Test getRegExString - menu choice
        String menuChoice = SafeInput.getRegExString(in, "Enter a menu choice [O]pen [S]ave [V]iew [Q]uit", "^[OoSsVvQq]$");
        System.out.println("Menu choice entered: " + menuChoice);
    }
}