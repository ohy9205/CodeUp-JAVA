import java.util.Scanner;

public class C1090 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long a = scan.nextLong(); // 시작수
		long r = scan.nextLong(); // 등비
		long n = scan.nextLong(); // 번째
		long result = a*(long)Math.pow(r, (n-1)); // 등비수열 공식
		System.out.println(result);
		scan.close();
	}

}
