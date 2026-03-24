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

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param low    the inclusive lower bound of the valid range
     * @param high   the inclusive upper bound of the valid range
     * @return a valid double within the specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean validInput = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
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
     * @return true if the user enters Y or y, false if the user enters N or n
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        boolean retVal = false;
        boolean validInput = false;

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            String response = pipe.nextLine().trim();

            if (response.equalsIgnoreCase("Y"))
            {
                retVal = true;
                validInput = true;
            }
            else if (response.equalsIgnoreCase("N"))
            {
                retVal = false;
                validInput = true;
            }
            else
            {
                System.out.println("Invalid response. Please enter Y or N.");
            }
        } while (!validInput);

        return retVal;
    }

    /**
     * @param pipe   a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @param regEx  the regular expression pattern the input must match
     * @return a String that matches the given regular expression pattern
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = "";
        boolean validInput = false;

        do
        {
            System.out.print("\n" + prompt + ": ");
            retString = pipe.nextLine().trim();

            if (retString.matches(regEx))
            {
                validInput = true;
            }
            else
            {
                System.out.println("Invalid input. Please try again.");
            }
        } while (!validInput);

        return retString;
    }

    /**
     * Prints a 60-character wide formatted header with the message centered on the middle line.
     * Top and bottom lines are solid asterisks. Middle line has 3 asterisks on each end.
     * @param msg the message to display centered in the header
     */
    public static void prettyHeader(String msg)
    {
        int totalWidth   = 60;
        int borderStars  = 3;  // stars on each end of the middle line
        int innerWidth   = totalWidth - (borderStars * 2); // 54 chars for message + padding
        int totalPadding = innerWidth - msg.length();
        int leftPadding  = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding; // handles odd-length messages

        // Top border - 60 asterisks using a loop
        for (int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        // Middle line - 3 stars, left padding, message, right padding, 3 stars
        for (int i = 0; i < borderStars; i++)
        {
            System.out.print("*");
        }
        for (int i = 0; i < leftPadding; i++)
        {
            System.out.print(" ");
        }
        System.out.print(msg);
        for (int i = 0; i < rightPadding; i++)
        {
            System.out.print(" ");
        }
        for (int i = 0; i < borderStars; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        // Bottom border - 60 asterisks using a loop
        for (int i = 0; i < totalWidth; i++)
        {
            System.out.print("*");
        }
        System.out.println();
    }

}