package J1_8;

import java.util.Scanner;

public class J1 {

	public static float discount(int pric,int quantity){
		float t_price=0;
		if(quantity>0&&quantity<=10){//�����ۼ� 9��
			t_price = (float) (pric*quantity*0.9);
		}else if(quantity>10&&quantity<=100){//����10��  8.5��
			t_price = (float) (pric*quantity*0.85);
		}else if(quantity>100){//����100�� 8��
			t_price = (float) (pric*quantity*0.8);
		}
		return t_price;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pric,quantity;
		System.out.println("������ͼ�鶨�ۣ�");
		pric = sc.nextInt();
		System.out.println("�����빺��ͼ��������");
		quantity = sc.nextInt();
		//System.out.format("%.2f",discount(pric, quantity)).println();
		System.out.println("�����ܽ�"+discount(pric, quantity));
	}

}
