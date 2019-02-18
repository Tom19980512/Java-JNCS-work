package J1_4;

import java.util.Scanner;

public class J1 {
	public void V(double r){
		double v = 4*Math.PI*Math.pow(r, 3)/3;
		System.out.format("%.3f",v).println();;//设置小数点后精确位
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		J1 j = new J1();
		System.out.println("请输入球的半径r");
		while(sc.hasNext()){
			double r = sc.nextDouble();
			j.V(r);
		}
//		System.out.println(Math.PI);//3.141592653589793
	}

}
