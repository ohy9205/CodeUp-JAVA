import java.util.Scanner;

public class C1079 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char chr;
		while(true) {
			chr = scan.next().charAt(0);
			System.out.println(chr);
			if(chr == 'q')
				break;
		}
		scan.close();

	}

}
