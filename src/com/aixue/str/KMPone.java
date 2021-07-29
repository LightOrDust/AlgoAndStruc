package com.aixue.str;

public class KMPone {
    public static  int strStr(String haystack,String needle){
        if(haystack.length()==0){
            return -1;
        }
        if(needle.length()==0){
            return  0;
        }
        char[] hayarr=haystack.toCharArray();
        char[] nearr=needle.toCharArray();
        int haylen=hayarr.length;
        int nelen =nearr.length;
        return kmp(hayarr,haylen,nearr,nelen);
    }
    public  static int kmp(char[]hayarr,int haylen,char[]nearr,int nelen) {
        int[] next = next(nearr, nelen);
        int j = 0;

        for (int i = 0; i < haylen; i++) {
            //如果不匹配
            while (j > 0 && hayarr[i] != nearr[j]) {
                j = next[j - 1] + 1;
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
    public static int[] next(char[] needle,int len){
         int[] next=new int[len];
         next[0]=-1;
         int k=-1;
         for(int i=1; i<len;i++){
             while(k!=-1&&needle[k+1]!=needle[i] ){
                     k=next[k];
             }
             if(needle[k+1]==needle[i]){
                     k++;
             }
             next[i]=k;

         }
         return next;
    }
    public static void main(String[] args) {
        String haystack="hello";
        String needle="ll";
        System.out.println(strStr(haystack,needle));

    }
}
