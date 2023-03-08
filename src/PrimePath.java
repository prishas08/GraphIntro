import java.util.ArrayList;

public class PrimePath {
	
	private int begin;
	private int end;
	private ArrayList<Integer> allPrimes;
	
	public PrimePath(int b, int e)
	{
		begin = b;
		end = e;
		allPrimes = getAllPrime();
		
	}
	
	public ArrayList<Integer> getAllPrime()
	{
		ArrayList<Integer> primes = new ArrayList<>();
		boolean isPrime = true;
		int counter = 0;
		for(int i = 0; i < 10000; i++)
		{
			for(int x = 0; x < 100; x++)
			{
				if(i%x==0)
				{
					isPrime = false;
				}
			}
			if(isPrime==true)
			{
				primes.add(counter,i);
				counter++;
			}
			isPrime=true;
		}
		return primes;
		
	}

}
