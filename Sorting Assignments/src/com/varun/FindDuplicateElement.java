package com.varun;

//287. Find the Duplicate Number

public class FindDuplicateElement {
    public static void main(String[] args) {
        int []arr = {1,3,4,2,2};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] nums) {
        int index = 0;
        while(index< nums.length){
            if(nums[index] != index+1 && nums[index]!= nums[nums[index]-1]){
                swap(nums,index,nums[index]-1);
            }else{
                index++;
            }
        }

        return nums[nums.length-1];
    }

    public static void swap(int [] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp ;
    }

}
