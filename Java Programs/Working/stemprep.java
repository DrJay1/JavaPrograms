import java.util.Scanner;

public class stemprep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Panda Entanglement. Please the option from the list coming next for support.");
        int support = sc.nextInt();

        switch (support) {
            case 1:
                System.out.println("Cooking Department");
                break;
            case 2:
                System.out.println("Education Department");
                break;
            case 3:
                System.out.println("Residencial Department");
                break;
            case 4:
                System.out.println("Swimming Department");
                break;

            default:
                break;
        }
    }
}