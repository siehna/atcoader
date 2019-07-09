import java.io.IOException;

public class ABC_058_B {
	public static void main(String[] args) throws IOException {
		//BufferedReader oi = new BufferedReader(new InputStreamReader(System.in));
		String[] odd = {"A","B"};//oi.readLine().split("");
		String[] even = {"C","D"};//oi.readLine().split("");

		int od = odd.length;
		int ev = even.length;
		String a ="";
		if(od==ev) {
			for(int i=0; i < od; i++) {
				a = a + odd[i] + even[i];

				System.out.println(a);
			}
		}else {
			a = odd[0];
			for(int i=1; i < od; i++) {
				a = a + even[i-1] + odd[i];
		}
		System.out.println(a);
		}
	}
}
