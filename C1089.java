import java.util.Scanner;

public class C1089 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); // 시작수
		int d = scan.nextInt(); // 등차
		int n = scan.nextInt(); // 번째
		int result = a+(n-1)*d; // 등차수열 공식
		System.out.println(result);
		scan.close();
	}

}
