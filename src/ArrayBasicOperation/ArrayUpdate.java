package ArrayBasicOperation;

import java.util.Scanner;

public class ArrayUpdate {

    public static void main(String[] args) {

        int[] arr = new int[10];
        int size = 5;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter Data");
        for (int i = 0; i < size; i++) {
            arr[i] = userInput.nextInt();
        }
        System.out.println("Out Of Array:");
        for (int i = 0; i < size; i++) {
            System.out.println("User Input Is:" + arr[i]);
        }

        System.out.println("Enter the index for update");
        int ind=userInput.nextInt();

        System.out.println("Enter the data for updated palce");
        int newData=userInput.nextInt();

        arr[ind]=newData;
        System.out.println("Output of New Array");
        for (int i = 0; i < size; i++) {
            System.out.println("User Input Is:" + arr[i]);
        }

    }
}