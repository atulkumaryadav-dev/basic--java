public class oddnumbertriangle {
    public static void main(String[] args) {
        
        int n = 4;
        int a = 1;
        for(int i=1;i<=n;i++){
            a=1;
            for(int j=1;j<=i;j++){
                System.out.print(a);
               
                a+=2;
            }
           
            System.out.println();
        }
    }
    
}
