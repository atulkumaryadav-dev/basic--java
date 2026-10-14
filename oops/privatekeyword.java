  class students{
        String name;
        int age;
       private int rno = 49;//hame yahi dena parega....

        void print(){ //getter......aise banta hai....
        System.out.println(name+" "+age+" "+rno);
       }
    }
    

//     public void p(){
//         print();
//       }
//   }  


public class privatekeyword {

  
    public static void main(String[] args) {

        students s1 = new students();

        s1.name = "zoya";
        s1. age = 23;
       // s1.rno = 49; //private things can't be accessed outside the class..

        s1.print();

        
    }
    
}
