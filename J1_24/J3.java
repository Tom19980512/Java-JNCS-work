package J1_24;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		double ten = 0;// 1 11 111 1111
		double tot = 0;//�ܺ�
		if(a>=2&&a<=9){
			/*
			 * a*1 a*1*10 pow(10,0) 1
			 * a*11  pow(10,1) 10
			 * a*111 pow(10,2) 100
			 */
			for(int i=0;i<a;i++){
				ten = ten + Math.pow(10,i);
				
				tot = tot+a*ten;
			}
		}else{
			System.out.println("������2~9֮��");
		}
		System.out.println(tot);
	}

}
