package geeksForGeeks.linkedList.CIrcularLinkedLIst;

public class CircularLinkedList {
    CLLNode head;
    CLLNode tail;

    void insert(int value) {
        CLLNode node = new CLLNode(value);
        if (head != null) {

            tail.next = node;
            node.next = head;
            tail = node;

        } else {
            head = tail = node;
        }
    }

    void delete(int value) {
        CLLNode temp = head;
        if (temp == null)
            return;
        if (temp.value == value) {
            head = head.next;
            tail.next = head;
            return;
        } else {
            do {
                CLLNode n = temp.next;
                if (n.value == value) {
                    temp.next = n.next;
                    if (n.next == head)
                        tail = temp;
                }
                temp=temp.next;
            }while(temp!=head);
        }
    }


    void display() {
        CLLNode temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + "-->");
                temp = temp.next;
            } while (temp.value != head.value);
        }
    }

    public class CLLNode {
        private int value;
        private CLLNode next;

        CLLNode(int value) {
            this.next = null;
            this.value = value;
        }
    }
}
