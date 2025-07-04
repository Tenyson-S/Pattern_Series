public class CharPattern4 {
    public static void main(String[] args) {
         int n = 5; 

        for(int i=n-1;i>=0;i--){
            for(int j=i;j<=n-1;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
