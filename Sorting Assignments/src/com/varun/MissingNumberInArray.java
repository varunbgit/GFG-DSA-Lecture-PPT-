package com.varun;

//268. Missing Number


//Numbers are Ranging from 0 to N .

import java.util.Arrays;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int [] arr = {0,1};


        int ans = missingNumber(arr);
        System.out.println(ans);
        //now lets find the missing ele


    }

    public static int missingNumber(int[] arr) {
        //do a cyclic sort and then
        cyclicsort(arr);
        //here comes the sorted array

        // we are alloed the O(n)
        // do a linear search on the array and find then odd one is the ans

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i){
                return i;
            }
        }
        return arr.length;
    }
    public static void cyclicsort(int  []arr){
        int  index = 0;
        while(index<=arr.length-1)
            if(arr[index]!=index && arr[index]!= arr.length){
                swap(arr,index,arr[index]);
            }else{
                index++;
            }

    }

     static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
