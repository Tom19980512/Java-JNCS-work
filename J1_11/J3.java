package J1_11;

import java.util.Scanner;

public class J3 {
	public static void text(double a,double b,double c){
		if(a+b>c&&b+c>a&&a+c>b){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		text(a,b,c);
	}
	//a+b>c       a>c-b
	/*	任意两边之和大于第三边
		任意两边之差小于第三边
		实际上这两个条件是一样的,所以只要用一个条件检验即可.
	*/
}
