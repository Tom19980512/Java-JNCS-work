package J1_29;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�м�����");
		int n = sc.nextInt();
		
		System.out.println("һ����"+n+"��");
		int[] arr = new int[n];
		for(int i = 0;i<n;i++){
			System.out.println("�������"+(i+1)+"����");
			arr[i]=sc.nextInt();
		}
		//ð������
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
