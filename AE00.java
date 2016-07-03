import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int v = 0;
	for (int i = 1; i <= n; i++) {
	    for (int j = 1; j * j <= i; j++) {
		if (i % j == 0) {
		    v++;
		}
	    }
	}
	System.out.println(v);
    }
}
