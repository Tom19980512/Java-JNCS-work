package J1_1;

import java.util.Scanner;

/*
 * ��������
 * */
public class W03 {
	public void test(int year,int m,int d){
		int a,b,c,count;
		count = 0; 
		c = 0;//��������
		a = 31;//��������
		b = 30;//С������
		if(year%4==0&&year%100!=0||year%400==0){
			c = 29;
		}else{
			c = 28;
		}
		switch(m){
		case 1:
			count = d;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 2:
			count = a+d;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 3:
			count = a+c+d;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 4:
			count = 2*a+c+d;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 5:
			count = 2*a+c+d+b;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 6:
			count = 3*a+c+d+b;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 7:
			count = 3*a+c+d+b*2;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 8:
			count = 4*a+c+d+b*2;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 9:
			count = 5*a+c+d+b*2;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 10:
			count = 5*a+c+d+b*3;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 11:
			count = 6*a+c+d+b*3;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		case 12:
			count = 6*a+c+d+b*4;
			System.out.println(year+"��"+m+"��"+d+"��"+"����һ��ĵ�"+count+"��");
			break;
		default:
			System.out.println("�����������");
		}
	}
	/*
	 * ������·�  �� û�н����жϴ���bug
	 * */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//���뺯��
		System.out.println("���������");
		int year = sc.nextInt();
		System.out.println("�������·�");
		int mou = sc.nextInt();
		System.out.println("��������");
		int day = sc.nextInt();
		W03 w = new W03();
		w.test(year, mou, day);
	}

}
