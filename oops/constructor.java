public class constructor {

    public static class car {

        String name;
        int model;
        double speed;
        int rtono;

        car() {// default constructor......

        }

            // parametrize constructor...................

        car(String s, int x, double d, int rtono) {
            name = s;
            model = x;
            speed = d;

        }

        void print() {
            
            System.out.println(name + " " + model + " " + speed + " " + rtono);
        }

    }

    public static void main(String[] args) {

        car c1 = new car("xuv", 2020, 180.5, 1111);
        c1.print();

        car c2 = new car("scorpio", 2027, 250.5, 1111);
        c2.print();

    }

}
