package Array;

public class Queue 
{
	static int []a=new int[5];
	static int index=0;
	
	public static int pop()
	{
		if(index==0)
		{
			System.out.println("Queue is Empty");
			return 0;
		}
			
		else
		{
			int temp=a[0];
			for (int i = 1; i < a.length; i++) 
			{
				a[i-1]=a[i];
			}
			index--;
			return temp;
		}
	}
	public static void print()
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public static void push(int num)
	{
		if(index<a.length)
			a[index++]=num;
		else
			System.out.println("Queue is Full");
		
	}

	public static void main(String[] args)
	{
		push(55);
		push(40);
		push(29);
		push(30);
		System.out.println(pop());
		print();


	}

}
