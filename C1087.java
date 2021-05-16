import java.util.Scanner;

public class C1087 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int sum = 0, i = 0;
		while(sum<num) {
			i++;
			sum+=i;
		}
		System.out.println(sum);
		scan.close();
	}

}
