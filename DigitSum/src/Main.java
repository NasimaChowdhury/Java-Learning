import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1234
        Scanner sc =new Scanner(System.in);
        System.out.println("Plz enter you number");
        int number = sc.nextInt();
        int digit = number % 10 ;
        int rest = number / 10 ;
        int sum = digit + rest;
        System.out.println("Here is your digit sum = " + sum );

    }
}