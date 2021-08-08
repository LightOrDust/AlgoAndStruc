package com.aixue.sort;

public class MergeSort {
    //递归实现
    public static int[] mergeSort(int[] arr) {
        //看似可写可不写，确实为程序组织了一部分的不必要的执行
        if(arr==null||arr.length<2){
            return null;
        }

        process(arr,0,arr.length-1);
        return arr;
    }
    public static void process(int[] arr,int L,int R){
         if(L==R){
             return;
         }
         int mid=L+((R-L)>>1);
        process(arr,L,mid);
        process(arr,mid+1,R);
        merge(arr,L,mid,R);
    }
    public static void merge(int[] arr, int L,int mid,int R){
        int[] help=new int[R-L+1];
        int i=0;
        int p1=L;
        int p2=mid+1;
        while(p1<=mid&&p2<=R){
            help[i++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }

        //要么p1越界了，要么P2越界了
        while(p1<=mid){
            help[i++]=arr[p1++];
        }

        while(p2<=R){
            help[i++]=arr[p2++];
        }

        for( i=0;i<help.length;i++){
            arr[L+i]=help[i];
        }
    }
    public static void main(String[] args) {
        int[] arr={7,6,9,4,5,8,1,3,2};
        int[] a=mergeSort(arr);
        System.out.println(a);
    }
}
