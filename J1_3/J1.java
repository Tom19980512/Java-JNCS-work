package J1_3;

import java.util.Scanner;

public class J1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int[] a = new int[5];
		for(int i = 0;i<str.length();i++){
			switch(str.charAt(i)){
				case 'a':
					a[0]++;
					break;
				case 'o':
					a[1]++;
					break;
				case 'e':
					a[2]++;
					break;
				case 'i':
					a[3]++;
					break;
				case 'u':
					a[4]++;
					break;
			}
		}
		System.out.println("a�ĸ�����"+a[0]+"\n"+"o�ĸ�����"+a[1]+"\n"+"e�ĸ�����"+a[2]+"\n"+"i�ĸ�����"+a[3]+"\n"+"u�ĸ�����"+a[4]);
	}

}
