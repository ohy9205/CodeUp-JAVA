import java.util.Scanner;

public class C1099 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] field = new int[10][10];
		// 배열 요소값 입력
		for(int x=0; x<10; x++) {
			for(int y=0; y<10; y++)
				field[x][y] = scan.nextInt();
		}
		// 개미 길
		int i=1;
		for(int j=1; j<field.length; j++) {
			if(field[i][j]==2) {
				field[i][j]=9;
				break;
			} else if(field[i][j]==1) {
				i=i+1;
				j=j-2;
			} else {
				field[i][j]=9;
			}
			
			if(i==9)
				break;
		}
		// 출력
		for(int x=0; x<10; x++) {
			for(int y=0; y<10; y++)
				System.out.print(field[x][y]+" ");
			System.out.println();
		}

	}

}
