package J1_27;

public class T3 {

	public static void main(String[] args) {
		
        String str = "abcdefghijklmnopqrs";
        //拼接106次
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 106; i++){
            sb.append(str);
        }
        //删除奇数位
        while (sb.length()>1) {
            for (int i = 0; i < sb.length(); i++){
                sb.delete(i, i+1);//每循环一次长度就减一并删除了奇数位
                System.out.println(sb);
            }
        }

	}

}
