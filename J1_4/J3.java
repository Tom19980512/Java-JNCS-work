package J1_4;

import java.util.Scanner;

public class J3 {
	public void text(int a,int b,int c,int d){
		int area1 = a*a;//正
		int area2 = b*c;//长
		double area3 = Math.PI*d*d;//圆
		if(area1>area2){
			if(area1>area3){
				System.out.println("正方形");
			}else{
				System.out.println("圆形");
			}
		}
		if(area2>area1){
			if(area2>area3){
				System.out.println("长方形");
			}else{
				System.out.println("圆形");
			}
		}
	}
	public static void main(String[] args) {
		int a,b,c,d;
		Scanner sc = new Scanner(System.in);
		J3 j = new J3();
		while(sc.hasNext()){
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			d = sc.nextInt();
			j.text(a, b, c, d);
		}
	}

}
