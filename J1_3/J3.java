package J1_3;

public class J3 {
	public void text(int n){
		for(int i = 1;i<100;i++){
			if(Math.pow(2,i)%n==1){
				System.out.println("2^"+i+"mod"+n+"=1");
			}else{
				System.out.println("2^"+"?"+"mod"+n+"=1");
			}
		}
	}
	
	public static void main(String[] args) {
		J3 j = new J3();
		j.text(5);
	}

}
