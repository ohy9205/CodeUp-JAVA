import java.util.Scanner;
public class C1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			System.out.println("\'"+ch+"\'");
		}
	}
}
