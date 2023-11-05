package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        //create a scanner class
        Scanner sc=new Scanner(System.in);

        //create an integer array and take its size as input
        System.out.println("Enter the Array Size :");
        int[] arr=new int[sc.nextInt()];

        //store the elements into array
        System.out.println("Enter the Array Element :");
        for(int i=0;i<= arr.length-1;i++){
            arr[i]=sc.nextInt();
        }

        //print the array Element
        for(int i=0;i<=arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        //take a key to be searched as input
        System.out.println("Enter the key to be searched :");
        int key=sc.nextInt();


        //linear search logic
        for (int i=0;i< arr.length-1;i++){
            if (key==arr[i]){
                System.out.println("Key Found at Index :"+"["+i+"]");
            }
        }

        System.out.println("Key Not Found....");
    }
}
