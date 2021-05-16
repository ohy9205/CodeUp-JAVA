import java.util.Scanner;
public class C1046 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<3; i++) {
			int num = scan.nextInt();
			sum += num;
		}
		System.out.println(sum);
		System.out.printf("%.1f",(float)sum/3);
		scan.close();
	}

}