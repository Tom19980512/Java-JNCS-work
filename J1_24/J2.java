package J1_24;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int he = 0;
		if(n>=100&&n<=10000){
			for(int i=0;i<n;i++){
				if(i%3==0&&i%7==0){
					he = he + i;
				}
			}
		}else{
			System.out.println("请输入100~10000之间");
		}
		System.out.println(he+"的平方根为："+Math.sqrt(he));
	}

}
