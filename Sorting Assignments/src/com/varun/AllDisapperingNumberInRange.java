package com.varun;
//448. Find All Numbers Disappeared in an Array

import java.util.ArrayList;
import java.util.List;

public class AllDisapperingNumberInRange {
    public static void main(String[] args) {
        int [] arr = {4,3,2,7,8,2,3,1}; //length = 8 d
        // duplicates are present
        List <Integer> ans  = findDisappearedNumbers(arr);
        System.out.println(ans.toString());

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        cyclicSort(nums);
//        now search for the indexes which dont contain the like elements
        ArrayList<Integer>  ans = new ArrayList<Integer>();
        for(int i=0;i< nums.length;i++){

            if(nums[i] != i+1){         //case 1
                ans.add(i+1);
            }
        }
        return ans;
    }
//            [3,2,1,4,5,6,7,9] length is 8

    public static void cyclicSort(int [] arr){
        int i=0;
        while(i < arr.length){
//            arr[i] < arr.length
            if(  arr[i] != i+1 && arr[i]!=arr[arr[i]-1] ){
                swap(arr,i,arr[i]-1);

            }
//            else if (arr[i]>=arr.length){
//
//            }
            else{
                i++;
            }
        }
    }

    public static void swap (int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]  = temp;
    }
}
