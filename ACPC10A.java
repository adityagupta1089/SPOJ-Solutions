import java.util.Scanner;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	int a = 0, b = 0, c = 0;
	do {
	    a = sc.nextInt();
	    b = sc.nextInt();
	    c = sc.nextInt();
	    if (a == 0 && b == 0 && c == 0)
		break;
	    System.out.println(((2 * b == a + c) ? ("AP " + (c + b - a)) : ("GP " + (c * b / a))));
	} while (true);
    }
}
