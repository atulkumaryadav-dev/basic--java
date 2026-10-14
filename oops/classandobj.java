public class classandobj{

    public  static  class student{

        String name;
        int age;
        double height;
        int rno;

        void print(){
            System.out.println(name+" "+age+" "+height+" "+rno);
        }
    }
    public static void main(String[] args) {

    student s1 = new student();

    s1.name = "Atul";
    s1.age = 22;
    s1.height = 170;
    s1. rno = 40;

    s1.print();

        
    }
    
}