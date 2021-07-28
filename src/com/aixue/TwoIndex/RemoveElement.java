package com.aixue.TwoIndex;

public class RemoveElement {
    //LEETCODE  -27
    /*
    * 给你一个数组NUMS和一个值VAL,你需要原地移除所有数值等于VAL的元素，并返回移除后数组的新长度
    * */

    public static int removeElement(int[] arr,int val){
        int slowindex=0;
        for(int fastindex=0;fastindex<arr.length;fastindex++ ){
            if(arr[fastindex]!=val){
                arr[slowindex]=arr[fastindex];
                slowindex++;
//                System.out.println(slowindex);
            }
        }
        return slowindex;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,5,5,5,5,6};
        int val=5;
        int a=removeElement(arr,val);
        System.out.println(a);
    }
}
