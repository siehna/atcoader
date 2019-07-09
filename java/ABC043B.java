import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_043_B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a =br.readLine();
		int k =0;
		while(a.charAt(k)=='B') {
			k++;
		}

		if(k<a.length()-1) {
			String c = a.substring(k);
			String[] d = c.split("");
			String z ="";
			for(int i=0; i<a.length();i++) {
				if(d[i]=="0") {
					z = z + "0";
				}else if(d[i]=="1") {
					z = z + "1";
				}else {
					z = z.substring(0,z.length()-1);
				}
			}
			System.out.println(z);
		}else {
			System.out.println("");
		}
	}

}
