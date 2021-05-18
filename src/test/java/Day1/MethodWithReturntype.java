package Day1;

public class MethodWithReturntype {
    public static void main(String[] args) {

        MethodWithReturntype s = new MethodWithReturntype();
        int a = s.add(10,30);
        int b = s.sub(50,10);
        int c = s.mul(10, 20);
        System.out.println("Addition is: "+a*10);
        System.out.println("Substraction is: "+b*2);
        System.out.println("Multiplication is : " +c);
    }

    public int add(int x, int y){
        int add = x + y;
        return add;

    }

    public int sub(int x, int y){
        int sub = x - y;
        return sub;
    }

    public int mul(int x, int y){
        int mul = x*y;
        return mul;

    }
}
