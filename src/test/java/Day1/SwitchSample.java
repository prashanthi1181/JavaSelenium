package Day1;

import java.util.Scanner;

public class SwitchSample {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Choose a number from 1 to 4");
        int operator = input.nextInt();


        //int operator = 2;
        switch (operator){

            case 1:
                System.out.print("sunday");
                break;
            case 2:
                System.out.print("tuesday");
                break;
            case 3:
                System.out.print("wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            default:
                System.out.print("Enter correct number");

        }
    }
}
