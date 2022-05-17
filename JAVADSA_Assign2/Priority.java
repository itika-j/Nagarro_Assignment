import java.util.*;
public class Priority {

	static class node {
	    int data;
	    int priority;
	    node next;	     
	}
	 
	static node nod = new node();
	     
	static node newNode(int d, int p)
	{
		node temp = new node();
	    temp.data = d;
	    temp.priority = p;
	    temp.next = null;
	     
	    return temp;
	}

	static int peek(node head)
	{
	    return (head).data;
	}

	static node pop(node head)
	{
		node temp = head;
	    (head) = (head).next;
	    return head;
	}
	     
	static node push(node head, int d, int p)
	{
		node start = (head);
		node temp = newNode(d, p);
	    if ((head).priority > p) {
	        temp.next = head;
	        (head) = temp;
	    }
	    else {
	        while (start.next != null && start.next.priority < p) {
	            start = start.next;
	        }
	        temp.next = start.next;
	        start.next = temp;
	    }
	    return head;
	}
	
	static int isEmpty(node head)
	{
	    return ((head) == null)?1:0;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node pq = newNode(4, 1);
	    pq =push(pq, 5, 2);
	    pq =push(pq, 6, 3);
	    pq =push(pq, 7, 0);
	     
	    while (isEmpty(pq)==0) {
	        System.out.printf("%d ", peek(pq));
	        pq=pop(pq);
	    }
	}

}
