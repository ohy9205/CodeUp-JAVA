import java.util.Scanner;

public class C1093 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[100];
		int num = scan.nextInt();
		for(int i=0; i<num; i++) {
			a[scan.nextInt()-1]++;
		}
		for(int i=0; i<23; i++)
			System.out.printf("%d ",a[i]);
	}

}
