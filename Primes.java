import java.util.Scanner;

public class Primes
{
	public static void main(String[] args)
	{
		int s = 2;
		for (int i = 0; i < args.length; i++)
		{
 			s = Integer.parseInt(args[i]);
 		}
		for (int i = 2; i <= s; i++)
		{
			if (isPrime(i) == true) System.out.println(i);
		}
	}

	public static boolean isPrime(int n)//Метод определения того, является ли число простым
	{
		boolean check = true;
			for (int i = 2; i < n; i++)
			{
				if (n % i == 0)
				{
					check = false;
					break;
				}
			}
			if (check) return true;
			else return false;
	}
}