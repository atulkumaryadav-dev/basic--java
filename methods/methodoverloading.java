public class methodoverloading {
    public static void main(String[] args) {

        System.out.println(max(10, 20, 30));
       
        
    }

    //ek hi name ke more than i method........
    public static  int max(int x , int y){
        return Math.max(x, y);
    }

    public static  int max(int x , int y, int z){
        return Math.max(x, Math.max(y, z));
    }
    
}
