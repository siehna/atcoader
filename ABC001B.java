import java.util.Scanner;

public class ABC_001_B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		@SuppressWarnings("resource")
		Scanner cd = new Scanner(System.in);
		int m = cd.nextInt();

		double num = (double)m/1000;
		if(num<0.1) {
			System.out.println("00");
		}else if(num<1&&num>=0.1) {
			System.out.println("0"+(int)(num*10));
		}else if(num<=5&&num>=1) {
			System.out.println((int)(num*10));
		}else if(num<=30&&num>=6) {
			System.out.println(50+(int)num);
		}else if(num<=70&&num>=35) {
			System.out.println(((int)(num)-30)/5+80);
		}else if(num>70)System.out.println(89);

	}

}
