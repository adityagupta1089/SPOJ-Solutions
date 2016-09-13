import java.util.Scanner;

public class GIRLSNBS {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int g, b;
	while ((g = sc.nextInt()) != -1 && (b = sc.nextInt()) != -1) {
	    int min = Math.min(g, b);
	    int max = Math.max(g, b);
	    System.out.println((int)Math.ceil(max / (double) (1+min)));
	}
	sc.close();
    }
}
