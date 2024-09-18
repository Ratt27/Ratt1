public class Queue1 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class innerQueue {
        static Node head;
        static Node tail;

        static Boolean isEmpty() {
            return head == null && tail == null;
        }

        static void add(int data) {
            Node newNode = new Node(data); // Corrected: Use 'new' to instantiate Node
            if (head == null) {
                tail = head = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        static int remove() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            int front = head.data;

            if (tail == head) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        static int peek() {
            if (isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }
            return head.data;
        }
}

        public static void main(String args[]) {
            //innerQueue.add(1);
            //innerQueue.add(2);
            //innerQueue.add(3);
            //innerQueue.add(4);
            //innerQueue.add(5);
            innerQueue.add(6);

            while (!innerQueue.isEmpty()) {
                System.out.println(innerQueue.peek());
                innerQueue.remove();
            }
        }
    }

