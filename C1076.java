import java.util.Scanner;

public class C1076 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char x = scan.next().charAt(0);
		char t = 'a';
		do {
			System.out.println(t);
			t++;
		} while(t<x+1);
		scan.close();
	}

}
