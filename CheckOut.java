import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double total = 0;
        double price;
        boolean moreItems;

        do
        {
            price = SafeInput.getRangedDouble(in, "Enter the price of your item", 0.50, 99.99);

            total += price;

            moreItems = SafeInput.getYNConfirm(in, "Do you have more items?");

        } while (moreItems);

        System.out.printf("\nYour total cost is: $%.2f%n", total);
    }
}
