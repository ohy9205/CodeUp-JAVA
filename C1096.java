import java.util.Scanner;

public class C1096 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] array = new int[19][19];
		int count = scan.nextInt();
		for(int i=0; i<count; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			array[x-1][y-1]=1;
		}
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}

}
