
import java.util.Scanner;

public class Question5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = input.nextInt();
        System.out.println("Name : Sumanth Deshpande");
        System.out.println("Roll.No : AV.SC.U4CSE24325");
        System.out.println("The multiplication Table of " + a + " is :  ");
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " X " + i + " = " + a * i);
        }
        input.close();
    }
}
