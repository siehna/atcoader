import java.util.Scanner;

public class ABC_037_B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner vd = new Scanner(System.in);
		int a = vd.nextInt();
		int b = vd.nextInt();
		int c = vd.nextInt();
		int d = vd.nextInt();
		vd.close();
		if(a==c||a==d||b==c||b==d)System.out.println("YES");
		else System.out.println("NO");

	}

}
