import java.util.Scanner;

public class C1083 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			if(i%3==0) {
				System.out.printf("X ");
				continue;
			}			
			System.out.printf("%d ",i);
		}
		scan.close();
	}

}
