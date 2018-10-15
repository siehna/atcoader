import java.util.Scanner;

public class ABC_102_A {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

Scanner vd = new Scanner(System.in);

		int n = vd.nextInt();
		vd.close();
		if(n%2==1) System.out.println(2*n);
		else System.out.println(n);


	}

}
