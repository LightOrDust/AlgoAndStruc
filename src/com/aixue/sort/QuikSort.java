package com.aixue.sort;

public class QuikSort {
    //快速排序分三大步，选取pivot，把数组中大于pivot的数放在左边，把小于pivot的数放在右边
    //把pivot左边的数重复上边的步骤
    //把pivot右边的数重复上述的步骤
   public static int get_mid(int b[],int left,int right){
        int pivot=b[left];
        while (left<right){
            while (b[right]>=pivot&&left<right)     right--;
                b[left]=b[right];
            while(b[left]<=pivot&&left<right)      left++;
            b[right]=b[left];
            }
        b[left]=pivot;
        return left;
        }

   public static int[] quick_sort(int[] b,int left,int right){
        if(left<right){
            int mid=get_mid(b,left,right);
            quick_sort(b,left,mid-1);
            quick_sort(b,mid+1,right);
        }
        return  b;
    }
    public static void main(String[] args) {
        int[] b={7,2,6,8,5,4,0,3,9};
        int left=0;
        int right=b.length;
        //不会写测试？？？？？？？？？？？？？？？？？
        quick_sort(b,left,right);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
    }
}
