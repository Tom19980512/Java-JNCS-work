package J1_27;

public class T1 {
	public static void main(String[] args){
		/*啤酒每罐 2.3 元，饮料每罐 1.9 元
		 *啤酒比饮料的数量少
		 *一共花了 82.3 
		 *啤酒i,饮料j 2.3*i + 1.9*j == 82.3
		 */
		for(int i = 1;i<36;i++){
			for(int j = 1;j<44;j++){
				if(2.3*i+1.9*j == 82.3&&i<j){
					System.out.println("啤酒："+i+"  "+"饮料："+j);
				}
			}
		}
	}
}
