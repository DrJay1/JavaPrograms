import java.util.Scanner;

public class assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name;
        int k1;
        double NjBasepay = 13.0, NJOTPayRate = 19.5;

        System.out.println("Enter fullname");

        System.out.println("Please enter hours worked(Week)");
        k1 = sc.nextInt();

        double jay = NjBasepay * k1;
        double food = NJOTPayRate * k1;

        String hourly = "Your regular pay rate would be: ";
        String OT = "Your OT pay rate would be: ";

        System.out.println("================================================================");
        System.out.println("Welcome," + name.nextLine());
        System.out.println(hourly + jay);
        System.out.println(OT + food);
        System.out.println("Thank you," + name + " Have a nice");

        time.close();
        name.close();
    }
}