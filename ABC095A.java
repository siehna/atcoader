import java.io.IOException;
import java.util.Scanner;

public class ABC_095_A {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ

		@SuppressWarnings("resource")
		Scanner vd = new Scanner(System.in);
		char[] cd = vd.next().toCharArray();
		int count = 0;
		for(int i: cd) {
			if(i=='o') count++;
		}
		System.out.println((700+count*100));


	}

}
