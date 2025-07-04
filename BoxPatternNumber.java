public class BoxPatternNumber {
    public static void main(String[] args) {
        int n = 3; 
        int r = n*2 -1;
        for(int i=0;i<r; i++){ 
            for(int j=0;j<r;j++){
                int top = i;
                int left = j; 
                int right = r-j-1; 
                int bottom = r-i-1; 

                int val = Math.min(Math.min(top,bottom),Math.min(left,right)); 
                System.out.print(n-val+" ");
            }
            System.out.println();
        }
    }
}
