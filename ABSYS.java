import java.util.Scanner;

class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int t = sc.nextInt();
	sc.nextLine();
	for (int i = 0; i < t; i++) {
	    sc.nextLine();
	    String x = sc.nextLine();
	    String[] n = x.split("\\+|\\=");
	    for (int j = 0; j < n.length; j++)
		n[j] = n[j].trim();
	    if (n[0].contains("machula"))
		n[0] = String.valueOf(Integer.parseInt(n[2]) - Integer.parseInt(n[1]));
	    else if (n[1].contains("machula"))
		n[1] = String.valueOf(Integer.parseInt(n[2]) - Integer.parseInt(n[0]));
	    else if (n[2].contains("machula"))
		n[2] = String.valueOf(Integer.parseInt(n[1]) + Integer.parseInt(n[0]));
	    System.out.println(n[0] + " + " + n[1] + " = " + n[2]);
	}
    }
}
