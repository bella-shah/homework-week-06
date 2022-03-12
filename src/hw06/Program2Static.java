package hw06;

public class Program2Static {


        static int a = 21;//Static variable
        static String name = "Setu";

        //Variables which are declared inside the class but outside of the method with static keyword
        // static variables

        //static is related to class static method
    //main method
        public static void main(String[] args) {
            System.out.println(a);
            System.out.println(name);
            Program2Static obj = new Program2Static();

            obj.test();
        }

        //Instance method
        public void test() {
            //via class name

            System.out.println(Program2Static.a);
            System.out.println(name);
        }
    }


