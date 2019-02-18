package J1_5;

import java.util.*;

public class J3 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num = sc.nextInt(); //输入n
        //打印上面三角部分
           for(int a = 1 ; a <= num ; a++) {
               for(int b = num - a ; b > 0 ; b--) {
                   String m = " ";
                   System.out.print(m);
               }               
               for(int c = 1 ; c <= a; c++) {
                   String n = " *";
                   System.out.print(n);
               }
               System.out.println(" ");
           }
           //打印下三角部分
         for(int a = 1 ; a < num; a++) {
               for (int b = 0 ; b < a; b++) {
                   String m = " " ;
                   System.out.print(m);
               }
               for (int c =num-a ; c>0 ; c--) {
                   String n = " *";
                   System.out.print(n);
               }
               System.out.println(" ");
           }
	}

}
