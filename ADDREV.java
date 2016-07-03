import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<k;i++){
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println(rev(rev(a)+rev(b)));
		}
	}
	
	private static int rev(int x){
		int y=0;
		do{
			y*=10;
			y+=x%10;
			x/=10;
		}while(x!=0);
		return y;
	}
}
