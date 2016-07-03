import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	double sum = 0;
	Map<Integer, Integer> sums = new HashMap<>();
	for (int i = 2, j = 1; j <= 520; i++) {
	    sum += 1 / (double) i;
	    while (100 * sum >= j) {
		sums.put(j, i);
		j++;
	    }
	}
	double x = 0;
	while ((x = sc.nextDouble()) != 0) {
	    System.out.println((sums.get((int) (100 * x)) - 1) + " card(s)");
	}
    }
}
