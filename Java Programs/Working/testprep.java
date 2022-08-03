import java.util.Scanner;

public class testprep {
    public static void main(String[] args) {

        System.out.println("Enter password");
        Scanner sc = new Scanner(System.in);
        String password = "king";
        String PSD = sc.nextLine();

        if (!PSD.equals(password)) {
            System.out.println("Incorrect password");
        } else {
            System.out.println("Welcome back");
        }

    }
}