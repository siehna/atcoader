import java.io.IOException;

public class ABC_073_B {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		//Scanner ok =new Scanner(System.in);
		int n = 1;//ok.nextInt();
		int sum=0;

		for(int i=0;i<n;i++) {

			int k = 10;//ok.nextInt();
			int r = 1000;//ok.nextInt();
			sum=sum-k+r+1;
		}
		System.out.println(sum);
	}

}
