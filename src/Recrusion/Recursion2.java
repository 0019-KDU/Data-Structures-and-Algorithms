package Recrusion;

public class Recursion2 {

    public int factorial(int n){
        if (n==0){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {

        Recursion2 r2=new Recursion2();
        int y=5;
        int result=r2.factorial(y);
        System.out.println(result);
    }
}
