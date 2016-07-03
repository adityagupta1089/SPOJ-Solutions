import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	int k = 0;
	while ((k = sc.nextInt()) != -1) {
	    int[] a = new int[k];
	    int sum = 0;
	    for (int i = 0; i < k; i++) {
		a[i] = sc.nextInt();
		sum += a[i];
	    }
	    if (sum % k != 0) {
		System.out.println("-1");
	    } else {
		int avg = sum / k;
		int delta = 0;
		for (int x : a) {
		    delta += Math.abs(avg - x);
		}
		System.out.println(delta / 2);
	    }
	}
    }
}
