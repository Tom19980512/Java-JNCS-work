package J1_27;

public class T2 {
/*
 *         //´òÓ¡19¸ö×ÖÄ¸
        for (int i = 1; i <= 19; i++){
            str +=  (char) (96+i);
        }
 */
	public static void main(String[] args) {
		int a = 5;
		int sum = 1;
		while(a>0){
			sum = sum * a;//sum *= a;
			a--;
		}
		
		System.out.println(digui(5)+" "+sum);
	}
	
	public static int digui(int num){
		int a = 1;
		if(num<0){
			return -1;
		}
		while(num>0){
			a *= num;
			num--;
		}
		return a;
	}

}
