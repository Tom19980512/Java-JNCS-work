package J1_6;

public class J2 {

	public static void main(String[] args) {
		int count = 0;//����
		double h = 8844.43 * 1000;//�߶�
		double h1 = 0.5;//���
		while(h1<=h){
			h1 *= 2;
			count++;
		}
		System.out.println(count);
	}

}
