import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int a ;
        Scanner ab = new Scanner(System.in);
        System.out.println("Please put your age");
        a = ab.nextInt(); //take the int input
        System.out.println("Your account current balance");
        double b = ab.nextDouble(); //take the double input
        System.out.println("age = "+ a );
        System.out.println( "Account balance = "+ b);
        System.out.println("Gender");
        String  c = ab.next(); //take the word input
        System.out.println("Gender = " + c);
        System.out.println("Are you Student ");
        boolean d = ab.nextBoolean(); //take the boolean input
        System.out.println("Student = " + d);

    }
}