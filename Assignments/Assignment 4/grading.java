import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your grade amongst (A-F)");
        char grade = sc.next().charAt(0);

        switch (grade) {
            case 'A':
                System.out.println("You will need to score 90-100 to get an A in this class");
                break;
            case 'B':
                System.out.println("You will need to score 80-89 to get an B in this class");
                break;
            case 'C':
                System.out.println("You will need to score 70-79 to get an C in this class");
                break;
            case 'D':
                System.out.println("You will need to score 65-69 to get an D in this class");
                break;
            case 'F':
                System.out.println("Work harder next Semester");
                break;

            default:
                System.out.println("Invalid Command");
                break;
        }

        sc.close();
    }
}