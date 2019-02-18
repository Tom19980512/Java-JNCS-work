package J1_1;

import java.util.Scanner;

public class W03_1 {
	
	public int mAdd(int m){//计算月份总天数
		
		int[] mon = {31,28,31,30,31,30,31,31,30,31,30};
		int sun = 0;
			for(int i = 0 ;i<m;i++){
				sun = sun + mon[i];
			}
		return sun;
		
	}
	public boolean yPd(int y){//判断年份
		
		if(y%4==0&&y%100!=0||y%400==0){
			return true;//为闰年
		}else{
			return false;//为平年
		}
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//输入函数
		System.out.println("请输入年份");
		int year = sc.nextInt();
		System.out.println("请输入月份");
		int mou = sc.nextInt();
		System.out.println("请输入日");
		int day = sc.nextInt();
/*                                          */
		W03_1 w = new W03_1();
		int count = 0;
		if(mou>2){
			if(w.yPd(year)){
				count = w.mAdd(mou-1)+day+1;
			}else{
				count = w.mAdd(mou-1)+day;
			}
		}else{
			count = w.mAdd(mou-1)+day;
		}
		System.out.println(year+"年"+mou+"月"+day+"日"+"是这一年的第"+count+"天");
	}

}
