import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("About Myself");
        String a = sc.next();
        sc.nextLine();
        int b = sc.nextInt();
        sc.nextLine();
        String c = sc.nextLine();

        System.out.println("My name is " + a + "." + "I'm " + b + " years old." + "My fav quote is " + c + ".");
    }
}