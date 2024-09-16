import java.util.Scanner;

class LL {
    // creation of HEAD
    Node head;
    private int size;

    LL() {
        this.size = 0; // initialization
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add-first
    public void addFirst(String data) {
        Node newNode = new Node(data); // create a new node

        // check if the linked list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add-last
    public void addLast(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // add-middle
    public void addMiddle(String data) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position after which you want to insert the new node:");
        int target = sc.nextInt();

        Node newNode = new Node(data); // create a new node

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        // Traverse to the target position
        for (int i = 1; i < target && currNode != null; i++) {
            currNode = currNode.next;
        }

        if (currNode == null) {
            System.out.println("Target position out of range.");
            return;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // print the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    // delete first node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;
        head = head.next;
    }

    // delete last node
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node currNode = head;
        while (currNode.next.next != null) { // stop at second-last node
            currNode = currNode.next;
        }

        currNode.next = null;
    }

    // get the size of the list
    public int getSize() {
        return size;
    }

    // main method
    public static void main(String args[]) {
        LL list = new LL();

        list.addFirst("Rattriz");
        list.addFirst("this");
        list.addLast("is");

        list.printList(); // print list

        list.deleteFirst(); // delete first node
        list.deleteLast();  // delete last node

        list.addFirst("Rattriz");
        list.addMiddle("is a");
        list.printList();

        System.out.println("Size of list: " + list.getSize());
    }
}
