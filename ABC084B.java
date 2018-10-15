import java.util.Scanner;

public class ABC_084_B {
	public static void main(String[] args) {
		Scanner cd = new Scanner(System.in);
		int a = cd.nextInt();
		int b = cd.nextInt();
		String s = cd.next();
		if(s.matches("[0-9]{"+a+"}-[0-9]{"+b+"}")) {
			System.out.println("Yes");
		}else System.out.println("No");
	}

}
