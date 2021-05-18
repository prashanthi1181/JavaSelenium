package Day1;

import java.util.Scanner;

public class LoopsIfElse {
    public static void main(String[] args) {
    //int age =29;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
    if(age>=29){
        System.out.println("you are eligable to vote : " + age);
    }
    else {
        System.out.println("you are not eligalbe to vote ");
    }
    }


}
