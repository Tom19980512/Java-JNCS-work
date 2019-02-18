package J1_4;

import java.util.Scanner;

public class J2 {
	public void xyJuli(double a,double b,double c,double d){
		double ab;
		ab = Math.sqrt(Math.abs((a-c)*(a-c))+Math.abs((b-d)*(b-d)));
		System.out.format("%.2f", ab).println();
	}
	public static void main(String[] args) {
		double a,b,c,d;
		Scanner sc = new Scanner(System.in);
		J2 j = new J2();
		System.out.println("«Î ‰»Îx1,x2,y1,y2µƒ÷µ");
		while(sc.hasNext()){
			a=sc.nextDouble();
			b=sc.nextDouble();
			c=sc.nextDouble();
			d=sc.nextDouble();		
			j.xyJuli(a, b, c, d);
		}
	}

}
