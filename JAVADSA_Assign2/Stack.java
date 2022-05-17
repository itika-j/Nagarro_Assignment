import java.util.*;

public class Stack {
	
	static node top=null;
	class node{
		int data;
		node next;
			
	}
	
	public void push(int x)
    {
        node temp = new node();
        temp.data = x;
        temp.next = top;
        top = temp;
    }
 
    public boolean isEmpty()
    {
        return top == null;
    }
 
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
 
    public void pop()
    {
        if (top == null) {
            System.out.println("\nStack Underflow");
            return;
        }
        top = top.next;
    }
    
    public void getMiddle() {
    	node slow=top;
    	node fast=top;
    	while(fast!=null && fast.next!=null) {
    		slow=slow.next;
    		fast=fast.next.next;
    	}
    	System.out.println("Middle element is: "+slow.data);
    	
    }
 
    public void display(){
    	
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }
        else {
            node temp = top;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    
    public static void size(){
    	int cnt=0;
        if (top == null) {
            System.out.println("Stack empty");
            return;
        }
        else {
            node temp = top;
            while (temp != null) {
            	cnt++;
                temp = temp.next;
            }
            System.out.println("Size is: "+cnt);
        }
    }
    
    public void reverse() {
    	if(top==null || top.next==null) {
    		return;
    	}
    	node prev=top;
    	node currnode=top.next;
    	while(currnode != null) {
    		node nxtnode=currnode.next;
    		currnode.next=prev;
    		prev=currnode;
    		currnode=nxtnode;
    	}
    	top.next=null;
    	top=prev;    	
    }
    
    public void sort() {
    	node curr=top;
    	node idx=null;
    	int temp;
    	if (isEmpty()) {
    		System.out.println("Stack underflow");
    		return;
    	}
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
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st=new Stack();
		st.push(4);
		st.push(5);
		st.push(2);
		st.push(6);
		st.push(7);
		System.out.print("Stack element are: ");
		st.display();
		
		System.out.println("Top element is: "+ st.peek());
		st.size();
		st.getMiddle();
		System.out.print("Sorting elements are: ");
		st.sort();
		st.display();
        st.pop();
        st.pop();
        System.out.print("After popping: ");
        st.display();
        System.out.println("Top element is: "+ st.peek());
        System.out.print("Reversed elements are: ");
        st.reverse();
        st.display();
		
    }

	}


