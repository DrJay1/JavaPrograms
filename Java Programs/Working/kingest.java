import java.util.Scanner;

public class kingest {
        public static void main(String[] args) {
                System.out.println("Welcomee to Retirement Plan");
                System.out.println("Enter Your Name");
                Scanner sc = new Scanner(System.in);
                String name = sc.nextLine();

                System.out.println("Enter Your Password");
                String pass = "password";
                String word = sc.nextLine();

                while (!word.equals(pass)) {
                        System.out.println("Incorrect, Enter password");
                        word = sc.nextLine();
                }
                System.out.println("Welcome " + name);

                System.out.println("Enter your monthly income");
                double income = sc.nextDouble();
                System.out.println("Enter years expected to work");
                int ESTY = sc.nextInt();

                double ann = 12 * income;
                System.out.println("Your annual income will be " + ann);

                double MTP = 0.03 * income;
                double ARP = MTP * 12;
                double king = ESTY * ARP;

                System.out.println(
                                "======================================================================================================================");

                System.out.println(
                                "Option 1: If you plan to contribute 3% of your monthly income to your retirement plan, per month $"
                                                + MTP + " and $" + ARP);
                System.out.println(
                                "Your accumulated retirement money after working " + ESTY + " years will be $" + king);

                double MTP2 = 0.05 * income;
                double ARP2 = MTP2 * 12;
                double king2 = ESTY * ARP2;

                System.out.println(
                                "======================================================================================================================");

                System.out.println(
                                "Option 2: If you plan to contribute 5% of your monthly income to your retirement plan, per month $"
                                                + MTP2 + " and $" + ARP2);
                System.out.println(
                                "Your accumulated retirement money after working " + ESTY + " years will be $" + king2);

                double MTP3 = 0.07 * income;
                double ARP3 = MTP3 * 12;
                double king3 = ESTY * ARP3;

                System.out.println(
                                "======================================================================================================================");

                System.out.println(
                                "Option 3: If you plan to contribute 7% of your monthly income to your retirement plan, per month $"
                                                + MTP3 + " and $" + ARP3);
                System.out.println(
                                "Your accumulated retirement money after working " + ESTY + " years will be $" + king3);

                double MTP4 = 0.1 * income;
                double ARP4 = MTP4 * 12;
                double king4 = ESTY * ARP4;

                System.out.println(
                                "======================================================================================================================");

                System.out.println(
                                "Option 4: If you plan to contribute 10% of your monthly income to your retirement plan, per month $"
                                                + MTP4 + " and $" + ARP4);
                System.out.println(
                                "Your accumulated retirement money after working " + ESTY + " years will be $" + king4);

                System.out.println(
                                "======================================================================================================================");
                System.out.println("Thank you for your time " + name);
                System.out.println("Enjoy the rest of your day.");

                sc.close();
        }
}