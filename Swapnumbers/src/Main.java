import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Welcome to Swap numbers Project !!!");
        System.out.println("Plz enter the first number a = ");
        int a = sc.nextInt();
        System.out.println("plz enter the 2nd number b = ");
        int b = sc.nextInt();
        int c = a;
        a = b ;
        b = c ;

        System.out.println("Here is your number a = " + a );
        System.out.println("Here is your number b = " + b );

    }
}