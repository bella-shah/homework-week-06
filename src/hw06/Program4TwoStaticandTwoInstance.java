package hw06;

public class Program4TwoStaticandTwoInstance {
    //Instance variable is a variable which are declared inside the calss but outside the method or constructor

    int a = 100; // instance variable/global
    String name = "Setu";//Instance variable
    static int b = 200;//static variable
    static int c = 60;//static variable

    //instance method because there isn't static in it
    public void test() {
        //instance area
        System.out.println(a);//100
        System.out.println(name);//Setu
    }
        //main method is a static method
        public static void main(String [] args){
            //static area
            //instance variable ---> static method    USE/BY OBJECT
            Program4TwoStaticandTwoInstance obj = new Program4TwoStaticandTwoInstance();// obj is the object name
            System.out.println(obj.a);//100
            obj.test();//100,Setu
            System.out.println(obj.name);//Setu
            obj.test1();//100,Setu
        }

        //static method
        public static void test1 (){
            Program4TwoStaticandTwoInstance twoStaticandTwoInstance = new Program4TwoStaticandTwoInstance();//by object
            System.out.println(twoStaticandTwoInstance.b);
            System.out.println(twoStaticandTwoInstance.c);
        }

}

