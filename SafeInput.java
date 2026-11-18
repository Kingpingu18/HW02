import java.util.Scanner;

public class SafeInput
{
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" +prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;


    }
    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                System.out.println("You must enter a valid integer!");
                pipe.nextLine();
            }

        } while (!done);

        return retInt;
    }
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retDouble = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                System.out.println("You must enter a valid double!");
                pipe.nextLine();
            }

        } while (!done);

        return retDouble;
    }
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retInt = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine();

                if (retInt >= low && retInt <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number must be between " + low + " and " + high + ".");
                }
            }
            else
            {
                System.out.println("You must enter a valid integer!");
                pipe.nextLine();
            }

        } while (!done);

        return retInt;
    }
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retDouble = 0;
        boolean done = false;

        do
        {
            System.out.print("\n" + prompt + " [" + low + " - " + high + "]: ");

            if (pipe.hasNextDouble())
            {
                retDouble = pipe.nextDouble();
                pipe.nextLine();

                if (retDouble >= low && retDouble <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("Number must be between " + low + " and " + high + ".");
                }
            }
            else
            {
                System.out.println("You must enter a valid double!");
                pipe.nextLine();
            }

        } while (!done);

        return retDouble;
    }
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String response = "";

        do
        {
            System.out.print("\n" + prompt + " [Y/N]: ");
            response = pipe.nextLine();

            if (response.equalsIgnoreCase("Y") || response.equalsIgnoreCase("YES"))
            {
                return true;
            }
            else if (response.equalsIgnoreCase("N") || response.equalsIgnoreCase("NO"))
            {
                return false;
            }
            else
            {
                System.out.println("Please enter Y, Yes, N, or No.");
            }

        } while (true);
    }
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retString = "";

        do
        {
            System.out.print("\n" + prompt + ": ");

            if (pipe.hasNextLine())
            {
                retString = pipe.nextLine();

                if (!retString.matches(regEx))
                {
                    System.out.println("Invalid input. Please try again.");
                }
            }
            else
            {
                pipe.nextLine();
            }

        } while (!retString.matches(regEx));

        return retString;
    }
}
