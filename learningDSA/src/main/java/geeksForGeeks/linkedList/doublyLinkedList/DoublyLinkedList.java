package geeksForGeeks.linkedList.doublyLinkedList;


import org.w3c.dom.Node;

import java.sql.SQLOutput;

public class DoublyLinkedList {
    private class DLLNode {
        public int data;
        public DLLNode prev;
        public DLLNode next;

        public DLLNode(int data) {
            this.data = data;
            this.prev = this.next = null;
        }

        public DLLNode(int data, DLLNode prev, DLLNode next) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }

    }

    private DLLNode head;
    private DLLNode tail;

    int size = 0;

    void insertAtBegin(int data) {
        DLLNode node = new DLLNode(data);
        if (head != null) {
            node.next = head;
            head.prev = node;
            size++;
            head = node;
        } else {
            head = tail = node;
            size++;
        }
    }

    void display() {
        DLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void displayRev() {
        DLLNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.prev;
        }
        System.out.println("NULL");
    }

    void insertLast(int data) {
        if (head != null) {
            DLLNode node = new DLLNode(data);
            tail.next = node;
            node.prev = tail;
            tail = node;
        } else {
            insertAtBegin(data);
        }
    }

    int findPosition(int value) {
        int index = 1;
        if (head == null)
            return 999;
        DLLNode temp = head;
        while (temp != null) {
            if (temp.data == value) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return 999;
    }

    public DLLNode find(int value) {
        if (head == null)
            return null;
        else {
            DLLNode node = head;
            while (node != null) {
                if (node.data == value)
                    return node;
                else {
                    node = node.next;

                }
            }
            return null;
        }
    }

    public void insert(int after,int value)
    {
        DLLNode p = find(after);
        if(p==null)
        {
            System.out.println("after Node does not exist");
        }
        else
        {
            DLLNode node =new DLLNode(value);
            node.next=p.next;
            p.next=node;
            node.prev=p;
            if(node.next!=null)
            node.next.prev=node;
        }
    }

}


