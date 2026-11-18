import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String ssn = SafeInput.getRegExString(in, "Enter your SSN (XXX-XX-XXXX)", "\\d{3}-\\d{2}-\\d{4}");

        String studentID = SafeInput.getRegExString(in, "Enter your UC Student M number", "(M|m)\\d{5}");

        String zipCode = SafeInput.getRegExString(in, "Enter your Zip+4 code (XXXXX-XXXX)", "\\d{5}-\\d{4}");

        System.out.println("\nYour information:");
        System.out.println("SSN: " + ssn);
        System.out.println("Student M Number: " + studentID);
        System.out.println("Zip+4 Code: " + zipCode);
    }
}
