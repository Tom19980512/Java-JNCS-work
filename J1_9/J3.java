package J1_9;

import java.util.*;

public class J3 {
	public static int text(String s1,String s2){
		int count = 0;
        while((s1.indexOf(s2))!=-1) {
            s1=s1.substring(s1.indexOf(s2)+s2.length());
            count++;
        }
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������s1");
		String s1 = sc.nextLine();
		System.out.println("������s2");
		String s2 = sc.nextLine();
		System.out.println(text(s1,s2));
	}

}
