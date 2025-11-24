package Section5OfOracleCourse;
import java.util.Scanner;


public class AgeValidity {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age (Number Only): ");
        int age = input.nextInt();
boolean drivingUnderAge= age <= 18;
        System.out.println(drivingUnderAge);
    }
}
