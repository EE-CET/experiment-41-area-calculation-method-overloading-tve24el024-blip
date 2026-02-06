import java.util.Scanner;

public class AreaCalculator{

    static class AreaCalculator {
        public double calculateArea(float radius) {
            return Math.PI * radius * radius;
        }

        public double calculateArea(float length, float breadth) {
            return length * breadth;
        }

        public double calculateArea(double base, double height) {
            return 0.5 * base * height;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float radius = sc.nextFloat();
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        AreaCalculator ac = new AreaCalculator();

        System.out.printf("%.2f\n", ac.calculateArea(radius));
        System.out.printf("%.2f\n", ac.calculateArea(length, breadth));
        System.out.printf("%.2f\n", ac.calculateArea(base, height));

        sc.close();
    }
}
