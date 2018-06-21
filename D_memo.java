import java.util.Arrays;
import java.util.Scanner;
 
public class Main3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	
		long A =  scan.nextLong();
		long B =  scan.nextLong();
		long K =  scan.nextLong();
		long a = (A >= 0 ? (A + K - 1) / K : A / K);
		long b = (B >= 0 ? (B + K - 1) / K : B / K);
		long sum = K * ((b - 1) * b / 2 - (a - 1) * a / 2);
			
		System.out.println(sum);
 
	}
 
}