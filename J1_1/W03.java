package J1_1;

import java.util.Scanner;

/*
 * 计算天数
 * */
public class W03 {
	public void test(int year,int m,int d){
		int a,b,c,count;
		count = 0; 
		c = 0;//二月天数
		a = 31;//大月天数
		b = 30;//小月天数
		if(year%4==0&&year%100!=0||year%400==0){
			c = 29;
		}else{
			c = 28;
		}
		switch(m){
		case 1:
			count = d;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 2:
			count = a+d;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 3:
			count = a+c+d;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 4:
			count = 2*a+c+d;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 5:
			count = 2*a+c+d+b;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 6:
			count = 3*a+c+d+b;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 7:
			count = 3*a+c+d+b*2;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 8:
			count = 4*a+c+d+b*2;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 9:
			count = 5*a+c+d+b*2;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 10:
			count = 5*a+c+d+b*3;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 11:
			count = 6*a+c+d+b*3;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		case 12:
			count = 6*a+c+d+b*4;
			System.out.println(year+"年"+m+"月"+d+"日"+"是这一年的第"+count+"天");
			break;
		default:
			System.out.println("你的输入有误");
		}
	}
	/*
	 * 输入的月份  日 没有进行判断存在bug
	 * */
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);//输入函数
		System.out.println("请输入年份");
		int year = sc.nextInt();
		System.out.println("请输入月份");
		int mou = sc.nextInt();
		System.out.println("请输入日");
		int day = sc.nextInt();
		W03 w = new W03();
		w.test(year, mou, day);
	}

}
