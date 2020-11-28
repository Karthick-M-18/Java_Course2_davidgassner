import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a value: ");
        var input = scan.nextLine();
        System.out.println(input);

        System.out.println("Enter Number 1: ");
        var num1 = scan.nextInt();
        System.out.println("Enter Number 2: ");
        var num2 = scan.nextInt();

        var sum = num1 + num2;
        System.out.println("The sum is "+ sum);
    }
}
