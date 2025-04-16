
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = input.nextInt();
        System.out.println("Name : Sumanth Deshpande");
        System.out.println("Roll.No : AV.SC.U4CSE24325");
        if (a == 1) {
            System.out.println("You have Entered : " + a);
            System.out.println("The Day is :  Monday");
        } else if (a == 2) {
            System.out.println("You have Entered : " + a);
            System.out.println("The Day is :  Tuesday");
        } else if (a == 3) {
            System.out.println("You have Entered : " + a);
            System.out.println("The Day is :  Wednesday");
        } else if (a == 4) {
            System.out.println("You have Entered : " + a);
            System.out.println("The Day is :  Thursday");
        } else if (a == 5) {
            System.out.println("You have Entered : " + a);
            System.out.println("The Day is :  Friday");
        } else if (a == 6) {
            System.out.println("You have Entered : " + a);
            System.out.println("The Day is :  Saturday ");
        } else if (a == 7) {
            System.out.println("You have Entered : " + a);
            System.out.println("The Day is :  Sunday");
        }
        input.close();

    }
}
