package Searching;

import java.util.Arrays;

public class InBuiltBinary {
    public static void main(String[] args) {

        int[] array=new int[1000];
        int target=190;

        for (int i=0;i< array.length;i++){
            array[i]=i;
        }

        int index= Arrays.binarySearch(array,target);



        if (index==-1){
            System.out.println("Value Not Found In the Array");
        }else {
            System.out.println("Value Found at the index of :"+index);
        }
    }
}
