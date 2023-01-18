package datastructure;


import java.util.Scanner;

class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    public LinkedList() {
        head = null;
    }

    
    public void AddFirst(int data) {
    	
        Node newNode = new Node(data);
        
        newNode.next = head;
        
        head = newNode;
    }

    public void addLast(int data ) {
    	Node newNode= new Node(data);
    	Node current= head;
    	while(current.next !=null) {
    		current=current.next;
    	}
    	
    	}
    
    
    public void addRandom(int data, int position) {
        Node newNode = new Node(data);
        Node current = head;
        for(int i = 1; i < position; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    
    

    
    public void delete(int position) {
        Node current = head;
        for(int i = 1; i < position-1; i++) {
            current = current.next;
        }
      //  current.next = current.next.next;
    }

    
    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String args[]) {
    	int choice=0;  
	    Scanner sc = new Scanner(System.in);  
	    LinkedList q1 = new LinkedList();  
	     
	    while(choice != 6)  
	    {  
	        System.out.println("Chose one from the below options");  
	        System.out.println("\n1.addFirst\n2.addLast\n3.addRandom\n4.Delete\n5.printList\n6.exit");  
	        System.out.println("\n Enter your choice \n");        
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            {   System.out.println("Enter data");
	            	int a=sc.nextInt();
	            
	                q1.AddFirst(a); 
	                System.out.println("Data enQueued");
	                
	                break;  
	              }
	            case 2:  
	            	
	            {  System.out.println("Enter the data");
	            	int b=sc.nextInt(); 
	                q1.addLast(b);;  
	                break;  
	          }  
	            case 3:  
	            	
	          { 
	        	  System.out.println("Enter data");
	        	  int c=sc.nextInt();
	        	  System.out.println("Enter Position");
	        	  int d= sc.nextInt();
	          
	                q1.addRandom(c, d);  
	                break;  
	            } 
	          
	            case 4:   
	                
	            { 
	            	System.out.println("Enter Position");
		        	  int e= sc.nextInt();
	                 q1.delete(e);  
	                 break;
	                 
	            }
                 case 5:   
	                
	            { 
	            	
	                 q1.printList();;  
	                 break;
	            }
	            
	            case 6:   
	           
	           {  
	                System.out.println("Exiting....");  
	                System.exit(0);  
	                break;   
	            }  
	            default:  
	            {  
	                System.out.println("Please Enter valid choice ");  
	            }   
	        };
    	 }
      }
  }
