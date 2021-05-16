import java.util.Scanner;
public class C1067 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%2==0) {
			if(num>0)
				System.out.println("plus");
			else
				System.out.println("minus");
			System.out.println("even");
		}
		else {
			if(num>0)
				System.out.println("plus");
			else
				System.out.println("minus");
			System.out.println("odd");
		}

	}

}
