import java.util.*;
public class profitloss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter costprice: ");
        int cp = sc.nextInt();

        System.out.print("Enter sellingprice :");
        int sp = sc.nextInt();

        if(sp>cp){
            System.out.println("gain of"+ (sp-cp));
        }
        else if (cp>sp) {
            System.out.println("loss of "+ (cp-sp));
        }

        else{System.out.println("no gain or loss");}
    }
    
}
