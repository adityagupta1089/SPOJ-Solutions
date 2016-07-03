import java.util.*;
import java.lang.*;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n=0;
		while((n=sc.nextInt())!=0){
			System.out.println(n*(n+1)*(2*n+1)/6);
		}
	}
}
