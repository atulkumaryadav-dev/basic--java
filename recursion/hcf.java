public class hcf {
    public static void main(String[] args) {
        
        int a = 885, b = 885;
        int hcf=1;
        int count =0;

        for(int i =1;i<=a;i++){
            if(a%i==0 && b%i==0){
              hcf =i;
              System.out.print(count+" ");
               count++;
              
               
            }
        }
         
         
    }
    
}
