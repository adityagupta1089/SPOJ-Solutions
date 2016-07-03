import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n = 0;
	maxmap.put(0, 0L);
	while (sc.hasNext()) {
	    n = sc.nextInt();
	    System.out.println(max(n));
	}
    }

    static Map<Integer, Long> maxmap = new HashMap<>();

    private static long max(int n) {
	if (maxmap.containsKey(n))
	    return maxmap.get(n);
	else {
	    long val = Math.max(n, max(n / 2) + max(n / 3) + max(n / 4));
	    maxmap.put(n, val);
	    return val;
	}
    }
}
