package J1_7;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int j = 0;j<10;j++){
			System.out.println("�������"+(j+1)+"����");
			a[j]=sc.nextInt();
		}
		int max = a[0];
		for(int i = 0;i<a.length;i++){
			if(a[i]>max){
				max = a[i];
			}
			//max=a[i]>max?a[i]:max;//������sum=a[i],����sum=min
		}
		System.out.println("������������"+max);
	}

}
