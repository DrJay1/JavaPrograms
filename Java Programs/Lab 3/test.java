import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double time;
        double NJBasepay = 13.0, NJOTPayRate = 19.5;

        System.out.println("Please enter fullname");
        name = sc.nextLine();

        System.out.println("Please enter hours worked (Week)");
        time = sc.nextDouble();

        double reg = time * NJBasepay;
        double OT = time * NJOTPayRate;

        System.out.println("========================================");
        System.out.println("Welcome, " + name + "!");
        System.out.println("Your regular pay rate will be: " + "$" + reg);
        System.out.println("Your OT payrate will be: " + "$" + OT);
        System.out.println("Thank you, " + name + " have a nice day.");

        sc.close();
    }
}