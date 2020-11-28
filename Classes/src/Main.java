import MyUtilities.CalcHelper;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        try{
            double num1 = add_number(scan);
            double num2 = add_number(scan);
            System.out.println("Enter an Operation ( + - * / )");
            boolean ite = true;
            while (ite) {
                String sym = scan.next();
                switch (sym) {
                    case "+" -> {
                        System.out.println(CalcHelper.add(num1,num2));
                        ite = false;
                    }
                    case "-" -> {
                        System.out.println(CalcHelper.sub(num1,num2));
                        ite = false;
                    }
                    case "*" -> {
                        System.out.println(CalcHelper.mult(num1,num2));
                        ite = false;
                    }
                    case "/" -> {
                        System.out.println(CalcHelper.div(num1,num2));
                        ite = false;
                    }
                    default -> System.out.println("None of the given symbol was selected,select again!");
                }
            }
        }
        catch (InputMismatchException e){
            System.out.println("Enter only digits : your error was " + e.getMessage());
        }
    }
    private static double add_number(Scanner sc){
        System.out.println("Enter the Number");
        return(sc.nextDouble());
    }
}

