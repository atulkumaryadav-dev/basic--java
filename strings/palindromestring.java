import java.util.Scanner;

public class palindromestring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s = sc.nextLine();

        int i =0, j =s.length()-1;

        boolean palindrome=true;

        while(i<j){
          if(s.charAt(i)==s.charAt(j)){
                i++;
                j--; 
            }

            else{palindrome=false;
                break;
            }
            
        }

        if(palindrome){System.out.println("palindrome hai");}
        else{System.out.println("not a palindrome");}


    }
    
}
