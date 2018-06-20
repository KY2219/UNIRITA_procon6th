import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int i = 0;
		while(i < str.length()){	
			str = str.replaceFirst("PG", "");
			str = str.replaceFirst("GC", "");
			str = str.replaceFirst("CP", "");
			i++;
		}
		
		int result = str.length();
		System.out.println(result);
	}
 
}