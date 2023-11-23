package pkg;
import java.util.Scanner;
int MAX=5
int arr[]=new int[MAX];
class Stack
{
	int top=-1;
	void push(int element)
	{
		if(top==MAX-1)
		{
			System.out.println("Stack overflow");
		}
		else
		{
			top++;
			arr[top]=element;
		}
		
	}
	
	int pop()
	{	
		int data;
		if(top==-1)
		{
			System.out.println("Stack underflow");
		}
		else
		{
			data=arr[top];
			top--;
		}
		return data;
	}
	
	void display()
	{
		for (int i=0;i<=top;i++)
		{	
			System.out.print(arr[i]);
		}
		System.out.println();
	}
	
}

class Package_48{
	public static void main(String args[])
	{	
		int element,c,x;	
		do{
			System.out.println("Enter your choice");
			System.out.println("1 to push");
			System.out.println("2 to pop");
			System.out.println("3 to exit");
			Scanner s=new Scanner(System.in);
			c=s.nextInt();
			switch(c)
			{
				case 1:
					push();
					display();
					break;
				case 2:
					x=pop();
					display();
					break;
				case 3:
					display();
					break;
				}
				
			
		}while(c!=3);
	}
}
		
		
		
		
		
		
		
