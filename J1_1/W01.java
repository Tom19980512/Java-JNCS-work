package J1_1;

import java.util.Scanner;
/* 
 * ����ˮ�ɻ���
 * */
public class W01 {
	
	public boolean test(int shu){
		int a = shu/100;//�����λ
		int b = (shu/10)%10;//��ʮλ
		int c = shu%10;//���λ
		if((shu==(a*a*a)+(b*b*b)+(c*c*c))){
			//Math.pow(num,3);  num������   3�Ǽ��η�
			//��ˮ����
			return true;
		}else{
			//����ˮ����
			return false;
		}
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ����λ����");
		W01 w = new W01();
		try{
			int s = sc.nextInt();
			if(100<=s&&s<=999){
				System.out.println(w.test(s));
			}else{
				System.out.println("���������������λ");
			}
		}catch (Exception e) {
			System.out.println("����Ĳ�������");
		}
//		for(int i =100;i<1000;i++){
//		if(w.test(i)){
//			System.out.println(i);
//		}
//	}
	}

}
