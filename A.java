import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String s[] = str.split("",2);
		
		int a = Integer.parseInt(s[1]); 
		
		int seireki;
		int sum;
		
		if(s[0].equals("M") ){
			System.out.println(1868 + a - 1);
		}
		else if(s[0].equals("T")){
			System.out.println(1912 + a - 1);
		}
		else if(s[0].equals("S")){
			System.out.println(1926 + a - 1);
		}
		else if(s[0].equals("H")){
			System.out.println(1989 + a - 1);
		}
		else if(s[0].equals("X")){
			System.out.println(2019 + a - 1);
		}
 
	}
 
}