package Array;

public class Stack {
	static int []a=new int[5];
	static int index=0;
	public static int pop()
	{
		if(index==0)
		{
			System.out.println("Stack is Empty ");
			return 0;
		}
		else
		{
			index--;
			return a[index];
		}	
	}
	public static void print()
	{
		for (int i =0; i<index; i++) 
		{
			System.out.println(a[i]+" ");
		}
	}
	public static void push(int num)
	{
		if(index<a.length)
		{
			a[index++]=num;
			
		}
		else
			System.out.println("Stack is full");
	}
	
	public static void main(String[] args) 
	{
		push(78);
		push(10);
		push(50);push(50);push(50);push(50);push(50);
		System.out.println(pop());
		print();
	}

}
