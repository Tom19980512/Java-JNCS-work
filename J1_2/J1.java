package J1_2;

import java.util.Scanner;

public class J1 {
	
	public void charu(int[][] cj){ //����ɼ�
		Scanner sc =new Scanner(System.in);
		for(int i = 0;i<cj.length;i++){
			for(int j = 0;j<cj[i].length;j++){
				System.out.println(i+"ͬѧ����"+j+"�ɼ���");
				cj[i][j]=sc.nextInt();
			}
		}
	}
	public void conCj(int[][] arr,int b,int[] arrs){//bΪĳ�ſγ�  �˷�������ĳ�ſγ̵�ƽ����
		int sum = 0;
		int suv = 0;
		for(int i = 0;i<arr.length;i++){
			for(int j = 0;j<1;j++){
				sum = sum+arr[i][b-1];
			}
		}
		suv = sum/arr.length;
//		System.out.println("sum:"+sum);
//		System.out.println("suv:"+suv);
		arrs[b-1] = suv;
	}
	
	public static void main(String[] args) {
		J1 j = new J1();
		int[] suvcj = new int[5];
		int[][] cj = new int[30][5];
		j.charu(cj);
		for(int i = 1;i<suvcj.length+1;i++){
			j.conCj(cj,i,suvcj);
			System.out.println(suvcj[i-1]);
		}
		
	}

}
