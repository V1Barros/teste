import java.util.Scanner;

public class Hip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x, y, z;
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();
        z = Math.sqrt((x*x) + (y*y));
        System.out.println("The hypotenuse is " +z);
        scanner.close();
    }
}
