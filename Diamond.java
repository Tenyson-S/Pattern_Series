public class Diamond {
    public static void main(String[] args) {
        int row = 10; 

        for(int i=1;i<row/2;i++){
            for(int j=row/2;j>=i;j--){
                System.out.print(" ");
            }

            for(int k = 1; k<=i;k++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i=row/2;i>=1;i--){
            for(int j=i;j<=row/2;j++){
                System.out.print(" ");
            }

            for(int k=i;k>=1;k--){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    
}
