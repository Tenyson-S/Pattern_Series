import java.util.Scanner;

public class HollowRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Number of Rows :"); 
        int row = sc.nextInt(); 

        for(int i=1;i<=row;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j == i || i == row){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
