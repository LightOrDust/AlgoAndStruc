package com.aixuexi.day11;

public class RevserseCString {
    //编写一个函数，其作用是将输入的字符串反转过来。输入字符串一字符数据char[]的形式给出

    public static void reverseString(char[] a) {
        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            char temp= a[start];
            a[start] =a[end];
            a [end] =temp;
            start++;
            end--;
        }
    }

    public static  void main(String[] args) {
        char[] a={'h','e','l','l','o'};
        reverseString(a);
        System.out.println(a);

    }
}
