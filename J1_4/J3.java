package J1_4;

import java.util.Scanner;

public class J3 {
	public void text(int a,int b,int c,int d){
		int area1 = a*a;//��
		int area2 = b*c;//��
		double area3 = Math.PI*d*d;//Բ
		if(area1>area2){
			if(area1>area3){
				System.out.println("������");
			}else{
				System.out.println("Բ��");
			}
		}
		if(area2>area1){
			if(area2>area3){
				System.out.println("������");
			}else{
				System.out.println("Բ��");
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
