package J1_6;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		List<Integer> bigm = Arrays.asList(new Integer[]{1,3,5,7,8,10,12});//����
		List<Integer> bigs = Arrays.asList(new Integer[]{4,6,9,11});//С��
		int y,m;
		Scanner sc = new Scanner(System.in);
		y = sc.nextInt();
		m = sc.nextInt();
		if(m==2){
			if(y%4==0&&y%100!=0||y%400==0){
				System.out.println("������29");//Ϊ����
			}else{
				System.out.println("������28");//Ϊƽ��
			}
			return;
		}
		if(bigm.contains(m)){
			System.out.println("������31");
		}else if(bigs.contains(m)){
			System.out.println("������30");
		}
	}

}
