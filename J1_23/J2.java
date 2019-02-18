package J1_23;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int total = 1+21;
		for(int i = 2;i<=n;i++){
			total = total+20+n;
		}
		System.out.println(total);
	}

}
