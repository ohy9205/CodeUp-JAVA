import java.util.Scanner;
public class C1026 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String time = scan.nextLine();
		String time_arr[] = time.split(":");
		System.out.println(Integer.parseInt(time_arr[1]));
	}

}
