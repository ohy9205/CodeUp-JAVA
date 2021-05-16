import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class C1084 {

	public static void main(String[] args) throws IOException{
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(input);
		OutputStreamWriter output = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(output);
		
		String rgb_input = bf.readLine();
		String[] rgb = rgb_input.split(" ");
		int count=0;
		
		for(int r=0; r<Integer.parseInt(rgb[0]); r++) {
			for(int g=0; g<Integer.parseInt(rgb[1]); g++) {
				for(int b=0; b<Integer.parseInt(rgb[2]); b++) {
					bw.write(r+" "+g+" "+b+"\n");
					count++;
				}
			}
		}
		bw.write(String.valueOf(count));
		
		bf.close();
		bw.close();
	}

}
