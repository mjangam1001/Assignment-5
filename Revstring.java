import java.util.*;

class Revstring
{
	public static void main(String args[])
	{
		String word;
		int count=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word:");
		word=sc.next();
		count=word.length();
		for(int i=(count-1);i>=0;i--)
		System.out.print(word.charAt(i));
	}
}

/* output
Enter a word:
word
drow

*/