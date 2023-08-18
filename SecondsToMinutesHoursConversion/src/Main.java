import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Convert seconds to hours and minutes");
        System.out.println("Plz input the seconds");
        String second = sc.nextLine();
         int totalSeconds = Integer.parseInt(String.valueOf(second)); // String to Int parsing
        int minutes = totalSeconds / 60 ;
        int hours = totalSeconds /3600 ;
        int remainingMinutes = totalSeconds % 3600 ;
        System.out.println("Here is your output " );
        System.out.println("Minutes = "+ minutes );
        System.out.println("Hours = "+ hours);
        System.out.println("Remaining minutes = "+ remainingMinutes);

    }
}