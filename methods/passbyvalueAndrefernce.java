public class passbyvalueAndrefernce{

    public static void change(int x){

        x = 20;
        System.out.println(x);

    }
    public static void main(String[] args) {
        

        int x = 10;
        System.out.println(x);
        
        change(x);
        System.out.println(x);


    }

}