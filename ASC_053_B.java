import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ASC_053_B {
	public static void main(String[] args) throws IOException {
		BufferedReader vf = new BufferedReader(new InputStreamReader(System.in));

		String aou = vf.readLine();

		int f = aou.indexOf("A");

		StringBuffer sb = new StringBuffer(vf.readLine());
		StringBuffer eou = sb.reverse();

		int e = eou.indexOf("Z");

		int o = aou.length() - f - e;

		System.out.println(o);

	}

}
