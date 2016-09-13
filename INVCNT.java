import java.util.Arrays;
import java.util.Scanner;

public class INVCNT {

    public static class BIT {
	private int[] bit;

	public BIT(int n) {
	    bit = new int[n + 1];
	}

	private void update(int i, int val) {
	    i += 1;
	    while (i < bit.length) {
		bit[i] += val;
		i += i & -i;
	    }
	}

	private int getSum(int i) {
	    i += 1;
	    int sum = 0;
	    while (i > 0) {
		sum += bit[i];
		i -= i & -i;
	    }
	    return sum;
	}

    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int t = sc.nextInt();
	for (int i = 0; i < t; i++) {
	    int n = sc.nextInt();
	    Integer[] a = new Integer[n];
	    Integer[] ix = new Integer[n];
	    for (int j = 0; j < n; j++) {
		a[j] = sc.nextInt();
		ix[j] = j;
	    }
	    BIT b = new BIT(n);
	    Arrays.sort(ix, (n1, n2) -> Integer.compare(a[n1], a[n2]));
	    long ans = 0;
	    for (int j = n - 1; j >= 0; j--) {
		ans += b.getSum(ix[j] - 1);
		b.update(ix[j], 1);
	    }
	    System.out.println(ans);
	}
	sc.close();
    }
}
