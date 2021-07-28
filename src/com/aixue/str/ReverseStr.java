package com.aixue.str;

import java.util.Locale;

public class ReverseStr {

    public static void main(String[] args) {
        String s = "  the  sky  is                blue        ";
        String res=reverseWords(s);

        System.out.println(res);
    }
    public static String reverseWords(String s){

         //去除多余空格
        StringBuilder sb=removeSpace(s);
        //反转字符串
        reverseString(sb,0,sb.length()-1);
        //反转各个单词，
        reverseEachWord(sb);

        return sb.toString();
    }

        private static StringBuilder  removeSpace(String s){   int start =0;
            int end =s.length()-1;
            while(s.charAt(start)==' ') start++;
            while(s.charAt(end)==' ') end --;
            //创建了一个新的字符串
            StringBuilder sb= new StringBuilder();
            while (start<=end){
                char c=s.charAt(start);
                //去除多余的空格；
                if(c!=' '||sb.charAt(sb.length()-1)!=' '){
                    sb.append(c);
                }
                start++;
            }
            System.out.println(sb);
           return    sb;
    }
    public static void reverseString(StringBuilder sb, int start, int end){
        //setcharat(index,char);吧char放到index的位置
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(sb.charAt(end),temp);
            start++;
            end--;
        }
    }
    public static void reverseEachWord(StringBuilder s){
        int start=0;
        int end=1;
        int n=s.length();
        while (start<n){
            while(end<n&&s.charAt(end)!=' '){
                end++;
            }
            reverseString(s,start,end);
            start=end+1;
            end=start+1;

        }
    }
}
