 //entire things is called encapsulation..........
    class students {
        String name;
        int age;
        private int rno = 49;// hame yahi dena parega....

        void print() { // getter......aise banta hai....
            System.out.println(name + " " + age + " " + rno);
        }

        int getrno(){ //getter use to accesss private member....
            return  rno;
        }

        void setrno(int x){ // use to set private value..which can't be accessed
            rno = x;
        }
    }

    //yaha tak........................

public class getterandsetter {

    public static void main(String[] args) {

        students s1 = new students();

        s1.name = "Atul";
        s1.age = 22;
        s1.setrno(49);
        s1.print();
       
        System.out.println(s1.getrno());

    }

}
