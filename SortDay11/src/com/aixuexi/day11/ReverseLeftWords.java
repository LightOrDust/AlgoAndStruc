package com.aixuexi.day11;

public class ReverseLeftWords {

    public static String  reverseLeftWord(String s, int n){
        int len=s.length()-1;
        System.out.println(len);
//如果不传入S会导致字符超出范围的情况，但是却不能定义容量，这是为什么？
        StringBuilder sb=new StringBuilder(s);
//    1、反转前K个字符
       StringBuilder sb1=reverseString(sb,0,n-1);
        System.out.println(sb1);
//    2、反转s.lengt-k  个字符
        reverseString(sb,n,len);
//    3、反转整个字符串
        reverseString(sb,0,len);
        return sb.toString();
    }

    public static StringBuilder reverseString(StringBuilder sb, int start,int end){
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
        return  sb;
    }
    public static void main(String[] args) {
        String s="abcdefg";
        int n=3;
        String a=reverseLeftWord(s,n);
        System.out.println(a);

    }
}
