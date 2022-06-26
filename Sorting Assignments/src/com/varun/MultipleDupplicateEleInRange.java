package com.varun;

//442. Find All Duplicates in an Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleDupplicateEleInRange {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> ans = findDuplicates(arr);
        System.out.println(ans.toString());
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int index = 0;
        while(index< nums.length){
            if(nums[index] != index+1 && nums[index]!= nums[nums[index]-1]){
                swap(nums,index,nums[index]-1);
            }else{
                index++;
            }
        }
        List<Integer> ans = new ArrayList<Integer>();
        for(int i = 0;i< nums.length;i++){
            if(nums[i] != i+1){
                ans.add(nums[i]);
            }
        }
        return ans;
    }

    public static void swap(int [] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp ;
    }

}
