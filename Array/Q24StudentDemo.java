package Array;

public class Q24StudentDemo {

	public static void main(String[] args) 
	{
		
		Q24Student[]a=new Q24Student[4];
		a[0]=new Q24Student(1,"Tushar",76);
		a[1]=new Q24Student(2,"Mayur",81);
		a[2]=new Q24Student(3,"Mohit",60);
		a[3]=new Q24Student(4,"Rupesh",68);
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i].marks>a[j].marks)
				{
					Q24Student temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
					
			}
		}
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]+" ");
		}
		
	}

}
