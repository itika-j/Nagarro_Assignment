import java.util.*;

public class LinkedList {
	node head;
	class node{
		int data;
		node next;
		node(int x){
			data=x;
			next=null;
		}
	}
	
	public void push(int new_data) {
		node new_node=new node(new_data);
		new_node.next=head;
		head=new_node;	
	}
	
	public void push_at(int pos, int new_data) {
		  node new_node = new node(new_data); 

		  if(pos < 1) {
		    System.out.println("position should be >= 1.");
		  } else if (pos == 1) {
		  
			  new_node.next = head;
		      head = new_node;
		  } else {

		    node temp = head;
		    for(int i = 1; i < pos-1; i++) {
		      if(temp != null) {
		        temp = temp.next;
		      }
		    }
		    
		    if(temp != null) {
		      new_node.next = temp.next;
		      temp.next = new_node;  
		    } else {
		      
		      System.out.println("The previous node is null.");
		    } 
		  }
		
	}
	
	public void deleteKey(int key)
    {
        
        node temp = head, prev = null;
 
        if (temp == null)
            return;
        
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        } 
        // Unlink the node from linked list
        prev.next = temp.next;
    }
	
	public void deletePos(int pos)
    {
 
		node temp = head;
        
		if (head == null)
        	return;
		else if (temp==null || temp.next==null)
            return;
 
		if (pos == 0) {
            head = temp.next;
            return;
        }
 
        for (int i = 0; temp != null && i<pos-1; i++)
            temp = temp.next;      
 
        node next = temp.next.next;
        temp.next=next;
    }
	
	node middle(node head) {
		node slow=head;
		node fast=head;
		while(fast != null && fast.next != null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	
	public void getLength() {
		node temp=head;
		int cnt=0;
		while(temp != null) {
			cnt++;
			temp=temp.next;
		}
		System.out.println("Length of LL is: "+cnt);
	}
	
	public void reverse() {
		node current=head;
		node next=null;
		node prev=null;
		while(current != null) {
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;			
		}
		head=prev;
		
	}
	
	public void print(node temp) {
		
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void iterator(int idx)
    {
        node temp = head;
        int cnt = 0; 
        while (temp != null)
        {
            if (cnt == idx)
            	System.out.println("Element at position "+idx+" is: "+temp.data);
            cnt++;
            temp = temp.next;
        }
    }
	
	public void sort() {
    	node curr=head;
    	node idx=null;
    	int temp;
    	while(curr!=null) {
    		idx=curr.next;
    		while(idx!=null) {
    			if(curr.data>idx.data) {
    				temp=curr.data;
    				curr.data=idx.data;
    				idx.data=temp;
    			}
    			idx=idx.next;
    		}
    		curr=curr.next;
    	}
    	System.out.println("Sorted Linked List is: ");
    }	

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		LinkedList ls=new LinkedList();
		ls.push(4);
		ls.push(8);
		ls.push(9);
		ls.push(5);
		ls.push_at(1, 97);
		System.out.println("Printed ls are: ");
		ls.print(ls.head);
			
		ls.getLength();
		System.out.println("middle elent is: "+ls.middle(ls.head).data);
		
		ls.iterator(3);
		ls.reverse();
		ls.print(ls.head);
		ls.sort();
		ls.print(ls.head);
		
	}
}
