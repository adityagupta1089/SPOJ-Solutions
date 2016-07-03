import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int i = 0; i < t; i++) {
	    int x = sc.nextInt();
	    int r = (int) Math.ceil((-1 + Math.sqrt(1 + 8 * x)) / 2);
	    int d = x - r * (r - 1) / 2;
	    if (r % 2 == 0)
		System.out.println("TERM " + x + " IS " + d + "/" + (r + 1 - d));
	    else
		System.out.println("TERM " + x + " IS " + (r + 1 - d) + "/" + d);
	}
    }
}
