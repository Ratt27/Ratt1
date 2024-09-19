class Queueown {
    static class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node head;

        boolean isEmpty() {
            return head == null;
        }

        void push(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    // Queue using two stacks
    static class QueueUsingStacks {
        Stack stack1 = new Stack();  // Stack for enqueue operation
        Stack stack2 = new Stack();  // Stack for dequeue operation

        // Enqueue operation (add element to the queue)
        void enqueue(int data) {
            stack1.push(data);
        }

        // Dequeue operation (remove element from the queue)
        int dequeue() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // If stack2 is empty, transfer elements from stack1 to stack2
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            // Pop from stack2 (which now holds the front of the queue)
            return stack2.pop();
        }

        // Peek operation (get the front element of the queue)
        int peek() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            // If stack2 is empty, transfer elements from stack1 to stack2
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            // Peek the top element of stack2 (which holds the front of the queue)
            return stack2.peek();
        }

        // Check if the queue is empty
        boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    }

    public static void main(String[] args) {
        QueueUsingStacks queue = new QueueUsingStacks();  // Create a queue instance

        // Enqueue elements into the queue
        queue.enqueue(1);
        queue.enqueue(4);
        queue.enqueue(5);

        // Dequeue and print elements from the queue
        while (!queue.isEmpty()) {
            System.out.println(queue.peek());
            queue.dequeue();
        }

        // Enqueue more elements
        queue.enqueue(8);
        queue.enqueue(9);

        // Print the current front element
        System.out.println(queue.peek());

        // Dequeue and print elements
        queue.dequeue();
        System.out.println(queue.peek());

        queue.dequeue();
        System.out.println(queue.peek());
    }
}
