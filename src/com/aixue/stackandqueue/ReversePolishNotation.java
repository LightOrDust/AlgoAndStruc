package com.aixue.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;

public class ReversePolishNotation {
    public static Integer reversePolishNotation(String [] tokens){
        //注意arraylist和linkedlist的区别，arraylist实质还是数组，可以扩容，而linkedlist是双链表
        Deque<Integer> stack = new LinkedList<>();
        for(String token:tokens){
            char c=token.charAt(0);
            if(!isOpe(token)){
                stack.addFirst(stoi(token));
            }else if(c=='+'){
                stack.push(stack.pop()+stack.pop());
            } else if (c == '-') {
                //谁减谁呢？
                stack.push(-stack.pop()+stack.pop());
            }else if(c=='*'){
                stack.push(stack.pop()*stack.pop());
            }else
            {
                int num1=stack.pop();
                int num2=stack.pop();
                stack.push(num2/num1);
            }
        }
        return stack.pop();
    }
    private static boolean isOpe(String s){
        return  s.length()==1&&s.charAt(0)<'0'||s.charAt(0)>'9';
    }
    private static int stoi(String s){
        return  Integer.parseInt(s);
    }
    public static void main(String[] args) {
        Integer m= new ReversePolishNotation().reversePolishNotation(new String[]{"50","2","-"});
        System.out.println(m);
    }

}
