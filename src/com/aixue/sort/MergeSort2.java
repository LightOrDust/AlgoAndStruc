package com.aixue.sort;
import static com.aixue.sort.MergeSort.merge;

public class MergeSort2 {
    public static int[] mergeSort2(int[] arr){
        if(arr==null || arr.length<2){
            return null;
        }
        int N =arr.length;
        int mergeSize=1;//当前有序的左组长度
        while(mergeSize<N){
            int L=0;
            while(L<N){
                int mid=L+mergeSize-1;
                if(mid>=N){
                    break;
                }
                int R=Math.min(mergeSize+mid,N-1);
                merge(arr,L,mid,R);
                L=R+1;
            }
            if(mergeSize>N/2){//为了防止出现越界异常
                break;
            }
            mergeSize<<=1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={7,6,9,4,5,8,1,3,2};
        int[] a=mergeSort2(arr);
        System.out.println(a);
    }
}







