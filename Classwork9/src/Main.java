import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String b=sc.next();// taking word input
        sc.nextLine(); //to avoid enter after next()/nextInt()/nextDouble()
        String c=sc.nextLine();
        int d=sc.nextInt();
        sc.nextLine();//to avoid enter after next()/nextInt()/nextDouble()
        String e=sc.nextLine();
        System.out.println("Your name is " +   b + "." + c + " "+ d  + " "+ e); //to add space we have to use it in ""


    }
}