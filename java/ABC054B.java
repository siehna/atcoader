import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ABC_054_B {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] s = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);

		int[][] N = new int[n][n];
		int[][] M = new int[m][m];
		for(int i=0; i<n; i++) {
			String[] t = br.readLine().split(" ");
			for(int j=0; j<n; j++) {
				int k = Integer.parseInt(t[j]);
				N[i][j] = k;
			}
		}
		for(int i=0; i<m; i++) {
			String[] t = br.readLine().split(" ");
			for(int j=0; j<m; j++) {
				int k = Integer.parseInt(t[j]);
				M[i][j] = k;
			}
		}
		
		
	}
}
