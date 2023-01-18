package datastructure;

import java.util.Scanner;  
class Stack   
{  
    int top;   
    int maxsize = 10;  
    int[] arr = new int[maxsize];  
      
      
    void isEmpty()  
    {  
        if (maxsize==-1) 
        {
		System.out.println("Stack is empty");	
		}
        else 
        {
		System.out.println("Stack is not empty");
		}
    }  
    Stack()  
    {  
        top = -1;  
    }  
    void push (Scanner sc)  
    {  
        if(top == maxsize-1)  
        {  
            System.out.println("Stack is Overflow ");  
             
        }  
        else   
        {  
            System.out.println("Enter the Value");  
            int val = sc.nextInt();  
            top++;  
            arr[top]=val;  
            System.out.println("Item pushed");  
              
        }  
    }  
    void pop ()  
    {  
        if (top == -1)  
        {  
            System.out.println(" Stack is Underflow");  
             
        }  
        else   
        {  
            top --;   
            System.out.println("Item popped");  
              
        }  
    }  
    void display ()  
    {  
        System.out.println("Printing stack elements .....");  
        for(int i = top; i>=0;i--)  
        {  
            System.out.println(arr[i]);  
        }  
    }
    public void peek() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            
        }
        else
        {
			System.out.println(arr[top]);
		}
    }
    
}  
public class StackImpl {  
public static void main(String[] args) {  
    int choice=0;  
    Scanner sc = new Scanner(System.in);  
    Stack s = new Stack();  
     
    while(choice != 7)  
    {  
        System.out.println("Chose one from the below options");  
        System.out.println("\n1.push\n2.Pop\n3.peek\n4.Display\n5.IsEmpty\n6.Exit");  
        System.out.println("\n Enter your choice \n");        
        choice = sc.nextInt();  
        switch(choice)  
        {  
            case 1:  
            {   
                s.push(sc);  
                break;  
              }
            case 2:  
            {  
                s.pop();  
                break;  
          }  
            case 3:  
          {  
                s.peek();  
                break;  
            } 
            case 4:   
                
            {  
                  
                 s.display();  
                 break;
                 
            }
             case 5:   
                
            {  
                
                s.isEmpty();  
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