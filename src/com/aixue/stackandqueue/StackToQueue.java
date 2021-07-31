package com.aixue.stackandqueue;

import java.util.Stack;

public class StackToQueue {
    //1、定义两个栈，一个负责进栈，一个负责出栈
    Stack <Integer> stack1;
    Stack <Integer> stack2;
    public void stackToQueue(){
        stack1 =new Stack<>();
        stack2 =new Stack<>();
    }
    //push element x to the back of the queue
   public void push(int x){
        stack1.push(x);

   }
   //remove the element in front of the queue and return that result;
    public int pop(){
        dumpStack1();
        return stack2.peek();
    }//get the frist element and return that result
    public int  peek(){
        dumpStack1();
        return stack2.peek();

    }
    //return whether the queue is empty
    public boolean empty(){
     return   stack1.isEmpty()&&stack2.isEmpty();
    }
    // if stack2 was empty, put the element of stack1 to stack2
    public void  dumpStack1(){
        if(stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
    }

}
