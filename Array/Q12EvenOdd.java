package Array;
   	// Write a program to put even and odd elements of array in two separate arrays
public class Q12EvenOdd {
	public static void main(String[] args) 
	{
		int []a={45,89,258,22,357,55,512,5,8,3,545};
		int count=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2==0)
				count++;
		}
		int[] evenArray =new int[count];
		int []oddArray=new int[a.length-count];
		int evenCount=0;
		int oddCount=0;
		for (int i = 0; i < a.length; i++)
		{
			if(a[i]%2==0)
				evenArray[evenCount++]=a[i];
			else
				oddArray[oddCount++]=a[i];
		}
		
		System.out.println("Even No");
		for (int i = 0; i < evenArray.length; i++) 
		{
			System.out.print(evenArray[i]+" ");
		}
		System.out.println();
		
		System.out.println("Odd Array");
		for (int i = 0; i < oddArray.length; i++)
		{
			System.out.print(oddArray[i]+" ");
		}
	}
}
