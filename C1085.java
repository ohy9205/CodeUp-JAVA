import java.util.Scanner;

public class C1085 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long h = scan.nextLong();
		long b = scan.nextLong();
		long c = scan.nextLong();
		long s = scan.nextLong();
		float result = (float)(h*b*c*s)/8/1024/1024;
		System.out.printf("%.1f MB",result);
		scan.close();
	}

}
