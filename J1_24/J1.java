package J1_24;

import java.util.Scanner;

public class J1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = str.split(",");
		int[] si = new int[arr.length];
		for(int i =0;i<arr.length;i++){
			si[i] = Integer.parseInt(arr[i]);
		}
		
		int[] num = new int[si.length];
		int[] nums = new int[si.length];
		for(int i =0;i<si.length;i++){
			for(int j = 0;j<si.length;j++){
				if(si[i]==num[j]){
					nums[j]++;
				}else{
					num[i] = si[i];
					nums[i] = 1;
				}
			}
		}
		
		int max=0,biao=0;
		for(int j = 0;j<nums.length;j++){
			if(max<nums[j]){
				max = nums[j];
				biao = j;
			}
		}
		
		System.out.println("字符："+si[biao]+"出现次数："+max);
	}

}
