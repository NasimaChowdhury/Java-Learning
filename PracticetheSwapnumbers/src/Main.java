import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How to Swap two numbers ?");
        System.out.println("Enter the 1st number x = ");
        int x = sc.nextInt();
        System.out.println("Enter the 2nd number y = ");
        int y = sc.nextInt();
        int z = x; // storing x value in z
        x = y ; // storing y value in x
        y = z ; //storing z value in y

        System.out.println("Your number x = " + x );
        System.out.println("Your number y = " + y );

    }
}