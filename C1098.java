import java.util.Scanner;

public class C1098 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		int[][] array = new int[h][w];
		int num = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			int l = scan.nextInt();
			int d = scan.nextInt();
			int x = scan.nextInt();
			int y = scan.nextInt();
			for(int j=0; j<l; j++) {
				if(d==0) {
					array[x-1][y+j-1]++;
				}
				else
					array[x+j-1][y-1]++;
			}
		}
		for(int i=0; i<h; i++) {
			for(int j=0; j<w; j++)
				System.out.printf(array[i][j]+" ");
			System.out.println();
		}
	}

}
