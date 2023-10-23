package ArrayBasicOperation;

import java.util.Scanner;

public class ArraySearch {
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

        System.out.println("Enter the data for search:");
        int data=userInput.nextInt();
        int j=0;
        for ( j=0;j<size;j++){
            if(arr[j]==data){
                break;
            }
        }
        System.out.println("you data is found postion of:"+j);
    }
}