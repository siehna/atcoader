import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ABC_092_B {
	public static void main(String[] argas) throws IOException{

		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int day = Integer.parseInt(br.readLine().split(" ")[0]);
		int rest = Integer.parseInt(br.readLine().split(" ")[1]);
*/
		int n =3;
		int day = 7;
		int rest = 1;
		int[] a = new int[n];
		//for(int i=0; i<n; i++) {
			//a[i]= Integer.parseInt(br.readLine());
		//}
		a= {2,5,10};

		int counter=0;
		for(int i=0; i<n;i++) {
			int choko =(day-1)/a[i] + 1;
			counter = counter +choko;
		}
		System.out.println((counter+rest));
	}


}
