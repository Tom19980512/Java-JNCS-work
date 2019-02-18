package J1_2;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n; //
        int f;//存储n的阶乘
        System.out.println("请输入一个整数:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        f=factFor(n);
        System.out.println(n+"的阶乘是:"+f);
	}
	   public  static int factFor(int n){
	        int sum = 1;
	          
	        if(n == 0){
	            return 1;
	        }
	        for(int i = 1; i <= n; i++){
	            sum*=i;
	        }
	        return sum;
	    }

}
