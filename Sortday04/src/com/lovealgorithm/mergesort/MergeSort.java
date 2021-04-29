package com.lovealgorithm.mergesort;


public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9, 3, 6, 8};//首先讨论两组已经排好序的情况

        sort(arr);//为什么方法调用前面什么都不写呢?
    }

    public static void sort(int[] arr){
        merge(arr);
    }

    static void merge(int[] arr){

        int mid = arr.length >> 1 ;//位运算符计算优先级低于加减乘除运算

        int[] temp = new int[arr.length];//对数组进行初始化

        int i = 0;
        int j = mid+1;  //2进制左移一位，相当于除以2的效果
        int k = 0;



        while (i <= mid && j < arr.length) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        while (i <= mid)  temp[k++] = arr[i++];

        while (j < arr.length)  temp[k++] = arr[j++];

        for (int i1 = 0; i1 < temp.length; i1++) {
            System.out.println(temp[i1]);
        }
    }


}
