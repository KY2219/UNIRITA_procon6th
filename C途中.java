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
		int S = scan.nextInt();  //A�i���ŕ\�����l
		int T = scan.nextInt();  //B�i���ŕ\�����l
		
		//10�i�������_������
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