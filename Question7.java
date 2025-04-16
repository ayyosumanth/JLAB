
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Name: Sumanth D  , Roll.no : 24325");
        System.out.println("Enter 1st Number ");
        int a = input.nextInt();
        System.out.println("Enter 2st Number ");
        int b = input.nextInt();
        System.out.println("Enter 3st Number ");
        int c = input.nextInt();
        if (a < b < c) {
            System.out.println("They are in Increasing Order ");
        } else if (a > b > c) {
            System.out.println("They are in decreasing Order ");
        }
    }
}
