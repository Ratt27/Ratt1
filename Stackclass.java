//stack using linkedlist
public class Stackclass
{
 static class Node
{
int data;
Node next;
 Node(int data)
{
this.data=data;
next=null;
}
}
class Stack
{
 static Node head;
// making a function to check whether the stack is empty or not:
static Boolean isEmpty()// don't have to use object for calling
{
return head==null;
}
//PUSH-FUNCTION
public static void push(int data)
{
// creating a node:
Node newNode= new Node(data);
if(isEmpty())
{
head= newNode;
return;
}
newNode.next= head;
head= newNode;
}
 public static int pop()
{
if(isEmpty())
{
return -1;
}
int top= head.data;
head=head.next;
return top;
}
 public static int peek()
{
if(isEmpty())
{
return -1;
}
return head.data;

}
}

 public static void main(String args[])
{
Stack.push(1);
Stack.push(4);
Stack.push(5);
while(!Stack.isEmpty())
{
System.out.println(Stack.peek());
Stack.pop();
}
Stack.push(8);
Stack.push(9);
System.out.println(Stack.peek());


Stack.pop();
System.out.println(Stack.peek());

Stack.pop();
System.out.println(Stack.peek());




}
}