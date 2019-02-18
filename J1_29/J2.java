package J1_29;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("有几个数");
		int n = sc.nextInt();
		
		System.out.println("一共有"+n+"数");
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			System.out.println("请输入第"+(i+1)+"个数");
			arr[i]=sc.nextInt();
		}
		//冒泡排序
		for(int i=0;i<arr.length-1;i++){
			for(int j = 0;j<arr.length-1-i;j++){
				if(arr[j]>arr[j+1]){
					int as=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=as;
				}
			}
		}
		System.out.println(arr[1]);
	}

}
