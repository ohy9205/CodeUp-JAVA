import java.util.Scanner;
public class C1025 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=10000; i>0; i=i/10) {
			System.out.println("["+((num/i)*i)+"]");
			num = num%i;
		}
	}
}
