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
			System.out.println("天数："+a);
			break;
		case 6:
		case 4:
		case 9:
		case 11:
			a = 30;
			System.out.println("天数："+a);
			break;
		case 2:
			if(y%4==0&&y%100!=0||y%400==0){
				a = 29;
				System.out.println("天数："+a);//为闰年
			}else{
				a = 28;
				System.out.println("天数："+a);//为平年
			}
			break;	
		default:
			System.out.println("输入有误");
			break;
		}
	}
	
	public static void main(String[] args) {
		//优化
		/*
		List<Integer> bigm = Arrays.asList(new Integer[]{1,3,5,7,8,10,12});//大月
		List<Integer> bigs = Arrays.asList(new Integer[]{4,6,9,11});//小月
		int y,m;
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		m = sc.nextInt();
		if(m==2){
			if(y%4==0&&y%100!=0||y%400==0){
				System.out.println("天数：29");//为闰年
			}else{
				System.out.println("天数：28");//为平年
			}
			return;
		}
		if(bigm.contains(m)){
			System.out.println("天数：31");
		}else if(bigs.contains(m)){
			System.out.println("天数：30");
		}
		 */
		/* 	
		 * 	跳过下面的语句，开始本层下一次循环，continue；
			跳过本层循环（一层就跳出循环），break；
			跳出方法函数，return;
			结束，exit;
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年月");
		int y = sc.nextInt();
		int m = sc.nextInt();
		J1 j = new J1();
		j.text(y, m);	
		
				
	}

}
