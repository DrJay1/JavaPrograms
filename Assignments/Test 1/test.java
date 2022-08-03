import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        System.out.println("Welcome to the Retirement PLan Calculator");

        Scanner sc = new Scanner(System.in);
        String name;
        double income;
        double years;

        System.out.println("What is your First name?");
        name = sc.next();
        System.out.println("Welcome, " + name);

        System.out.println("What is your monthly income?");
        income = sc.nextDouble();

        System.out.println("How many years do you plan to work?");
        years = sc.nextDouble();

        double annualInc = 12;

        double annual = income * annualInc;

        System.out.println("Your annual income will be: " + annual);

        double RPM1 = 0.03 * income;
        double RPA1 = 0.03 * annual;
        double retirement = RPA1 * 40;
        System.out.println(
                "Option 1: If you plan to contribute 3% of your monthly income to your retirement plan, per month: $"
                        + RPM1 + " and $" + RPA1);
        System.out.println("Your accumulated retiment money after working " + years + " years will be $" + retirement);
        System.out.println(" ");

        double RPM2 = 0.05 * income;
        double RPA2 = 0.05 * annual;
        double retirement2 = RPA2 * 40;
        System.out.println(
                "Option 2: If you plan to contribute 5% of your monthly income to your retirement plan, per month: $"
                        + RPM2 + " and $" + RPA2);
        System.out.println("Your accumulated retiment money after working " + years + " years will be $" + retirement2);
        System.out.println(" ");

        double RPM3 = 0.07 * income;
        double RPA3 = 0.07 * annual;
        double retirement3 = RPA3 * 40;
        System.out.println(
                "Option 3: If you plan to contribute 7% of your monthly income to your retirement plan, per month: $"
                        + RPM3 + " and $" + RPA3);
        System.out.println("Your accumulated retiment money after working " + years + " years will be $" + retirement3);
        System.out.println(" ");

        double RPM4 = 0.1 * income;
        double RPA4 = 0.1 * annual;
        double retirement4 = RPA4 * 40;
        System.out.println(
                "Option 4: If you plan to contribute 10% of your monthly income to your retirement plan, per month: $"
                        + RPM4 + " and $" + RPA4);
        System.out.println("Your accumulated retiment money after working " + years + " years will be $" + retirement4);
        System.out.println(" ");

        System.out.println("Thank you, Have a nice day");

        sc.close();

    }
}