package com.data_structure.linked_list;

public class Linked_List {
	Node head = null;
	private int Linked_List_Size = 0;

	void insert_At_Beg(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
			Linked_List_Size++;
		} else {
			temp.next = head;
			head = temp;
			Linked_List_Size++;
		}
	}

	void insert_At_End(int data) {
		Node cur;
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
		} else {
			cur = new Node();
			cur = head;
			while (cur.next != null) {
				cur = cur.next;
			}
			cur.next = temp;

		}
	}

	void display_Linked_list() {
		if (head == null) {
			System.out.println("no elements are present");
		} else {
			Node cur = new Node();
			cur = head;
			{
				while (cur != null) {
					System.out.println(cur.data + "->");
					cur = cur.next;

				}
			}
		}
	}
}
