import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner student =new Scanner(System.in);
        System.out.println("Personal Information");
        String name =student.next(); //Take the String Input
        int age =student.nextInt(); //Take the int input
        float height =student.nextFloat(); //Take the float input
        double yearlySalary =student.nextDouble(); //Take the double input
        int grade =student.nextInt(); //Take the int input
        String gender = student.next(); //Take the String input
        boolean studentStatus =student.nextBoolean(); //Take the boolean input
        System.out.println("Name = " + name +"\n Age = " + age +"\n Height = " + height +"\n YearlySalary = " +
                yearlySalary + "\n Grade = " + grade +"\n Gender = " + gender +"\n Student Status = " + studentStatus);


    }
}