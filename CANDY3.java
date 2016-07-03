import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int i = 0; i < t; i++) {
	    sc.nextLine();
	    sc.nextLine();
	    int n = sc.nextInt();
	    int sum = 0;
	    for (int j = 0; j < n; j++) {
		sum += sc.nextLong() % n;
		sum %= n;
	    }
	    System.out.println((sum == 0) ? "YES" : "NO");
	}
    }
}
