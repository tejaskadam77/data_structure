package geeksForGeeks.linkedList;


public class SinglyLinkedList {


    public class SLLNode {
        public int data;
        public SLLNode next;

        public SLLNode(int data) {
            this.data = data;
        }

        public void next(SLLNode temp) {
        }
    }

    private int length = 0;
    SLLNode head;

    public synchronized void insertAtBegin(SLLNode node) {

        node.next(head);
        head = node;
        length++;
    }

    public void showList(SLLNode head) {
        SLLNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
    }

    public static int calculateLengthOfList(SLLNode head) {
        SLLNode currentNode = head;
        int count = 0;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;
        }
        return count;
    }

    public synchronized void insertAtEnd(SLLNode dataNode) {
        if (head == null) {
            head = dataNode;
            length++;
            return;
        }
        SLLNode temp = head;
        while (temp.next != null) {
            temp = temp.next;

        }
        dataNode.next(temp);
        length++;
    }

    public synchronized void insert(int data, int position) {
        if (position < 0)
            position = 0;
        if (position > length)
            position = length;

        if (head == null) {
            head = new SLLNode(data);
            length++;
            return;
        } else if (position == 0) {
            SLLNode temp = new SLLNode(data);
            insertAtBegin(temp);
        } else {
            SLLNode temp = head;
            int index = 1;
            while (temp != null && index < position) {
                temp = temp.next;
                index++;
            }
            SLLNode newNode = new SLLNode(data);
            newNode.next = temp.next;
            temp.next = newNode;
            length++;
        }
    }

    public synchronized void removeFromBegin() {
        if (head == null)
            System.out.println("list is already empty");
        else {
            head = head.next;
            length--;
        }
    }

    public synchronized void removeFromEnd() {
        if (head == null)
            System.out.println("list is already empty");
        if (head.next == null) {
            head = null;
            length--;
        } else {
            SLLNode lastNode = head.next;
            SLLNode secondLastNode = head;
            while (lastNode.next != null) {
                secondLastNode = lastNode;
                lastNode = lastNode.next;
            }
            secondLastNode.next = null;
            length--;
        }
    }

    public synchronized void removeMatched(SLLNode node) {
        if (head == null) {
            System.out.println("list is empty");
        }
        if (head.equals(node)) {
            head = head.next;
            length--;
            return;
        }
        SLLNode prevToCur = head;
        SLLNode current = head.next;
        while (current != null) {
            if (current.equals(node)) {
                prevToCur.next = current.next;
                length--;
                break;
            }
            prevToCur = current;
            current = current.next;
        }
        if (current == null)
            System.out.println("no element found with match record");
    }

    public synchronized void delete(int position) {
        if (position < 0)
            position = 0;
        if (position > length)
            position = length;

        if (head == null) {
            removeFromBegin();
        } else {
            SLLNode temp = head;
            int index = 1;
            while (temp != null && index < position) {
                temp = temp.next;
                index++;
            }
            temp.next = temp.next.next;
            length--;
        }
    }

    public synchronized int getPosition(int data) {
        int position = 1;
        SLLNode temp = head;
        while (temp != null) {
            if (temp.data == data)
                return position;
            else {
                temp = temp.next;
                position += 1;
            }
        }
        if (temp == null && position > 1) {
            System.out.println("Data not present inside list");
        } else {
            System.out.println("Data Not found in List");
        }
        return Integer.MIN_VALUE;
    }
}

