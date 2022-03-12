package hw06;

public class Program1Instance {
        //Instance variable is a variable which are declared inside the class but outside the method or constructor

        int a = 60; // instance variable/global
        String name = "Setu Patel";//Instance variable


        //main method is a static method
        public static void main(String[] args) {
            //static area
            //instance variable ---> static method    USE/BY OBJECT
            Program1Instance obj = new Program1Instance();// obj is the object name
            System.out.println(obj.a);//60
            obj.test();//60,Setu Patel
            System.out.println(obj.name);//Setu Patel
            test1();//60,Setu Patel
        }

        //instance method because there isn't static in it
        public void test() {
            //instance area
            System.out.println(a);//60
            System.out.println(name);//Setu Patel
        }

        //static method
        public static  void test1(){
            Program1Instance instanceVariable = new Program1Instance();//by object
            System.out.println(instanceVariable.a);//60
            System.out.println(instanceVariable.name);//Setu Patel
        }
    }


