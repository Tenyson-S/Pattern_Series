//        1      1
//        12    21
//        123  321
//        12344321

public class NumberPattern {
    public static void main(String[] args) {
        int row = 4;

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int s = 1;s<=2*(row - i);s++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
