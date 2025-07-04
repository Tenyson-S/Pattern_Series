public class Parallelogram {
    public static void main(String[] args) {
        int row = 5; 

        for(int i=1;i<=row;i++){
            for(int j=row;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=row;k++){
                if(k == 1 || k == row || i == 1 || i == row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
