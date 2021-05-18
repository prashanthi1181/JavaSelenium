package Day1;

import java.util.Locale;

public class Stringfunctions {
    public static void main(String[] args) {
        String name = "Aditi Lagisetty" ;
        String name1 = "prashanthi";

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.substring(7,9).toUpperCase());
        System.out.println(name.substring(1,5).trim().toUpperCase());
        System.out.println(name.charAt(12));
        System.out.println(name.replace("Aditi","prashanthi"));
    }
}
