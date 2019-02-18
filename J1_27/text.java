package J1_27;

public class text {

	public static void main(String[] args) {
		String str = "abcdefghijkabcdefghijk";
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		
		while(sb.length()>1){
			for(int i = 0;i<sb.length();i++){
				sb.delete(i,i+1);
				System.out.println(sb);
			}
		}

	}

}
