import java.util.Scanner;

public class C1092 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		long day=1;
		while(day%a!=0 || day%b!=0 || day%c!=0)
			day++;
		System.out.println(day);
		}
}
