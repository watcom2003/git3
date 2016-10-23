import java.util.StringTokenizer;

public class StringMan1 {

	public static void main(String[] args) {
		String str = "I have a cat, rat and a pen, aha aha !!!!";
		StringTokenizer stk = new StringTokenizer(str, ", !");
		while (stk.hasMoreTokens())
		System.out.println(stk.nextToken());

	}

}
