// Pyramid 

//             1
//           2 1 2
//         3 2 1 2 3
//       4 3 2 1 2 3 4
//     5 4 3 2 1 2 3 4 5 

class Pyramid{
    public static void main(String[] args){
        int row = 8; 

        for(int i=1;i<=row;i++){
            for(int j=row;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k+" ");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println("");
        }
    }
}