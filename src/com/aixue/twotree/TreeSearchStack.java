package com.aixue.twotree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeSearchStack {
    /**
     * 非递归方式实现二叉树的遍历规则：1、弹出就打印；2、若有右，先压右，否则不压；如有左，先压左，否则不压；3、
     */
    class Node {
        int val;
        Node left;
        Node right;

        Node() {
        }

        ;

        Node(int val) {
            this.val = val;
        }

        Node(int val, Node left, Node right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

        //用栈实现二叉树的前序遍历，也叫迭代法
        public void pre(Node head) {
            System.out.println("pre-order:");
            if (head != null) {
                Stack<Node> stack = new Stack<>();
                stack.push(head);
                while (!stack.isEmpty()) {
                    head = stack.pop();
                    System.out.println(head.val + " ");
                    if (head.right != null) {
                        stack.push(head.right);
                    }
                    if (head.left != null) {
                        stack.push(head.left);
                    }
                }
            }
        }

        //后续遍历1,通过pre 的倒叙把pos打印出来
        public void pos(Node head) {
            System.out.println("pos-order");
            if (head != null) {
                Stack<Node> s1 = new Stack<>();
                Stack<Node> s2 = new Stack<>();
                s1.push(head);
                while (!s1.isEmpty()) {
                    head = s1.pop();
                    s2.push(head);
                    if (head != null) {
                        s1.push(head.right);
                    }
                    if (head != null) {
                        s2.push(head.left);
                    }
                }
                while (!s2.isEmpty()) {
                    System.out.println(s2.pop() + " ");
                }
            }
        }

        //中序遍历
        public void in(Node head) {
            System.out.println("in-order:");
            if (head != null) {
                Stack<Node> stack = new Stack<>();
                while (!stack.isEmpty() || head != null) {
                    if (head != null) {
                        stack.push(head);
                        head = head.left;
                    } else {
                        head = stack.pop();
                        System.out.println(head.val + " ");
                        head = head.right;
                    }

                }
            }
        }

        //后续遍历的第二个版本
        public void pos2(Node h) {
            System.out.println("pos2-order:");
            if (h != null) {
                Stack<Node> stack = new Stack<>();
                stack.push(h);
                Node c = null;
                while (!stack.isEmpty()) {
                    c = stack.peek();
                    if (c.left != null && h != c.left && h != c.right) {
                        stack.push(c.left);
                    } else if (c.right != null && h != c.right) {
                        stack.push(c.right);
                    } else {
                        System.out.println(stack.pop().val + " ");
                        h = c;
                    }
                }
            }
        }

        //二叉树的层序遍历
        public void level(Node head) {
            if (head == null) {
                return;
            }
            Queue<Node> queue = new LinkedList<>();
            queue.add(head);
            while (queue != null) {
                Node cur = queue.poll();
                System.out.println(cur.val + " ");
                if (head.left != null) {
                    queue.add(cur.left);
                    if (head.right != null) {
                        queue.add(cur.right);
                    }
                }
            }
        }
    }
}