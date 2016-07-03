import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			int m = sc.nextInt();
			int n = sc.nextInt();
			for (int j = (m > 2) ? m : 2; j <= n; j += (j % 2 == 0) ? 1 : 2) {
				if (j == 2) {
					System.out.println(2);
				} else if (isPrime(j)) {
					System.out.println(j);
				}
			}
			System.out.println();
		}
		sc.close();
	}

	private static boolean isPrime(int j) {
		for (int i = 3; i * i <= j; i += 2) {
			if (j % i == 0) {
				return false;
			}
		}
		return true;
	}
}
