import java.util.*;

class Reverse
{
	public static void main(String args[])
	{
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		num=sc.nextInt();
		int rem,div;
		div=num;
		do{
		rem=div%10;
		System.out.println(rem);
		div=div/10;
		}while(div>0);
	}
}