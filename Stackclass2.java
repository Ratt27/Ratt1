public class Stackclass2 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head;

        // Function to check whether the stack is empty or not
        static Boolean isEmpty() {
            return head == null;
        }

        // PUSH FUNCTION
        public static void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // POP FUNCTION
        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        // PEEK FUNCTION
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }

        // Function to push an element at the bottom of the stack
        static void pushAtBottom(int data) {
            if (isEmpty()) {
                push(data);
                return;
            }
            int top = pop();
            pushAtBottom(data);
            push(top);
        }


      static void Reverse()
{
if(isEmpty())
{
return;
}
int top=pop();
Reverse();
pushAtBottom(top);

}
    }

    public static void main(String args[]) {
        Stack.push(1);
        Stack.push(4);
        Stack.push(5);

        Stack.pushAtBottom(8); // Push element at the bottom
        Stack.pushAtBottom(9); // Push another element at the bottom
       // Stack.Reverse();
        
        while(!Stack.isEmpty())
       {
       System.out.println(Stack.peek());
       Stack.pop();
       }
         
            }
}
