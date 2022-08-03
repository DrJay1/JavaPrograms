import java.util.Scanner;

public class stem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char Male = 'M';
        char Female = 'F';
        double age1 = 18, age2 = 30, age3 = 34;
        char Yctzn = 'Y';
        char Nctzn = 'N';

        System.out.println("Enter Full Name");
        String name = sc.nextLine();

        System.out.println("What gender are you ? (Enter M for male or F for female)");
        char sex = sc.next().charAt(0);

        if (sex == Male) {
            System.out.println("How old are you?");
            double age = sc.nextDouble();

            if ((age >= age1) && (age <= age2)) {
                System.out.println("Are you a US citizen? (Enter Y for yes or N for no");
                char citizen = sc.next().charAt(0);

                if (citizen == Yctzn) {
                    System.out.println("You are eligible for Military school");
                } else if (citizen == Nctzn) {
                    System.out.println("You are currently ineligible for Military school");
                }
            } else if ((age < age1) && (age > age2)) {
                System.out.println("You are currently ineligible for Military school");
            }

        }

        else if (sex == Female) {
            System.out.println("How old are you?");
            double age = sc.nextDouble();

            if ((age >= age1) && (age <= age3)) {
                System.out.println("Are you a US citizen? (Enter Y for yes or N for no");
                char citizen = sc.next().charAt(0);

                if (citizen == Yctzn) {
                    System.out.println("You are eligible for Military school");
                } else if (citizen == Nctzn) {
                    System.out.println("You are currently ineligible for Military school");
                }
            } else if ((age < age1) && (age > age3)) {
                System.out.println("You are currently ineligible for Military school");
            }

        }
        sc.close();
    }
}