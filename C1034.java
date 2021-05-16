import java.util.Scanner;
public class C1034 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		int numChange = Integer.valueOf(num, 8);
		System.out.println(numChange);
		scan.close();
	}

}
