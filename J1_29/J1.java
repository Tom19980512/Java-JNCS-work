package J1_29;

import java.util.Scanner;

public class J1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("有几位评委");
		int n = sc.nextInt();
		System.out.println("一共有"+n+"评委");
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			System.out.println("请输入第"+(i+1)+"位评委的分数");
			arr[i]=sc.nextInt();
		}
		//System.out.println(arr.length);
		int max = arr[0],min = arr[0],sum=0;
		for(int j = 0;j<n;j++){
			if(arr[j]>max){
				max = arr[j];//max=(max>arr[j])?max:arr[j];
			}
			if(arr[j]<min){
				min = arr[j];//min=(min<arr[j])?min:arr[j];
			}
		}
		//System.out.println("最大值:"+max+" "+"最小值:"+min);
		for(int m = 0;m<n;m++){
			sum += arr[m];
		}
		//System.out.println("总分："+sum);
		System.out.println("平均分:"+(sum-max-min)/(n-2));
	}

}
