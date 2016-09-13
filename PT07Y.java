import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class PT07Y {
    public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int m = sc.nextInt();
	Map<Integer, HashSet<Integer>> gph = new HashMap<>();
	for (int i = 0; i < m; i++) {
	    int u = sc.nextInt();
	    int v = sc.nextInt();
	    if (u == v) {
		System.out.println("NO");
		sc.close();
		return;
	    }
	    if (!gph.containsKey(u))
		gph.put(u, new HashSet<>());
	    if (!gph.containsKey(v))
		gph.put(v, new HashSet<>());
	    gph.get(u).add(v);
	    gph.get(v).add(u);
	}
	Stack<Integer> st = new Stack<>();
	st.push(1);
	boolean[] visited = new boolean[n + 1];
	int[] parent = new int[n + 1];
	while (!st.empty()) {
	    int x = st.pop();
	    visited[x] = true;
	    for (int c : gph.get(x))
		if (visited[c] && c != parent[x]) {
		    System.out.println("NO");
		    sc.close();
		    return;
		} else if (!visited[c]) {
		    parent[c] = x;
		    st.push(c);
		}
	}
	for (int i = 1; i < n; i++)
	    if (!visited[i]) {
		System.out.println("NO");
		sc.close();
		return;
	    }
	System.out.println("YES");
	sc.close();
    }
}
