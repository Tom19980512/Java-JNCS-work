package J1_6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class J1 {
	public void text(int y,int m){
		int a = 0;
		switch (m) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			a = 31;
			System.out.println("������"+a);
			break;
		case 6:
		case 4:
		case 9:
		case 11:
			a = 30;
			System.out.println("������"+a);
			break;
		case 2:
			if(y%4==0&&y%100!=0||y%400==0){
				a = 29;
				System.out.println("������"+a);//Ϊ����
			}else{
				a = 28;
				System.out.println("������"+a);//Ϊƽ��
			}
			break;	
		default:
			System.out.println("��������");
			break;
		}
	}
	
	public static void main(String[] args) {
		//�Ż�
		/*
		List<Integer> bigm = Arrays.asList(new Integer[]{1,3,5,7,8,10,12});//����
		List<Integer> bigs = Arrays.asList(new Integer[]{4,6,9,11});//С��
		int y,m;
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		m = sc.nextInt();
		if(m==2){
			if(y%4==0&&y%100!=0||y%400==0){
				System.out.println("������29");//Ϊ����
			}else{
				System.out.println("������28");//Ϊƽ��
			}
			return;
		}
		if(bigm.contains(m)){
			System.out.println("������31");
		}else if(bigs.contains(m)){
			System.out.println("������30");
		}
		 */
		/* 	
		 * 	�����������䣬��ʼ������һ��ѭ����continue��
			��������ѭ����һ�������ѭ������break��
			��������������return;
			������exit;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("����������");
		int y = sc.nextInt();
		int m = sc.nextInt();
		J1 j = new J1();
		j.text(y, m);	
		
				
	}

}
