import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	for (int i = 0; i < t; i++) {
	    int s = sc.nextInt();
	    int f = sc.nextInt();
	    int[] sf = new int[f];
	    int j = 0;
	    for (j = 0; j < f; j++) {
		sf[j] = sc.nextInt();
	    }
	    System.out.println("Scenario #" + (i + 1) + ":");
	    Arrays.sort(sf);
	    for (j = f - 1; j >= 0 && s > 0; j--) {
		s -= sf[j];
	    }
	    if (s <= 0)
		System.out.println(f - 1 - j);
	    else
		System.out.println("impossible");
	    System.out.println();
	}
    }
}
