import java.util.Scanner;

public class midterm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your Annual Income");
        double annual = sc.nextDouble();

        char single = 'S', married = 'M';

        System.out.println("What is your filing status? (Enter S for single or M for married)");
        char filing = sc.next().charAt(0);

        if (filing == single) {
            if ((annual >= 0) && (annual <= 20000)) {
                System.out.println("Your tax rate is 1.4%");
            }
            if ((annual >= 20001) && (annual <= 35000)) {
                System.out.println("Your tax rate is 1.75%");
            }
            if ((annual >= 35001) && (annual <= 40000)) {
                System.out.println("Your tax rate is 3.5%");
            }
            if ((annual >= 40001) && (annual <= 75000)) {
                System.out.println("Your tax rate is 5.525%");
            }
            if ((annual >= 75001) && (annual <= 500000)) {
                System.out.println("Your tax rate is 6.37%");
            }
            if ((annual >= 500001) && (annual <= 5000000)) {
                System.out.println("Your tax rate is 8.97%");
            }
            if (annual > 5000000) {
                System.out.println("Your tax rate is 10.75%");
            }

        } else if (filing == married) {
            if ((annual >= 0) && (annual <= 20000)) {
                System.out.println("Your tax rate is 1.4%");
            }
            if ((annual >= 20001) && (annual <= 50000)) {
                System.out.println("Your tax rate is 1.75%");
            }
            if ((annual >= 50001) && (annual <= 70000)) {
                System.out.println("Your tax rate is 2.45%");
            }
            if ((annual >= 70001) && (annual <= 80000)) {
                System.out.println("Your tax rate is 3.5%");
            }
            if ((annual >= 80001) && (annual <= 150000)) {
                System.out.println("Your tax rate is 5.525%");
            }
            if ((annual >= 150001) && (annual <= 500000)) {
                System.out.println("Your tax rate is 6.37%");
            }
            if ((annual >= 500001) && (annual <= 5000000)) {
                System.out.println("Your tax rate is 8.97%");
            }
            if (annual > 5000000) {
                System.out.println("Your tax rate is 10.75%");
            }

            sc.close();
        }
        System.out.println("Thank you " + name + ", Enjoy the rest of day.");
        System.out.println(" ");
    }
}