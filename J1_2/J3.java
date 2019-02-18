package J1_2;

public class J3 {

	public static void main(String[] args) {
        double sum = 0;
        double n1 =2;
        double n2 = 1;
        double sn = 0;
        for (int i = 0; i <20; i++) {
            sum += n1/n2;
            sn = n1+n2;
            n2 = n1;
            n1 = sn;
        }
        System.out.println(sum);
    }

}
