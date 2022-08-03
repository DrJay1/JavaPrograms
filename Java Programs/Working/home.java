import java.util.Scanner;

public class home {
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        Scanner king = new Scanner(System.in);

        double k1, k2, k3, k4, k5, sum;

        System.out.print("Enter your name: ");
        System.out.println("Hello " + name.nextLine());

        System.out.println("Enter an Integer");
        k1 = king.nextDouble();

        System.out.println("Enter an Integer");
        k2 = king.nextDouble();

        System.out.println("Enter an Integer");
        k3 = king.nextDouble();

        System.out.println("Enter an Integer");
        k4 = king.nextDouble();

        System.out.println("Enter an Integer");
        k5 = king.nextDouble();

        sum = k1 + k2 + k3 + k4 + k5;

        System.out.println(sum);
        System.out.println(Math.sqrt(sum));

        king.close();
        name.close();
    }
}