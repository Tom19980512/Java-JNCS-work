package J1_27;

public class T3 {

	public static void main(String[] args) {
		
        String str = "abcdefghijklmnopqrs";
        //ƴ��106��
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 106; i++){
            sb.append(str);
        }
        //ɾ������λ
        while (sb.length()>1) {
            for (int i = 0; i < sb.length(); i++){
                sb.delete(i, i+1);//ÿѭ��һ�γ��Ⱦͼ�һ��ɾ��������λ
                System.out.println(sb);
            }
        }

	}

}
