import java.util.Scanner;
public class C1056 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num1 = scan.nextInt();
	int num2 = scan.nextInt();
	if((num1==1&&num2==0) || (num1==0&&num2==1))
		System.out.println(1);
	else
		System.out.println(0);
	}

}
