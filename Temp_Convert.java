import java.util.Scanner;

public class Temp_Convert {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheitResult;
        celsius = input.nextDouble();
        fahrenheitResult = (celsius * (9.0/5.0)) + 32;
        System.out.println(celsius + " is " + fahrenheitResult + " fahrenheit");
        input.close();
    }
}