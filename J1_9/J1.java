package J1_9;

import java.util.*;

public class J1 {
	public static void text(int num){
		if(num%3==0&&num%5==0&&num%7==0){
			System.out.println("��ͬʱ�� 3�� 5�� 7 ����");
		}else if(num%3==0&&num%5==0){
			System.out.println("��ͬʱ�� 3�� 5 ����");
		}else if(num%3==0&&num%7==0){
			System.out.println("��ͬʱ�� 3�� 7 ����");
		}else if(num%5==0&&num%7==0){
			System.out.println("��ͬʱ�� 5�� 7 ����");
		}else if(num%3==0||num%5==0||num%7==0){
			System.out.println("ֻ�ܱ� 3�� 5�� 7 �е�һ������");
		}else{
			System.out.println("���ܱ� 3�� 5�� 7 ��һ������");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����һ��������");
		text(sc.nextInt());
	}

}
