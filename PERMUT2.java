import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 0;
	while ((n = sc.nextInt()) != 0) {
	    int[] p = new int[n];
	    for (int j = 0; j < n; j++)
		p[j] = sc.nextInt();
	    boolean ambi = true;
	    for (int j = 0; j < n; j++)
		if (j + 1 != p[p[j] - 1]) {
		    ambi = false;
		    break;
		}
	    System.out.println((ambi) ? "ambiguous" : "not ambiguous");
	}
    }
}
