package com.stu;

import org.junit.jupiter.api.Test;

public class Cycle {

    public boolean isCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
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
        q5.next=q1;
        boolean result =  isCycle(q1);
        System.out.println(result);
    }
}
