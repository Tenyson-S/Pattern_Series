import java.util.*;
class Square{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Number of Rows :"); 
        int row = sc.nextInt(); 

        for(int i=1;i<=row;i++){
            for(int j=1;j<=row;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}