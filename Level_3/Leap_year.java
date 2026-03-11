import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int year;
        System.out.print("Enter a year:");
        year = in.nextInt();
        if(year < 1582)
        {
            System.out.println("Invalid year");
            return;
        }
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
        in.close();
    }
}
