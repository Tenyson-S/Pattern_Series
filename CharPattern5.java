public class CharPattern5 {
    public static void main(String[] args) {
         int n = 5; 

        for(int i=0;i<n;i++){ 
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+j));
            }
            for(int j=i-1;j>=0;j--){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
