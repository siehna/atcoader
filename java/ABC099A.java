import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_099_A {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		BufferedReader vd = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(vd.readLine());

		if(n>=1099&&n<1999) System.out.println("ABD");
		if(n>=1009&&n<1099) System.out.println("ABD");
		if(n>=1000&&n<1009) System.out.println("ABD");
		if(n>=100&&n<1000) System.out.println("ABC");
		if(n>=10&&n<100) System.out.println("ABC");
		if(n>=1&&n<10) System.out.println("ABC");

	}

}
