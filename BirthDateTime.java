import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter your birth year", 1921, 2020);

        int month = SafeInput.getRangedInt(in, "Enter your birth month", 1, 12);

        int maxDays = 31;

        switch (month)
        {
            case 2:
                maxDays = 29;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                maxDays = 30;
                break;

            default:
                maxDays = 31;
                break;
        }

        int day = SafeInput.getRangedInt(in, "Enter your birth day", 1, maxDays);

        int hours = SafeInput.getRangedInt(in, "Enter your birth hour", 1, 24);

        int minutes = SafeInput.getRangedInt(in, "Enter your birth minutes", 1, 59);

        System.out.println("\nYour birth date and time:");
        System.out.println(month + "/" + day + "/" + year);
        System.out.println(hours + ":" + String.format("%02d", minutes));
    }
}
