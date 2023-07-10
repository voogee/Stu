package com.stu;

import org.junit.jupiter.api.Test;

public class LinkReverse {

    public static void ReverseNode(Node node,Node pre){

        if(node==null) return;
        Node next=node.next;
        node.next=pre;
        ReverseNode(next,node);

    }
    static void Print(Node node){
        System.out.println(node.val);
        if(node.next!=null)
            Print(node.next);
    }

    @Test
    public void Test(){
        Node q1=new Node(1);
        Node q2=new Node(2);
        Node q3=new Node(3);
        Node q4=new Node(4);
        Node q5=new Node(5);
        q1.next=q2;
        q2.next=q3;
        q3.next=q4;
        q4.next=q5;
        ReverseNode(q1,null);
        Print(q5);

    }
}

