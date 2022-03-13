package PatternRecursive;

public class Q74 {

	public static void main(String[] args)
	{
		loopI(0);
	}

	private static void loopI(int i) 
	{
		if(i<=4)
		{
			int count=0;
			loopJ(count,i,0);
			System.out.println();
			loopI(i+1);
		}
	}

	private static void loopJ(int count, int i, int j) 
	{
		if(j<=8)
		{
			if(j+i>=4 && j-i<=4)
			{
				if(j<4)
					System.out.print((char)(65+count++));
				else
					System.out.print((char)(65+count--));
			}
			else
				System.out.print(" ");
			loopJ(count, i, j+1);
		}
	}

}
