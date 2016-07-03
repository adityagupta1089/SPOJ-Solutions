import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		for(int i=0;i<k;i++){
			int x=sc.nextInt();
			int y=sc.nextInt();
			if(x==y){
				System.out.println(2*y-y%2);
			}else if(x==y+2){
				System.out.println(2+2*y-y%2);
			}else {
				System.out.println("No Number");
			}
		}
	}
}
