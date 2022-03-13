package PatternRecursive;

public class Q24 {

	public static void main(String[] args) 
	{
		int i=0;
		loopI(i);
	}

	private static void loopI(int i)
	{
		if(i<=8)
		{
			int j=0;
			loopJ(i,j);
			System.out.println();
			loopI(i+1);
		}
	}

	private static void loopJ(int i, int j) 
	{
		if(j<=8)
		{
			if((j+i>=4 && j-i>=-4) &&(j+i<=8 || j-i<=0))
				System.out.print("*");
			else
				System.out.print(" ");
			loopJ(i, j+1);
		}
	}

}
