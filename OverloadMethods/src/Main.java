import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        double d1 = getInput(sc,1);
        double d2 = getInput(sc,2);
        double result1 = add_numbers(d1,d2);
        System.out.println("The answer is: " + result1);
        double result2 = add_numbers(d1,d2,d1,d2);
        System.out.println("The answer is: " + result2);
        double result3 = add_numbers(d1,d2,d1,d2,d1,d2);
        System.out.println("The answer is: " + result3);
    }

    private static double getInput(Scanner sc,int num){
        String message = "Enter the number %d: ";
        String fin = String.format(message,num);
        System.out.println(fin);
        return(sc.nextDouble());
    }

    private static double add_numbers(double num1 , double num2){
        return num1 + num2;
    }

    private static double add_numbers(double num1 , double num2 , double num3 , double num4){
        return num1+num2+num3+num4;
    }
    private static double add_numbers(double... numbers){
        double resultlast = 0;
        for (double number:numbers){
            resultlast += number;
        }
        return resultlast;
    }
}
