package com.aixue.str;
//7.29今天状态不好，这道题先放一放
//7.30 更该后的kmp算法，感觉老外的—1操作不是很让人理解，遂根据《代码随想录》中作者提供的思路，进行了修改
public class KMP {
    //1、传入要比较的两个字符
    public static int  strStr(String haystack,String needles ){
        if(haystack.length()==0){
            return  -1;
        }
        if(needles.length()==0){
            return  0;
        }
        char[] hayarr=haystack.toCharArray();
        char[] nearr=needles.toCharArray();
        int haylen=hayarr.length;
        int nelen=nearr.length;
        return  kmp(hayarr,nearr,haylen,nelen);
    }
    //2、构造kmp算法
    public static int kmp(char[] hayarr,char[] nearr,int haylen,int nelen){
        int[] next=getNext(nearr,nelen);
        int j=0;
        for (int i = 0; i < haylen; i++) {
            //如果不匹配
            while (j > 0 && hayarr[i] != nearr[j]) {
                j = next[j - 1] ;
            }
            if (nelen - j + i > haylen) {
                return -1;
            }
            if (hayarr[i] == nearr[j]) {
                ++j;
            }
            if (j == nelen) return haylen - j + 1;
        }
        return  -1;
    }

    //3、获取next数组
    public static int[] getNext(char[] nearr,int nelen){
        int[] next=new int[nelen];
        int j=0;//j c从0开始
        next[0]=j;

        //next数组第2位开始判断，边界就是数据的长度
        for(int i=1;i<nelen;i++){
            //分三种情况：1、如果后一位和前一位的值不相等,就要一直回退
          while(j>=0&&nearr[i]!=nearr[j]) {
              j=next[j-1];
          }
            //2、入伙后一位的值和前一位相等
            if(nearr[i]==nearr[j]){
                j++;
            }
        //3、将J的值赋值给Next数组对应的位置
            next[i]=j;
        }

      return next;
    }

    public static void main(String[] args) {
        String haystack="hello";
        String needle="ll";
        System.out.println(strStr(haystack,needle));

    }
}
