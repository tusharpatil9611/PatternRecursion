package PatternRecursive;

public class Q29 {

	public static void main(String[] args) 
	{
		loopI(0);
	}

	private static void loopI(int i) 
	{
		if(i<=11)
		{
			loopJ(i,0);
			System.out.println();
			loopI(i+1);
		}
	}

	private static void loopJ(int i, int j)
	{
		if(j<=5)
		{
			if(j+i<=5 || j-i<=-6)
				System.out.print((char)(65+j));
				loopJ(i, j+1);
		}
	}

}
