//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//write a program that will promp user to continue program execution. yes to continue
//the program and no to stop
import java.util.Scanner;
public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose which operation do you want: ");
        System.out.println("1.Addition");
        System.out.println("2. Multiplication");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter num 1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter num 2: ");
            int num2 = sc.nextInt();

            int sum = num1 + num2;
            System.out.print("Sum is: " + sum);

        } else if (choice == 2) {
            System.out.print("Enter the number of the math table that you want: ");
            int number = sc.nextInt();
            System.out.print("Enter the range of your table (10 or 12): ");
            int range = sc.nextInt();

            int product = 0;

            if (range == 10) {
                for (int i = 1; i <= 10; i++) {
                    product = number * i;
                    System.out.println(product);
                }
            } else if (range == 12) {
                for (int i = 1; i <= 12; i++) {
                    product = number * i;
                    System.out.println(number + "x" + i + "=" +product);
                }
            } else {
                System.out.println("Invalid range!");
            }
        } else {
            System.out.println("Error! Invalid choice.");
        }
    }
}