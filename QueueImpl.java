package datastructure;

import java.util.Scanner;

class Queue
{
	int queue[]=new int [5];
	int size;
	int front;
	int rear;
	public void enqueue(int data)
	{
		if(rear==queue.length-1)
		{
			System.out.println("Queue is Full");
		}
		else 
		{
			queue[rear]=data;
			rear=(rear+1)%5;
			size++;
		}
		
	}
	public void show()
	{System.out.print("elements: ");
		for (int i = 0; i < size; i++)
		{
			System.out.print(queue[(front+ i)]+" ");
		}
		System.out.println();
	}
	
	public void deQueue() 
	{ 
		if(front==-1 && rear==-1)
		{
			System.out.println("Queue is Empty"); 
		}
		else 
		{
			int data= queue[front];
			front=(front+1)%5;
			size--;
		}	
	}
	
	public int getsize() {
		
		return size;
		
	}
}
class QueueImpl 
{
	public static void main(String args[])
	{
		int choice=0;  
	    Scanner sc = new Scanner(System.in);  
	    Queue q1 = new Queue();  
	     
	    while(choice != 6)  
	    {  
	        System.out.println("Chose one from the below options");  
	        System.out.println("\n1.enQueue\n2.deQueue\n3.show\n4.getsize\n5.exit");  
	        System.out.println("\n Enter your choice \n");        
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            {   System.out.println("Enter data");
	            	int a=sc.nextInt();
	            
	                q1.enqueue(a); 
	                System.out.println("Data enQueued");
	                
	                break;  
	              }
	            case 2:  
	            {  
	                q1.deQueue();;  
	                break;  
	          }  
	            case 3:  
	          {  
	                q1.show();  
	                break;  
	            } 
	          
	            case 4:   
	                
	            {  
	                 q1.getsize();  
	                 break;
	                 
	            }
	            case 5:   
	           
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

