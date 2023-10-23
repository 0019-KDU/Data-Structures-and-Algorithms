package ArrayBasicOperation;

import java.util.Scanner;

public class ArrayDelete {

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

        System.out.println("Enter the Index");
        int ind = userInput.nextInt();

        for (int j=ind;j<size;j++){
            arr[j]=arr[j+1];
        }

        size--;

        System.out.println("Output of new array");

        for (int i = 0; i < size; i++) {
            System.out.println("User Input Is:" + arr[i]);
        }

    }
}