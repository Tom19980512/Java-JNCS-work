package J1_11;

import java.util.Scanner;

public class J2 {
	public static int text(int a,int b){
		for(int i = 1;i<a*b;i++){
			if(i%a==0&&i%b==0){
				return i;
			}
		}
		return a*b;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(text(a,b));
	}

}
