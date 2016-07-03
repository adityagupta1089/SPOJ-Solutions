import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	sc.nextLine();
	for (int i = 0; i < t; i++) {
	    String x = sc.nextLine();
	    if (x.length() == 1) {
		System.out.println("11");
		continue;
	    }
	    char[] y = x.toCharArray();
	    int j = y.length / 2 - 1, k = j + 1 + y.length % 2;
	    while (j > 0 && y[j] == y[k]) {
		j--;
		k++;
	    }
	    if (y[j] <= y[k]) {
		while (j + 1 < k) {
		    j++;
		    k--;
		}
		int c = 1;
		while (j >= 0) {
		    int s = y[j] - '0' + c;
		    char r = (char) (s % 10 + '0');
		    y[k++] = r;
		    y[j--] = r;
		    c = s / 10;
		}
		if (c == 1) {
		    System.out.print("1");
		    y[y.length - 1] = '1';
		}
		System.out.println(y);
		continue;
	    }
	    if (y[j] > y[k]) {
		for (; j >= 0 && k < y.length && j <= k; j--, k++)
		    y[k] = y[j];
		System.out.println(y);
		continue;
	    }

	}
    }
}
