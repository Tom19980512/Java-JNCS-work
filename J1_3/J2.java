package J1_3;

import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
		
			int i,j;
			int d,r;
			j = 2;
			int[] x=new int[100];
			
		 Scanner s=new Scanner(System.in);
		 System.out.println("���������");
		 d=s.nextInt();
		 System.out.println("����������");
		 r=s.nextInt();
		 
		 for (i=1;i<=d;i++){//�Ƶı��
		    x[i]=i;
		 }
		 
		 while (j<=r){
		   for (i=j;i<=d;i++){//�����ӵ���������ʼ
			   if (i%j==0){//���˵ı���
		          if (x[i]!=0){//��Ϊ0��Ҫ�ص�
					  x[i]=0; 
		          }else{       //Ϊ0��Ҫ����
		        	  x[i]=i;
		          }
			   }
			}
		   	j++;  //��һ������
		 }
		 for (i=1;i<=d;i++){
			if (x[i]!=0){
				System.out.println("���򿪵ĵƱ�ţ�");
				System.out.println(x[i]+"\t");
			}
		 }
	}
}
