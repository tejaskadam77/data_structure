package geeksForGeeks.linkedList.doublyLinkedList;

public class DoublyLinkedListSolution {
    public static void main(String[] args) {
        DoublyLinkedList d = new DoublyLinkedList();
     d.insertAtBegin(10);
//        d.insertAtBegin(20);
//        d.insertAtBegin(30);
        d.insertLast(40);
        d.display();
        d.displayRev();

        System.out.println(d.findPosition(10));
        System.out.println(d.findPosition(50));

        System.out.println("Size = "+d.size);
    }
}
