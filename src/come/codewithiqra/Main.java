package come.codewithiqra;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner calculate = new Scanner(System.in);

        System.out.println("Enter First Number:");
        double num1 = calculate.nextDouble();

        System.out.println("Enter second Number: ");
        double num2 = calculate.nextDouble();

        System.out.println("Enter any operator: ");
        char operator = calculate.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;


            case '-':
                result = num1 - num2;
                break;


            case '*':

                result = num1 * num2;
                break;


            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Error! Operator is not correct ");
                return;
        }

        System.out.printf(  "%.1f %c %.1f = %.1f ", num1, operator, num2, result);
    }

}


