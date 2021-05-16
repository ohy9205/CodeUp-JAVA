import java.util.Scanner;
public class C1023 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		String str[] = num.split("[.]");
		System.out.println(str[0]);
		System.out.println(str[1]);
	}

}
