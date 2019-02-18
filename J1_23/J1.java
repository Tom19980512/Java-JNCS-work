package J1_23;

public class J1 {

	public static void main(String[] args) {
		double[] arr = {9.8,12,45,67,23,1.98,2.55,45};
		double max=arr[0],min=arr[0],suv=0;
		for(int i = 0;i<arr.length;i++){
			max = max<arr[i]?arr[i]:max;
			min = min>arr[i]?arr[i]:min;
			suv += arr[i];
		}
		System.out.println("最大值："+max+"\t"+"最小值："+min+"\t"+"平均值："+suv/arr.length);
	}

}
