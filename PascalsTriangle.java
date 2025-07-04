public class PascalsTriangle {
    public static void main(String[] args) {
        int row = 5; 

        for(int i=1;i<=row;i++){

            for(int j = row;j>=i;j--){
                System.out.print(" ");
            }
            pascals(i);
            System.out.println();
        }
    }

    public static void pascals(int n){
        int res = 1; 

        for(int i=1;i<=n;i++){

            System.out.print(res+" ");
            res = res * (n-i);
            res = res / (i); 

        }
    }
}
