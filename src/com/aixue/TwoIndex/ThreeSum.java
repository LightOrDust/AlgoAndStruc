package com.aixue.TwoIndex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.*;

public class ThreeSum {

    /**给你一个包含 n 个整数的数组int[]nums，判断int[]nums中是否存在三个元素 a，b，c ，使得a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
     注意： 答案中不可以包含重复的三元组。示例：
     给定数组 nums = [-1, 0, 1, 2, -1, -4]，
     满足要求的三元组集合为：
     [
     [-1, 0, 1],
     [-1, -1, 2]
     ]
     */
    public static void main(String[] args) {
        int[] a={-4,-4,-3,-2,-1,0,1,2,2,3,4};
        System.out.print(threeSun(a));
    }

   public static List<List<Integer>>  threeSun(int[] nums){
       List<List<Integer>> result=new ArrayList<>();
       Arrays.sort(nums);

       for (int i = 0; i < nums.length; i++) {
           if(nums[i]>0){
               return result;
           }
           if(i>0&&nums[i]==nums[i-1]){
               continue;
           }
           int left=i+1;
           int right=nums.length-1;
           while(right>left){
               int sum=nums[i]+nums[left]+nums[right];
               if(sum>0){
                   right--;
               }else if(sum<0){
                   left++;
               }else{
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));

                    while (right>left&&nums[right]==nums[right-1]) right--;
                    while(right>left&&nums[left]==nums[left+1])left++;

                    right--;
                    left++;
               }
           }
       }
       return result;
   }

}
