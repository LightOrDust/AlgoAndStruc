package com.aixue.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

public class RomoveDuplicates {
    public static String removeDuplicate(String s){
      //  Deque<String> deque=new LinkedList<>();
        //把res当作栈
        StringBuffer res=new StringBuffer();
        // top 为res的长度
        int top=-1;
        char ch;
        for(int i=0; i<s.length();i++){
            ch=s.charAt(i);
            if(top>=0&&ch==res.charAt(top)){
                res.deleteCharAt(i);
            }
            else{
                res.append(i);
                top++;
            }

        }
        return res.toString();
    }
}
