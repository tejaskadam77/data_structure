package com.data_structure.linked_list;

public class Linked_List {
	private int listLength;
	Node head = null;
	private int Linked_List_Size = 0;

	void insert_At_Beg(int data) {
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
			Linked_List_Size++;
		} else {
			temp.setNext(head);
			head = temp;
			Linked_List_Size++;
		}
	}

	void append(int data) {
		Node cur;
		Node temp = new Node(data);
		if (head == null) {
			head = temp;
		} else {
			cur = new Node(data);
			cur = head;
			while (cur.getNext() != null) {
				cur = cur.getNext();
			}
			cur.setNext(temp);

		}

	}
	void insertAtGivenPosition(int data,int position)
	{
		int counter = 0;
		Node prev = null;
		Node cur = head;
		if (cur == null) {
			System.out.println("list is empty cannot add");
			insert_At_Beg(data);
		} else {
			while (counter < position&&cur!=null) {
				prev = cur;
				cur = cur.getNext();
				counter++;
			}
			Node temp = new Node(data);
			prev.setNext(temp);
			temp.setNext(cur);
		}

	}
	void deleteFirstNode()
	{
		if(head==null)
		{
			System.out.println("Invalid operation as list is empty");
		}
		else
		{
			head=head.getNext();
		}
	}
	void deleteLastNode()
	{
		if(head==null)
		{
			System.out.println("no node to delete list is already empty");
		}
		else if(head.getNext()==null)
		{
			head=null;
		}
		else
		{ Node prev=head;
			while(prev.getNext().getNext()!=null)
			{
				prev=prev.getNext();
			}
			prev.setNext(null);
		}
	}
	void displayList()
	{
		Node current=head;
		if(current==null)
			System.out.println("list ies empty");
		else
		{
			while(current!=null)
			{    System.out.print(current.getData()+"--->");
				current=current.getNext();
				listLength++;
			}
		}
	}
}
