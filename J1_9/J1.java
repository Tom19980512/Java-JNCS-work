package J1_9;

import java.util.*;

public class J1 {
	public static void text(int num){
		if(num%3==0&&num%5==0&&num%7==0){
			System.out.println("能同时被 3、 5、 7 整除");
		}else if(num%3==0&&num%5==0){
			System.out.println("能同时被 3、 5 整除");
		}else if(num%3==0&&num%7==0){
			System.out.println("能同时被 3、 7 整除");
		}else if(num%5==0&&num%7==0){
			System.out.println("能同时被 5、 7 整除");
		}else if(num%3==0||num%5==0||num%7==0){
			System.out.println("只能被 3、 5、 7 中的一个整除");
		}else{
			System.out.println("不能被 3、 5、 7 任一个整除");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数：");
		text(sc.nextInt());
	}

}
