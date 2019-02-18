package J1_6;

public class J3 {
	public boolean text(int x){
			boolean flag = false;
			int a = x*x;
			if(a<100){
				if(a%10==x){
					flag = true;
				}
			}
			if(a>=100){
				if(a%100==x){
					flag = true;
				}
			}
			if(a>=1000){
				if(a%1000==x){
					flag = true;
				}
			}
			return flag;
	}
	public static void main(String[] args) {
		J3 j = new J3();
		for(int i = 3;i<99;i++){
			if(j.text(i)){
				System.out.println(i);
			}
		}

	}

}
