package Day1;

import javax.swing.*;

public class palindromeReverse {

   public static void main(String args[]){

       int num=5;

       for (int i= 1; i<=num; i++){

           for(int j=num; j>=i; j--){

               System.out.print("*");

           }

           System.out.println();

       }
   }


}
