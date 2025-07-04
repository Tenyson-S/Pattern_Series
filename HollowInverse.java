import java.util.*;
class HollowInverse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Number of Rows :"); 
        int row = sc.nextInt(); 

        for(int i=row;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==i || i == row || j == 1){
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