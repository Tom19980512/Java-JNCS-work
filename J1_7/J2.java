package J1_7;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int j = 0;j<10;j++){
			System.out.println("请输入第"+(j+1)+"个数");
			a[j]=sc.nextInt();
		}
		int max = a[0];
		for(int i = 0;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
			//max=a[i]>max?a[i]:max;//成立则sum=a[i],否则sum=min
		}
		System.out.println("最大的娃娃数："+max);
	}

}
