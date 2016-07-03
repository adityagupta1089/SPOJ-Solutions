import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	for (int i = 0; i < 10; i++) {
	    String x = sc.nextLine();
	    String y = sc.nextLine();
	    System.out.println(new BigInteger(x).add(new BigInteger(y)).divide(BigInteger.valueOf(2)));
	    System.out.println(new BigInteger(x).subtract(new BigInteger(y)).divide(BigInteger.valueOf(2)));
	}
    }
}
