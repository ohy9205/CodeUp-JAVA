import java.util.Scanner;

public class C1095 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] array = new int[n];
		
		for(int i=0; i<n; i++)
			array[i] = scan.nextInt();
		
		int min=array[0];
		
		for(int j=1; j<n; j++) {
			if(min>=array[j])
				min=array[j];
		}
		
		System.out.println(min);
	}

}
