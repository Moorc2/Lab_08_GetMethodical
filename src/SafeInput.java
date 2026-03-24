import java.util.Scanner;

public class SafeInput {

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";
        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return any valid int entered by the user
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        boolean validInput = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                validInput = true;
            }
            else
            {
                System.out.println("That is not a valid integer. Please try again.");
                pipe.next(); // read and discard the trash
            }
            pipe.nextLine(); // newline fix - clear the rest of the line
        } while (!validInput);

        return retVal;
    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return any valid double entered by the user
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        boolean validInput = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                validInput = true;
            }
            else
            {
                System.out.println("That is not a valid decimal number. Please try again.");
                pipe.next(); // read and discard the trash
            }
            pipe.nextLine(); // newline fix - clear the rest of the line
        } while (!validInput);

        return retVal;
    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low    the inclusive lower bound of the valid range
     * @param high   the inclusive upper bound of the valid range
     * @return a valid int within the specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        boolean validInput = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                if (retVal >= low && retVal <= high)
                {
                    validInput = true;
                }
                else
                {
                    System.out.println("Input out of range. Please enter a value between " + low + " and " + high + ".");
                }
            }
            else
            {
                System.out.println("That is not a valid integer. Please try again.");
                pipe.next(); // read and discard the trash
            }
            pipe.nextLine(); // newline fix - clear the rest of the line
        } while (!validInput);

        return retVal;
    }

}