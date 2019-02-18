package J1_8;

import java.util.Scanner;

public class J1 {

	public static float discount(int pric,int quantity){
		float t_price=0;
		if(quantity>0&&quantity<=10){//正常售价 9折
			t_price = (float) (pric*quantity*0.9);
		}else if(quantity>10&&quantity<=100){//超过10本  8.5折
			t_price = (float) (pric*quantity*0.85);
		}else if(quantity>100){//超过100本 8折
			t_price = (float) (pric*quantity*0.8);
		}
		return t_price;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pric,quantity;
		System.out.println("请输入图书定价：");
		pric = sc.nextInt();
		System.out.println("请输入购买图书数量：");
		quantity = sc.nextInt();
		//System.out.format("%.2f",discount(pric, quantity)).println();
		System.out.println("购书总金额："+discount(pric, quantity));
	}

}
