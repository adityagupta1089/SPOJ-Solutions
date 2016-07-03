import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	int c = 0;
	while ((c = sc.nextInt()) != 0) {
	    sc.nextLine();
	    String x = sc.nextLine();
	    int r = x.length() / c;
	    char[][] mat = new char[r][c];
	    String y = "";
	    for (int i = 0; i < r; i++) {
		for (int j = 0; j < c; j++) {
		    if (i % 2 == 0)
			mat[i][j] = x.charAt(i * c  + j);
		    else
			mat[i][c - 1 - j] = x.charAt(i * c + j);
		}
	    }
	    for (int i = 0; i < c; i++) {
		for (int j = 0; j < r; j++) {
		    y += mat[j][i];
		}
	    }
	    System.out.println(y);
	}
    }
}
