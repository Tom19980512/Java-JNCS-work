package J1_27;

public class T1 {
	public static void main(String[] args){
		/*ơ��ÿ�� 2.3 Ԫ������ÿ�� 1.9 Ԫ
		 *ơ�Ʊ����ϵ�������
		 *һ������ 82.3 
		 *ơ��i,����j 2.3*i + 1.9*j == 82.3
		 */
		for(int i = 1;i<36;i++){
			for(int j = 1;j<44;j++){
				if(2.3*i+1.9*j == 82.3&&i<j){
					System.out.println("ơ�ƣ�"+i+"  "+"���ϣ�"+j);
				}
			}
		}
	}
}
