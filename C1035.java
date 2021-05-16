import java.util.Scanner;
public class C1035 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		int numChange = Integer.valueOf(num, 16);
		System.out.printf("%o",numChange);
		scan.close();
	}

}
