public class CharPattern2 {
    public static void main(String[] args) {
        int n = 5; 

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
