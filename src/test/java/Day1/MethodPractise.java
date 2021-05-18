package Day1;

import java.util.Scanner;

public class MethodPractise {

    public static void main(String[] args) {
MethodPractise mp = new MethodPractise();
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number");
int xx = sc.nextInt();
System.out.println("Enter 2nd number");
int yy = sc.nextInt();

add(xx,yy);
sub(xx,yy);
mul(xx,yy);

//mp.add(10,20);
//mp.sub(30,10);
//mp.mul(10,30);

    }

    public static void add(int x, int y){
       int add1 = x + y;
       System.out.println("Addition of 2 given nums are "+add1);
    }

    public static void sub(int x, int y){
        int sub1 = x - y;
        System.out.println("Substraction of 2 given nums are "+sub1);
    }

    public static void mul(int x, int y){
        int mul1 = x * y;
        System.out.println("Multiplication of 2 given num are "+mul1);

    }


}

