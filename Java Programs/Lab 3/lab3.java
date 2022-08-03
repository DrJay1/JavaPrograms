/*
In this programming assignment, the user is asked to enter Full NAME . User input is saved in string values, and the result will display, "Welcome, FullName! " 
Then, it will ask the user to input hours worked during the week.  It will then calculate the regular pay rate and overtime pay rate, which will be displayed on the screen.
Hint: NjBasePay = 13.0, NJOTPayRate = 19.5;

Note: Full Name, and hours worked have to be keyboard entered.  
Your counsel should look something similar as shown below:

 
OUTPUT:
Enter your Full name: John A Smith
Welcome John A Smith! 
How many hours you worked this week: 20
Your regular pay rate would be: 260
Your OT pay rate would be: 390
Thank you, Have a nice day!
*/

//Required Libraries 
import java.util.Scanner; // Required to read from the keyboard

// Start of the class: lab3

public class lab3 {
    // Start of the main method: Executable
    public static void main(String[] args) {
        // Variable Section:
        String fullName;
        double hoursWorked;
        double payRate;
        double grossPay = 0;
        double overtime;
        Scanner KB = new Scanner(System.in);

        // Input Section:
        System.out.println("1- Please enter your full name: ");
        fullName = KB.nextLine();
        System.out.println("2- Please enter the total hours worked during this week: ");
        hoursWorked = KB.nextDouble();
        System.out.println("3- Please enter your pay rate: ");
        payRate = KB.nextDouble();

        // Process Section (Math/ Formula):
        // If there is no overtime
        if (hoursWorked < 40) {
            grossPay = (hoursWorked * payRate);
            overtime = 0;
        }
        // if there is overtpime
        else {
            overtime = (hoursWorked - 40) * payRate * 1.5;
            grossPay = overtime + 40 * payRate;
        }

        // output Section:
        System.out.println("========================================================");
        System.out.println("Welcome, " + fullName + " !");
        System.out.println("Your regular pay rate would be: $" + payRate);
        System.out.println("Your gross income would be: $" + grossPay);
        System.out.println("Your OT pay rate would be: $" + overtime);
        System.out.println("Thank you, Have a nice day!");

    }// end of the main method

}// end of the class lab3