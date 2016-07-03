import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int i = 0; i < t; i++) {
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    int[] b = new int[n];
	    for (int j = 0; j < n; j++)
		a[j] = sc.nextInt();
	    for (int j = 0; j < n; j++)
		b[j] = sc.nextInt();
	    Arrays.sort(a);
	    Arrays.sort(b);
	    int sum = 0;
	    for (int j = 0; j < n; j++) {
		sum += a[j] * b[j];
	    }
	    System.out.println(sum);
	}
    }
}
