package PatternRecursive;

public class Q28 {

	public static void main(String[] args)
	{
		loopI(0);
	}
	private static void loopI(int i) 
	{
		if(i<=8)
		{
			int counter=0;
			loopJ(i,0,counter);
			System.out.println();
			loopI(i+1);
		}
	}
	private static void loopJ(int i, int j, int counter)
	{
		if(j<=4)
		{
			if(j-i<=0 && j+i<=8)
				System.out.print((char)(65+counter++));
			loopJ(i, j+1, counter);
		}
	}

}
