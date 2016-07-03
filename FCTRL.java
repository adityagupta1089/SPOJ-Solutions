import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		for(int i=0;i<k;i++){
			int n=sc.nextInt();
			int x=5;
			int s=0;
			while(n>=x){
				s+=n/x;
				x*=5;
			}
			
		System.out.println(s);
		}
	}
}
