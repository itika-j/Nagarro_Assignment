import java.util.*;

public class QueueLL{
		 int size;
		 static node front = null;
		 static node rear = null;
		 QueueLL(){
			this.size=0;
		}
		class node{
			int data;
			node next;
			node(int data){
				this.data=data;
				this.next=null;
				size++;
			}
		}
		
		//Empty
		public static boolean isEmpty(){
			return front == null && rear == null;
		}
		
		//Enqueue
		public void enqueue(int data){
			node newnode = new node(data);
			if(rear == null){
				rear = front = newnode;
			}
			rear.next= newnode;
			rear=newnode;
		}
		
		//Dequeue
		public int dequeue(){
			if(isEmpty()){
				System.out.println("Queue is Empty");
				return -1;
			}
			if(front== rear){
				rear = null;
			}
			size--;
			int temp = front.data;
			front=front.next;
			return temp;
		}
		
		//peek
		public int peek(){
			if(isEmpty()){
				System.out.println("Queue is Empty");
			}
			return front.data;
		} 
		
		 //size
		public int size(){
			return size;
		}
		//center
		
		public void center(){
			node first=front;
			node second = front;
			while(second !=null && second.next !=null ){
				first= first.next;
				second= second.next.next;
			}
			System.out.println("Middle element = "+first.data);
		} 
		
		
		//iterator
		public void iterator(int index){
			node temp = front;
			int cnt = 0;
			while(temp != null){
				if(cnt == index){
					System.out.println("Element at "+index+" postion is: "+temp.data);
				}
					cnt++;
					temp=temp.next;
			}
		}
		
		//Reverse a queue
		public void reverse(){
			if(front==null || front.next==null){
				return;
			}
			node prev = front;
			node currnode= front.next;
			while(currnode != null){
				node nextnode=currnode.next;
				currnode.next=prev;
				
				//update
				prev=currnode;
				currnode=nextnode;
			}
			front.next=null;
			front=prev;
		}
		
		//sort
		public void sort(){
			node curr= front;
			node index=null;
			int temp;
			if (isEmpty()){
				System.out.println("Queue is Empty");
				return;
			}
			while(curr != null){
				index = curr.next;
				
				while( index != null){
					if(curr.data > index.data){
						temp = curr.data;
						curr.data = index.data;
						index.data = temp;
					}
					index=index.next;
				}
				curr = curr.next;
			}
		}
		
		//print
		public void print(){
			if(isEmpty()){
				System.out.println("Queue Is Empty");
				return;
			}
			node currnode=front;
			while(currnode != null){
				System.out.println(currnode.data);
				currnode=currnode.next;
			}
		}
		
		
	public static void main(String[] args) {
		QueueLL q = new QueueLL();
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(7);
		q.enqueue(1);
		System.out.println("Queue After Insertion");
		q.print();
		System.out.println("---------------------");
		System.out.println("Sorted Queue");
		q.sort();
        q.print();
		System.out.println("---------------------");
		q.dequeue();
		System.out.println("Queue after Deletion");
        q.print();	
        System.out.println("---------------------");
        q.center();
        System.out.println("Top element of queue: "+q.peek());
        System.out.println("Size of queue"+q.size());
        System.out.println("---------------------");
        q.iterator(2);
        System.out.println("---------------------");
        System.out.println("Reverse of queue");
        q.reverse();
        q.print();
        System.out.println("----------------------");
	}

}
