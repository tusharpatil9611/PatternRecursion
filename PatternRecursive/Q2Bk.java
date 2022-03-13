package PatternRecursive;

public class Q2Bk {

	public static void main(String[] args) 
	{
		loopI(0);
	}

	private static void loopI(int i) 
	{
		if(i<=4)
		{	
			loopJ(0,i);
			System.out.println();
			loopI(i+1);
		}
	}

	private static void loopJ(int j, int i)
	{
		if(j<=4)
		{
			if(j+i<=4)
				System.out.print("*");
			loopJ(j+1, i);
		}
	}
	
}
