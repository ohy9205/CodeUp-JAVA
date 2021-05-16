import java.util.Scanner;

public class C1097 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] array = new int[19][19];
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				array[i][j] = scan.nextInt();
			}
		}
		
		int count = scan.nextInt();
		
		for(int i=0; i<count; i++)  {
			int x = scan.nextInt();
			int y = scan.nextInt();
			
			for(int j=0; j<19; j++) {
				if(array[x-1][j]==0)
					array[x-1][j]++;
				else
					array[x-1][j]--;
			}
			
			for(int j=0; j<19; j++) {
				if(array[j][y-1]==0)
					array[j][y-1]++;
				else
					array[j][y-1]--;
			}
		}
		
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
