import java.util.Scanner;

public class C1086 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long w = scan.nextLong();
		long h = scan.nextLong();
		long b = scan.nextLong();
		float result = (float)(w*h*b)/8/1024/1024;
		System.out.printf("%.2f MB",result);
		scan.close();
	}

}
