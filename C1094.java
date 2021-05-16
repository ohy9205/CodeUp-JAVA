import java.util.Scanner;

public class C1094 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] a = new int[num];
		for(int i=0; i<num; i++) 
			a[i] = scan.nextInt();
		for(int i=num-1; i>=0; i--)
			System.out.printf("%d ",a[i]);
		scan.close();
	}

}
