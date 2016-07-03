import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
	Scanner sc = new Scanner(System.in);
	int k = sc.nextInt();
	sc.nextLine();
	Stack<String> exp = new Stack<>();
	Stack<Character> op = new Stack<>();
	for (int i = 0; i < k; i++) {
	    String x = sc.nextLine();
	    String rpn = "";
	    char[] c = x.toCharArray();
	    for (char ch : c) {
		if ('a' <= ch && ch <= 'z') {
		    exp.push(ch + "");
		} else if (ch == '*' || ch == '/' || ch == '+' || ch == '-' || ch == '^') {
		    op.push(ch);
		} else if (ch == ')') {
		    String b = exp.pop();
		    String a = exp.pop();
		    rpn = a + "" + b + "" + op.pop();
		    exp.push(rpn);
		}
	    }
	    System.out.println(rpn);
	}
    }
}
