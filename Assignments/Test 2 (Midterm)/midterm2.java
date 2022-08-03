
// Read from the keyboard: import Scanner library
import java.util.Scanner;

public class midterm2 {
    // Adding a method to allow ranges in switchcase menu
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    // Executable: Main method
    public static void main(String[] args) {
        // Variable Section:
        Scanner sc = new Scanner(System.in);
        String name;
        int annual;
        char filing;

        // Input section:
        System.out.println("Enter your name:");
        name = sc.nextLine();

        // Process Section
        // Start a Menu:
        System.out.println("========================== Welcome " + name
                + ", to the Tax Estimator Menu ==========================");
        System.out.println("========================== Section A: Filing Status ==========================");
        System.out.println("- If you are single, please type S");
        System.out.println("- If you are married, please type M");
        filing = sc.next().charAt(0);
        System.out
                .println("========================== Section B: Annual Income Announcement ==========================");
        System.out.println("- Please enter your annual income");
        annual = sc.nextInt();
        System.out.println(
                "================================ Processing .....  ============================================");

        // Switch case menu: based on the filing
        switch (filing) {
            case 'S':
                // Subsection menu using switchcase: Annual income
                if (isBetween(annual, 0, 20000)) {
                    // Output section
                    System.out.println("Your tax rate is 1.4%");

                }
                if (isBetween(annual, 20001, 35000)) {
                    // Output section
                    System.out.println("Your tax rate is 1.75%");

                }

                break;
            case 'M':
                // Subsection menu using switchcase: Annual income
                if (isBetween(annual, 0, 20000)) {
                    // Output section
                    System.out.println("Your tax rate is 1.4%");

                }
                if (isBetween(annual, 20001, 35000)) {
                    // Output section
                    System.out.println("Your tax rate is 1.75%");

                }
                break;
            default:
                System.out.println("Warning!! your input hasn't been understood by the estimator. Please try again:");
        }

        // Conclusion
        sc.close();
        System.out.println("Thank you " + name + ", Enjoy the rest of day.");
        System.out.println(" ");
    }// end of the main method
}// end of the class

/*
 * 
 * if (filing == single) {
 * if ((annual >= 0) && (annual <= 20000)) {
 * System.out.println("Your tax rate is 1.4%");
 * }
 * if ((annual >= 20001) && (annual <= 35000)) {
 * System.out.println("Your tax rate is 1.75%");
 * }
 * if ((annual >= 35001) && (annual <= 40000)) {
 * System.out.println("Your tax rate is 3.5%");
 * }
 * if ((annual >= 40001) && (annual <= 75000)) {
 * System.out.println("Your tax rate is 5.525%");
 * }
 * if ((annual >= 75001) && (annual <= 500000)) {
 * System.out.println("Your tax rate is 6.37%");
 * }
 * if ((annual >= 500001) && (annual <= 5000000)) {
 * System.out.println("Your tax rate is 8.97%");
 * }
 * if (annual > 5000000) {
 * System.out.println("Your tax rate is 10.75%");
 * }
 * 
 * } else if (filing == married) {
 * if ((annual >= 0) && (annual <= 20000)) {
 * System.out.println("Your tax rate is 1.4%");
 * }
 * if ((annual >= 20001) && (annual <= 50000)) {
 * System.out.println("Your tax rate is 1.75%");
 * }
 * if ((annual >= 50001) && (annual <= 70000)) {
 * System.out.println("Your tax rate is 2.45%");
 * }
 * if ((annual >= 70001) && (annual <= 80000)) {
 * System.out.println("Your tax rate is 3.5%");
 * }
 * if ((annual >= 80001) && (annual <= 150000)) {
 * System.out.println("Your tax rate is 5.525%");
 * }
 * if ((annual >= 150001) && (annual <= 500000)) {
 * System.out.println("Your tax rate is 6.37%");
 * }
 * if ((annual >= 500001) && (annual <= 5000000)) {
 * System.out.println("Your tax rate is 8.97%");
 * }
 * if (annual > 5000000) {
 * System.out.println("Your tax rate is 10.75%");
 * }
 * 
 * sc.close();
 * }
 * System.out.println("Thank you " + name + ", Enjoy the rest of day.");
 * System.out.println(" ");
 * }
 * }
 */