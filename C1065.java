import java.util.Scanner;
public class C1065 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<3; i++) {
			int num = scan.nextInt();
			if(num %2 ==0)
				System.out.println(num);
		}

	}

}
