package J1_29;

import java.util.Scanner;

public class J1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�м�λ��ί");
		int n = sc.nextInt();
		System.out.println("һ����"+n+"��ί");
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			System.out.println("�������"+(i+1)+"λ��ί�ķ���");
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
		//System.out.println("���ֵ:"+max+" "+"��Сֵ:"+min);
		for(int m = 0;m<n;m++){
			sum += arr[m];
		}
		//System.out.println("�ܷ֣�"+sum);
		System.out.println("ƽ����:"+(sum-max-min)/(n-2));
	}

}
