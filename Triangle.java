import java.util.Scanner;
public class Triangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base in cm: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height in cm: ");
        double height = scanner.nextDouble();
        double areaSqCm = 0.5 * base * height;
        double areaSqIn = areaSqCm / 6.4516;
        System.out.println("The Area of the triangle in sq in is " 
                + areaSqIn + " and sq cm is " + areaSqCm);

        scanner.close();
    }
}