import java.util.Scanner;

public class ABC_103_B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner vd = new Scanner(System.in);
		String cd = vd.nextLine();
		String vf = vd.nextLine();
		vd.close();
		String ans = "";
		for(int i=0; i<cd.length(); i++) {
			if(cd==vf) ans="Yes";
			String rf = vf.substring(0, i);
			String ef = vf.substring(i);
			vf = ef + rf;
			if(cd==vf) ans="Yes";
		}
		if(ans=="") ans = "No";
		System.out.println(ans);
	}

}
