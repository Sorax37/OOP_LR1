import java.util.Scanner;

public class Palindrome
{
	public static void main(String[] args)
	{
		String s = "";
		for (int i = 0; i < args.length; i++)
		{
 			s = args[i];
 		}
		if (isPalindrome(s) == true) System.out.println("This word is a palindrome");
		else System.out.println("This word isn't a palindrome");
	}

	public static String reverseString(String MyWord)//Функция, которая заменяет символы строки в обратном порядке
	{
		String result = "";
		for (int i = MyWord.length() - 1; i >= 0; --i)
		{
			result += MyWord.charAt(i);
		}
		return result;
	}

	public static boolean isPalindrome(String s)//Функция проверки совпадения исходной строки с ее обратной версией
	{
		String RevStr = reverseString(s);
		if (s.equals(RevStr)) return true;
		else return false;
	}
}