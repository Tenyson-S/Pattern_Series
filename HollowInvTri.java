public class HollowInvTri {
    public static void main(String[] args) {
        int row = 10; 

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }

            for(int k=row;k>=i;k--){
                if(k == row || k == i || i == 1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
