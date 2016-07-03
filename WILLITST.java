import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long n = sc.nextLong();
	if (n <= 1)
	    System.out.println("TAK");
	else {
	    if ((n & (n - 1)) == 0)
		System.out.println("TAK");
	    else
		System.out.println("NIE");
	}
    }
}
