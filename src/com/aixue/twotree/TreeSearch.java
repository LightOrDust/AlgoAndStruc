package com.aixue.twotree;



public class TreeSearch {
    //递归方式实现二叉树的前中后序遍历
    class Node{
        int val;
        Node left;
        Node right;
        Node(){};
        Node(int val){
            this.val=val;
        }
        Node(int val,Node left,Node right){
            this.val=val;
            this.left=left;
            this.right=right;
        }


    }
    //前序遍历
    public void pre(Node head){
        if(head==null){
            return ;//什么都不返回
        }
        System.out.println(head.val);
        pre(head.left);
        pre(head.right);
    }
    //中序遍历
    public void in(Node head) {
        if (head == null) {
            return;
        }
        pre(head.left);
        System.out.println(head.val);
        pre(head.right);
    }
    //后序遍历

    public void pos(Node head){
        if(head==null){
            return;
        }
        pos(head.left);
        pos(head.right);
        System.out.println(head.val);
        }
}

