package Recrusion;

public class Recursion {

    int i=0;
    public void Display(){
        System.out.println("Hello "+i);

        i++;

        if(i<10){
            Display();
        }
    }
    public static void main(String[] args) {

        Recursion r1=new Recursion();
        r1.Display();

    }
}
