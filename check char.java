mport java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		char ch;
		Scanner sc = new Scanner(System.in);
		ch = sc.next().charAt(0);
		if(ch >= 65 && ch <= 90)
			System.out.print(“Upper”);
		else if(ch >= 97 && ch <= 122)
			System.out.print(“Lower”);
		else if(ch >= 48 && ch <= 57)
			System.out.print(“Number”);
		else
			System.out.print(“Symbol”);
	}
}
