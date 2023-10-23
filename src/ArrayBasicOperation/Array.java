package ArrayBasicOperation;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] arr=new int[5];
        int size=5;

        Scanner userInput=new Scanner(System.in);


        for(int i=0;i<size;i++){
            arr[i]=userInput.nextInt();
        }

        for (int i=0;i<size;i++){
            System.out.println("User Input Is:"+arr[i]);
        }
    }
}
