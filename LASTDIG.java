import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int i = 0; i < t; i++) {
	    int a = sc.nextInt();
	    int b = sc.nextInt();
	    int c = a % 10;
	    if (c == 2 || c == 3 || c == 7 || c == 8) {
		System.out.println((int) Math.pow(c, 1 + (b - 1) % 4) % 10);
	    } else if (c == 4 || c == 9) {
		System.out.println((int) Math.pow(c, 1 + (b - 1) % 2) % 10);
	    } else if (c == 0 || c == 1 || c == 5 || c == 6) {
		System.out.println((b != 0) ? c : 1);
	    }
	}
    }
}
