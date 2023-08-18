import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Temperature conversion in F.to C.");
        System.out.println(" Plz input the Fahrenheit");
        double fahrenheit = sc.nextDouble();
        double tem = (fahrenheit -32) * 5/9 ;
        System.out.println("Here is the temperature in celsius = " + tem );


        }
    }
