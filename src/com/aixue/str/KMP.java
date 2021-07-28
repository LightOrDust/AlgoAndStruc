package com.aixue.str;
//今天状态不好，这道题先放一放
public class KMP {
    //1、获取next数组
    public void getNext(int[] next,String s){
        int j=-1;
        next[0]=j;
        //next数组第2位开始判断，边界就是数据的长度
        for(int i=1;i<s.length();i++){
            //分三种情况：1、如果后一位和前一位的值不相等,就要一直回退

//            j>=0&&s.charAt(i)!=s.charAt(j+1);
            //2、入伙后一位的值和前一位相等,就要把j的值+1，
            if(s.charAt(i)==s.charAt(j+1)){
                j++;
            }
        //3、将J的值赋值给Next数组对应的位置
            next[i]=j;
        }

    }
}
