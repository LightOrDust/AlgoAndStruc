package com.aixue.stackandqueue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

//leetcode 20 有效的括号，给定一个只包括‘（’，‘）’，'{','}','['']'的字符串，判断字符串是否有效
public class ValidParentheses {

    public  static boolean validParentheses(String s){
        Deque<Character> deque=new LinkedList<>();
        char ch;
       // char[] arr= s.toCharArray();
       // Stack<String> stack =new Stack();
    for(int i=0;i<s.length();i++){
        ch=s.charAt(i);
        if(ch=='(') {
            deque.push(')');
            }
        else if(ch=='{') {
            deque.push('}');
        }
        else if(ch=='[') {
            deque.push(']');
        }
        else if(deque.isEmpty()||deque.peek()!=ch){
            return false;
        }
        else{
            deque.pop();
        }
    }
        return false;
    }
    public static void main(String[] args) {
        String s ="{[()]}}";
        System.out.println(validParentheses(s));
    }
}
