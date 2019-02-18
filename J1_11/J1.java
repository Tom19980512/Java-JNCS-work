package J1_11;

public class J1 {

	public static void main(String[] args) {
		//设大类动物为x,小类为y
		//x+y=100
		//3x+y/3=100
		for(int i = 1;i<=34;i++){
			for(int j = 1;j<=100;j++){
				if((i+j==100)&&(9*i+j==300)){
					System.out.println(i+" "+j);
				}
			}
		}

	}

}
