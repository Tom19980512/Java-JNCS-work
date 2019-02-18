package J1_3;

import java.util.Scanner;

public class J2 {
	public static void main(String[] args) {
		
			int i,j;
			int d,r;
			j = 2;
			int[] x=new int[100];
			
		 Scanner s=new Scanner(System.in);
		 System.out.println("输入灯数：");
		 d=s.nextInt();
		 System.out.println("输入人数：");
		 r=s.nextInt();
		 
		 for (i=1;i<=d;i++){//灯的编号
		    x[i]=i;
		 }
		 
		 while (j<=r){
		   for (i=j;i<=d;i++){//灯数从等于人数开始
			   if (i%j==0){//是人的倍数
		          if (x[i]!=0){//不为0则要关灯
					  x[i]=0; 
		          }else{       //为0则要开灯
		        	  x[i]=i;
		          }
			   }
			}
		   	j++;  //下一个人数
		 }
		 for (i=1;i<=d;i++){
			if (x[i]!=0){
				System.out.println("还打开的灯编号：");
				System.out.println(x[i]+"\t");
			}
		 }
	}
}
