package PatternRecursive;

public class Q18Bk {

	public static void main(String[] args)
	{
		loopI(0);
	}

	private static void loopI(int i) 
	{
		if(i<=8)
		{
			loopJ(i,0);
			System.out.println();
			loopI(i+1);
		}
	}

	private static void loopJ(int i, int j) 
	{
		if(j<=4)
		{
			if(j-i>=-4 && j+i>=4 )
				System.out.print("* ");
			else
				System.out.print(" ");
			loopJ(i, j+1);
		}
	}

}
