import java.util.Scanner;
public class C1027 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String date = scan.nextLine();
		String date_arr[] = date.split("[.]");
		int year = Integer.parseInt(date_arr[0]);
		int month = Integer.parseInt(date_arr[1]);
		int day = Integer.parseInt(date_arr[2]);
		System.out.printf("%02d-%02d-%04d",day,month,year);
	}

}
