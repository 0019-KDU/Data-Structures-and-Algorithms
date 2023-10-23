package ArrayBasicOperation;

import java.util.Scanner;

public class ArrayInsert {
    public static void main(String[] args) {

        int[] arr=new int[10];
        int size=5;

        Scanner userInput=new Scanner(System.in);

        System.out.println("Enter Data");
        for(int i=0;i<size;i++){
            arr[i]=userInput.nextInt();
        }
        System.out.println("Out Of Array:");
        for (int i=0;i<size;i++){
            System.out.println("User Input Is:"+arr[i]);
        }

        System.out.println("Enter the Index");
        int ind=userInput.nextInt();

        System.out.println("Enter the Element");
        int ele=userInput.nextInt();

        size++;

        for(int k=size;k>=ind;k--){
            arr[k]=arr[k-1];
        }
        arr[ind]=ele;

        System.out.println("Out of new array");
        for (int i=0;i<size;i++){
            System.out.println("User Input Is:"+arr[i]);
        }


    }
}
