import java.util.Scanner;

public class Divisible_by_5
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int number = 0;
        System.out.println("Number");
        number = in.nextInt(); 
        if(number % 5 == 0)
            System.out.println("Is the number " + number + " divisible by 5? YES");
        else
            System.out.println("Is the number " + number + " divisible by 5? NO");
        in.close();
    }
}