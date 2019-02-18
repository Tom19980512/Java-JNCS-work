package J1_1;

import java.util.Scanner;
/* 
 * 计算水仙花数
 * */
public class W01 {
	
	public boolean test(int shu){
		int a = shu/100;//求出百位
		int b = (shu/10)%10;//求十位
		int c = shu%10;//求个位
		if((shu==(a*a*a)+(b*b*b)+(c*c*c))){
			//Math.pow(num,3);  num是数字   3是几次方
			//是水仙数
			return true;
		}else{
			//不是水仙数
			return false;
		}
	}
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个三位整数");
		W01 w = new W01();
		try{
			int s = sc.nextInt();
			if(100<=s&&s<=999){
				System.out.println(w.test(s));
			}else{
				System.out.println("输入的整数不是三位");
			}
		}catch (Exception e) {
			System.out.println("输入的不是整数");
		}
//		for(int i =100;i<1000;i++){
//		if(w.test(i)){
//			System.out.println(i);
//		}
//	}
	}

}
