import java.util.Scanner;

public class C1091 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong(); // 시작수
		int m = scan.nextInt(); // 곱할값
		int d = scan.nextInt(); // 더할값
		int n = scan.nextInt(); // 번째
		long result = a*m+d;
		if(n==1)
			System.out.println(a);
		else {
			for(int i=2; i<n; i++) {
				result = result*m+d;
			}
		}
		System.out.println(result);
		scan.close();
	}

}
