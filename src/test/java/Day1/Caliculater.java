package Day1;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Caliculater {

    public static void main(String[] args) {

        char operator;
        int num1, num2;

        Scanner input = new Scanner(System.in);

        System.out.println("Choose an operator : +, -, *, /");
        operator = input.next().charAt(0);

        System.out.println("enter num1");
        num1 = input.nextInt();

        System.out.println("enter num2");
        num2 = input.nextInt();

        double res;
        switch (operator){

            case '+' :
                res = num1 + num2;
                System.out.println(res);
                break;

            case '-' :
                res = num1 - num2;
                System.out.println(res);
                break;

            case '*':
                res = num1 * num2;
                System.out.println(res);
                break;

            case '/':
                res = num1 / num2;
                System.out.println(res);
                break;

            default:
                System.out.println("invalid operator!");
                break;

        }
        input.close();
    }

}