import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int i = 0;
		
		while(i != str.length()-1){
			String s[] = str.split("");
			
			if(s[i].equals("G") && s[i+1].equals("C")){
				str = str.replaceFirst("GC", "");
				i = 0;
				continue;
			}
			else if(s[i].equals("C") && s[i+1].equals("P")){
				str = str.replaceFirst("CP", "");
				i = 0;
				continue;
			}
			else if(s[i].equals("P") && s[i+1].equals("G")){
				str = str.replaceFirst("PG", "");
				i = 0;
				continue;
			}
			
			i++;
			
		} 
		
		int result = str.length();
		System.out.println(result);
	}
 
}