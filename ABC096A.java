import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_096_A {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader cd = new BufferedReader(new InputStreamReader(System.in));
		String[] vd = cd.readLine().split(" ");
		int a = Integer.parseInt(vd[0]);
		int b = Integer.parseInt(vd[1]);

		if(a<=b)System.out.println(a);
		if(a>b)System.out.println(a-1);


	}

}
