import java.util.*;
import java.lang.*;
import java.math.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<k;i++){
			int n = sc.nextInt();
			BigInteger f = BigInteger.ONE;
			for(int j=2;j<=n;j++)f=f.multiply(BigInteger.valueOf(j));
			System.out.println(f.toString());
		}
	}
}
