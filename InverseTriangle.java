public class InverseTriangle {
    public static void main(String[] args) {
        int row = 5; 

        for(int i=1;i<=row;i++){
            

            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }

            for(int j=row;j>=i;j--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
