package J1_7;

import java.util.Scanner;

public class J3 {
	public static int fun(int a){
		int result = 1;
		while(a>0){
			//result = result*a % 10;
			result *= a % 10;
			a = a/10;
		}
		return result;
	}
	public static void main(String[] args) {
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int sum = fun(sc.nextInt());
		System.out.println("����λ�˻���"+sum);
	}

}
