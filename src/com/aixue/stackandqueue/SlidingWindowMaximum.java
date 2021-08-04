package com.aixue.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static int[] sWinMax(int[] nums,int k ){
        //如何表示这个滑动窗口？队列
        //获取滑动窗口的最大值
        if(nums.length==1){
            return nums;
        }
        int len=nums.length-k+1;
        //存放结果元素的数组
        int[] res=new int[len];
        int num=0;
        //自定义队列
        MyQueue myQueue=new MyQueue();
        //先将前K的元素放入队列
        for(int i=0;i<k;i++){
            myQueue.add(nums[i]);
        }
        res[num++]=myQueue.peek();
        for (int i = 0; i < nums.length; i++) {
            //滑动窗口移除最前面元素，移除并判断该元素是否加入队列
            myQueue.poll(nums[i-k]);
            myQueue.add(nums[i]);
            //记录对应的最大值
            res[num++]=myQueue.peek();
        }
    return res;
    }
    static class MyQueue{
      Deque<Integer>  deque= new LinkedList<>();
      //弹出元素时，比较当时要弹出的数值是否等于列队出口的数值，如果相等则弹出
        public void poll(int val){
            if(!deque.isEmpty()&&val==deque.peek()){
                deque.poll();
            }
        }
        public void add(int val){
            while(!deque.isEmpty()&&val>deque.getLast()){
                deque.removeLast();
            }
        }
        public int peek(){
            return deque.peek();
        }

    }

    public static void main(String[] args) {

    }
}
