package Array;

public class Q27Hw {

	public static void main(String[] args) 
	{
		int [][]a={{6,3,1},
					{9,7,8},
					{2,4,5}};
		int index=0;
		for (int i = 0; i < a.length; i++) 
		{	
			for (int j = 0; j < a[i].length; j++) 
			{
				int smallerInRow=0;
				for (int k = 0; k < a[i].length; k++) 
				{
					if(a[i][j]>a[i][k])
						smallerInRow++;
				}
				int largeInCol=0;
				for (int l =0 ; l < a.length; l++) 
				{
					if(a[i][j]<a[l][j])
						largeInCol++;
				}
				if( smallerInRow==0 && largeInCol==0)
				{
					System.out.println(a[i][j]);
					index++;
				}
			}
		}
		if(index==0)
			System.out.println("not");
	}

}
