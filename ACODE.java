import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String x;
	while (!(x = sc.nextLine()).equals("0")) {
	    System.out.println(decod(x));
	}
    }

    private static BigInteger decod(String x) {
	BigInteger[] ac = new BigInteger[x.length() + 1];
	Arrays.fill(ac, BigInteger.ZERO);
	ac[0] = BigInteger.ONE;
	if (x.charAt(x.length() - 1) >= '1')
	    ac[1] = BigInteger.ONE;
	for (int i = 1; i < x.length(); i++) {
	    if (x.charAt(x.length() - 1 - i) >= '1')
		ac[i + 1] = ac[i + 1].add(ac[i]);
	    if (x.length() >= i + 1) {
		int sub2 = 10 * (x.charAt(x.length() - 1 - i) - '0') + x.charAt(x.length() - i) - '0';
		if (10 <= sub2 && sub2 <= 26) {
		    ac[i + 1] = ac[i + 1].add(ac[i - 1]);
		}
	    }
	}
	return ac[x.length()];
    }

}
