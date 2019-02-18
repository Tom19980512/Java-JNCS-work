package J1_9;

public class J2 {

	public static void main(String[] args) {
        int a[]={1,9,3,7,4,2,5,0,6,8};
        
        System.out.print("≈≈–Ú«∞a[]=");
        for(int n:a){
            System.out.print(n+" ");
        }
        
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]) {
                    int t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
        System.out.println();
        
        System.out.print("≈≈–Ú∫Ûa[]=");
        for(int n:a){
            System.out.print(n+" ");
        }
        
	}

}
