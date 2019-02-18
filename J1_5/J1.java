package J1_5;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        for(int i=1;i<n;i++){
        	if(i%7==0){
        		count++;
        		sum+=i;
        	}
        }
        System.out.println("1-"+n+"之间能被7整除的数有"+count+"个，他们的和是："+sum);

	}

}
