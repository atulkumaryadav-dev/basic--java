import java.lang.reflect.AnnotatedArrayType;
import java.util.Scanner;

public class smallcapital {
public static void main(String[] args) {

    //    AAAA
    //    bbbb
    //    CCCC
    //    dddd
    
    Scanner sc = new Scanner(System.in);

    int n =4;
    for(int i =1;i<=n;i++){
        for(int j =1;j<=n;j++){

            if(i%2==1){System.out.print((char)(96+i)+" ");}

        else{   System.out.print((char)(i+64)+" ");}
          

        }
        System.out.println();
    }

}
    
} 