import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		long A =  scan.nextLong();
		long B =  scan.nextLong();
		long K =  scan.nextLong();
		long sum = 0;
		
		long i = A;
		while(i < B){
			if(i % K == 0)
				sum += i;
			i++;
		}
			
		System.out.println(sum);
 
	}
 
}