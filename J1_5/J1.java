package J1_5;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("������");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for(int i=1;i<n;i++){
        	if(i%7==0){
        		count++;
        		sum+=i;
        	}
        }
        System.out.println("1-"+n+"֮���ܱ�7����������"+count+"�������ǵĺ��ǣ�"+sum);

	}

}
