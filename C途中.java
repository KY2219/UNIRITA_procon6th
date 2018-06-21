import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int As = scan.nextInt();
		int As_array[] = new int[As];
		for(int i = 0; i < As; i++)
			As_array[i] = scan.nextInt();

		int Bs = scan.nextInt();
		int Bs_array[] = new int[Bs];
		for(int i = 0; i < Bs; i++)
			Bs_array[i] = scan.nextInt();

		int Cs = scan.nextInt();
		int Cs_array[] = new int[Cs];
		for(int i = 0; i < Cs; i++)
			Cs_array[i] = scan.nextInt();

		int K_keta = scan.nextInt();
		int S = scan.nextInt();  //A進数で表した値
		int T = scan.nextInt();  //B進数で表した値
		
		//10進数部分点特化↓
		int sum = S + T;
		int i = 0;
		int[] array = new int[sum/2];
		while(true){
			if(sum < Cs){
				array[i] = sum;
				//i++;
				break;
			}
			array[i] = sum % Cs;
			sum = sum / Cs;
			
			i++;
		}
		while(i >= 0){
			System.out.print(array[i]);
			i--;
		}
		
	}

}