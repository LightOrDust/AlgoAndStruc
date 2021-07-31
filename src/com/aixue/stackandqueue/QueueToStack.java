package com.aixue.stackandqueue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueToStack {
    //需要对队列进行学习

    //1、首先要实现准备两个队列
    Queue<Integer> queue1;
    Queue<Integer> queue2;
    public QueueToStack(){
        queue1=new LinkedList<>();
        queue2=new LinkedList<>();
    }
    //2、实现压栈操作
    public void push(int x){
        //先放到queue2中
        queue2.offer(x);
        while(!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }
        Queue<Integer> queueTemp;
        queueTemp=queue1;
        queue1=queue2;
        queue2=queueTemp;
    }
    //3、实现弹栈操纵
    public  int pop(){
        return  queue1.poll();
    }
    //4、取栈顶元素
    public int top(){
        return  queue1.peek();
    }
    //5、判断栈内是否为空
    public boolean empty(){
        return  queue1.isEmpty();
    }
}
