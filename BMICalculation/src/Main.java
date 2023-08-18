import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Plz give input your weight");
        double weight = sc.nextDouble() ;
        System.out.println("Plz give input your height");
        double height = sc.nextDouble() ;
        double bmi = weight / (height * height);
        System.out.println("Your BMI is = " + bmi );



        }
    }
