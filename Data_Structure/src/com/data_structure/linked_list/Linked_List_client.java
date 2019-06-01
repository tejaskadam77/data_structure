package com.data_structure.linked_list;

public class Linked_List_client {
public static void main(String[] args) {
	Linked_List l1=new Linked_List();
//	l1.insert_At_Beg(10);
//	l1.insert_At_Beg(20);
	l1.append(30);
	l1.append(40);
//	l1.append(50);
//	l1.append(60);
	l1.displayList();
//	l1.insertAtGivenPosition(15, 2);
//	l1.deleteFirstNode();
	l1.deleteLastNode();
	System.out.println("after deletion");
	l1.displayList();
	}

}
