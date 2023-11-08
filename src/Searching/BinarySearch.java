package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        //create scanner class take a input from user
        Scanner sc=new Scanner(System.in);

        //create an integar arr and take its size an input
        System.out.print("Enter Array size :");
        int[] arr=new int[sc.nextInt()];

        //store elements into array
        System.out.println("Enter the Array Elements :");
        for (int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }

        //take key to be searched as input
        System.out.print("Enter the key to search :");
        int key= sc.nextInt();

        //declare the and initialize the high and low
        int low=0;
        int high= arr.length-1;

        //Binary search logic-calculate mid-point and search
        while(low<=high){
            int mid=(low+high)/2;
            if (key==arr[mid]){
                System.out.println("Key Found At Index :"+"["+mid+"]");
                System.exit(0);
            }else if (key>arr[mid]){
                low=mid+1;
                high=high;
            }else {
                high=mid-1;
                low=low;
            }
        }
        System.out.println("Key not Found");
        sc.close();
    }
}
