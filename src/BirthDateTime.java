import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year    = SafeInput.getRangedInt(in, "Enter your birth year",  1950, 2015);
        int month   = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        // Use a switch to determine the valid day range based on the month
        // Group 1: 31-day months  (Jan, Mar, May, Jul, Aug, Oct, Dec)
        // Group 2: 30-day months  (Apr, Jun, Sep, Nov)
        // Group 3: February       (1-29, allowing for leap year)
        int maxDay;
        switch (month)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            maxDay = 31;
            break;
            case 4: case 6: case 9: case 11:
            maxDay = 30;
            break;
            default: // February
                maxDay = 29;
                break;
        }

        int day     = SafeInput.getRangedInt(in, "Enter your birth day",     1, maxDay);
        int hour    = SafeInput.getRangedInt(in, "Enter your birth hour",    1, 24);
        int minute  = SafeInput.getRangedInt(in, "Enter your birth minute",  1, 59);

        System.out.println("\nDate and Time of Birth:");
        System.out.printf("  %02d/%02d/%04d at %02d:%02d%n", month, day, year, hour, minute);
    }
}