import java.util.Scanner;

public class testing {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Welcome to the Retirement Plan Calculator.");

                System.out.println("Enter your name:");
                String name = sc.nextLine();
                System.out.println("Welcome, " + name);

                System.out.println("Enter your monthly income");
                double monthly = sc.nextDouble();

                System.out.println("How many years you plan to work");
                int years = sc.nextInt();

                double annual = 12 * monthly;
                double MRP = monthly * 0.03;
                double ARP = annual * 0.03;
                double ATM = ARP * years;

                System.out.println("Your annual income will be: $" + annual);
                System.out.println(" ");

                System.out.println(
                                "Option 1: If you plan to contribute 3% of your monthly income to your retirement plan, per month: $"
                                                + MRP + " and $" + ARP + " annually.");
                System.out.println(
                                "Your accumulated retirement money after working " + years + " years will be $" + ATM);
                System.out.println(" ");

                double annual1 = 12 * monthly;
                double MRP1 = monthly * 0.05;
                double ARP1 = annual1 * 0.05;
                double ATM1 = ARP1 * years;

                System.out.println(
                                "Option 2: If you plan to contribute 5% of your monthly income to your retirement plan, per month: $"
                                                + MRP1 + " and $" + ARP1 + " annually.");
                System.out.println(
                                "Your accumulated retirement money after working " + years + " years will be $" + ATM1);
                System.out.println(" ");

                double annual2 = 12 * monthly;
                double MRP2 = monthly * 0.07;
                double ARP2 = annual2 * 0.07;
                double ATM2 = ARP2 * years;

                System.out.println(
                                "Option 3: If you plan to contribute 7% of your monthly income to your retirement plan, per month: $"
                                                + MRP2 + " and $" + ARP2 + " annually.");
                System.out.println(
                                "Your accumulated retirement money after working " + years + " years will be $" + ATM2);
                System.out.println(" ");

                double annual3 = 12 * monthly;
                double MRP3 = monthly * 0.1;
                double ARP3 = annual3 * 0.1;
                double ATM3 = ARP3 * years;

                System.out.println(
                                "Option 4: If you plan to contribute 10% of your monthly income to your retirement plan, per month: $"
                                                + MRP3 + " and $" + ARP3 + " annually.");
                System.out.println(
                                "Your accumulated retirement money after working " + years + " years will be $" + ATM3);

                System.out.println(" ");
                System.out.println("Thank you " + name + ", Have a nice day.");
                System.out.println(" ");
                sc.close();
        }
}