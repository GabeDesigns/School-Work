/**
 * Created by RGABR on 3/6/2017.
 */
import java.util.Scanner;
public class Accounting
{
    public static void main(String[] args)
    {
        //Declaring the int variables needed for program
        int Invoice;
        int Month;
        int Day;
        int Year;
        //Requesting user input
        System.out.println("Please enter the Invoice Number: ");
        System.out.println("Please enter the Month number: ");
        System.out.println("Please enter the Day number: ");
        System.out.println("Please enter the Year: ");
        //Grabbing user input
        Scanner keyboard = new Scanner(System.in);
        Invoice = keyboard.nextInt();
        Month = keyboard.nextInt();
        Day = keyboard.nextInt();
        Year = keyboard.nextInt();
        //Conditions
        if (Invoice < 1000)
        {
            Invoice = 0;
            System.out.println("INVALID INVOICE");
        }
        if (Month < 1 || Month > 12)
        {
            Month = 0;
            System.out.println("INVALID MONTH");
        }
        if (Year < 2011 || Year > 2017)
        {
            Year = 0;
            System.out.println("INVALID YEAR");
        }
        if (Month == 1 && Day > 31)
        {
            Day = 31;
            System.out.println("INVALID DATE");
        }
        if (Month == 2 && Day > 28)
        {
            Day = 28;
            System.out.println("INVALID DATE");
        }
        if (Month == 3 && Day > 31 )
        {
            Day = 31;
            System.out.println("INVALID DATE");
        }
        if (Month == 4 && Day > 30 )
        {
            Day = 30;
            System.out.println("INVALID DATE");
        }
        if (Month == 5 && Day > 31 )
        {
            Day = 31;
            System.out.println("INVALID DATE");
        }
        if (Month == 6 && Day > 30 )
        {
            Day = 30;
            System.out.println("INVALID DATE");
        }
        if (Month == 7 && Day > 31 )
        {
            Day = 31;
            System.out.println("INVALID DATE");
        }
        if (Month == 8 && Day > 31 )
        {
            Day = 31;
            System.out.println("INVALID DATE");
        }
        if (Month == 9 && Day > 30 )
        {
            Day = 31;
            System.out.println("INVALID DATE");
        }
        if (Month == 10 && Day > 31 )
        {
            Day = 31;
            System.out.println("INVALID DATE");
        }
        if (Month == 11 && Day > 30 )
        {
            Day = 30;
            System.out.println("INVALID DATE");
        }
        if (Month == 12 && Day > 31 )
        {
            Day = 31;
            System.out.println("INVALID DATE");
        }

        //System output is handled here
        System.out.println("Invoice Number:" + Invoice);
        System.out.println("Month:" + Month);
        System.out.println("Day:" + Day);
        System.out.println("Year:" + Year);
    }
}
