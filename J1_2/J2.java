package J1_2;

import java.util.Scanner;

public class J2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n; //
        int f;//�洢n�Ľ׳�
        System.out.println("������һ������:");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        f=factFor(n);
        System.out.println(n+"�Ľ׳���:"+f);
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
