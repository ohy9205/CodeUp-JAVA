// 자바에는 goto문이 없다
import java.util.Scanner;
public class C1071 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		while(true) {
			num = scan.nextInt();
			if(num==0)
				break;
			System.out.println(num);
		}
	}
}
