package J1_8;

public class J3 {

	public static void main(String[] args) {
        int[][] a=new int[6][6];
        for(int i=0;i<6;i++){
            a[i][0]=1;
            a[i][i]=1;
        }
        for(int i=2;i<6;i++){
            for(int j=1;j<i;j++){
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for(int i=0;i<6;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(a[i][j]+" ");
                if(j==i){
                    System.out.println();
                }
            }
        }
	}

}
