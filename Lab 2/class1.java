import java.util.Scanner; //Telling Java we need Scanner in this code.

class Main {
    public static void main(String[] args) {

        int num1, num2, num3, num4, num5, add, sqrt;
        Scanner sc = new Scanner(System.in); // Create a scanner variable This is best use case when you want to use it
                                             // often.

        System.out.println("Enter an integer"); // User enters
        num1 = sc.nextInt();

        System.out.println("Enter an integer"); // User enters
        num2 = sc.nextInt();

        System.out.println("Enter an integer"); // User enters
        num3 = sc.nextInt();

        System.out.println("Enter an integer"); // User enters
        num4 = sc.nextInt();

        System.out.println("Enter an integer"); // User enters
        num5 = sc.nextInt();

        add = num1 + num2 + num3 + num4 + num5;
        System.out.println(add);
        System.out.println(Math.sqrt(add));

        sc.close();
    }
}