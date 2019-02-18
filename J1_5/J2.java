package J1_5;

import java.util.*;

public class J2 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt(); //输入n
        for(int i=1;i<=n;i++){
            if(IsPrime(i)){
                System.out.print(i+"\t");
            }
        }
	}
    public static boolean IsPrime(int x){//判断是否是素数
        boolean b=false;
        int i;
        for (i = 2; i<x; i++){ // 1不是素数，所以直接从2开始循环
            if(x%i==0){ 
            	break;
            }
        }          
        if(i==x){
             b=true;
        }
        return b;
    }
}
