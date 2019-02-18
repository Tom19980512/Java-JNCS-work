package J1_23;

import java.util.Scanner;

public class J3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt();
		double shui = 0;
		shui = 1500*0.05+(((money-3000)-1500)*0.1);
		System.out.println("个人所得税："+shui);
	}

}
