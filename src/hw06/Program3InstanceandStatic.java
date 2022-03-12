package hw06;

public class Program3InstanceandStatic {
    //Instance variable is a variable which are declared inside the calss but outside the method or constructor

    int a = 80; // instance variable/global
    String name = "Setu";//Instance variable
    static int b = 200;//static variable


    //instance method because there isn't static in it
    public void test() {
        //instance area
        System.out.println(a);//80
        System.out.println(name);//Setu
    }
    //main method is a static method
    public static void main(String [] args){
        //static area
        //instance variable ---> static method    USE/BY OBJECT
        Program3InstanceandStatic obj = new Program3InstanceandStatic();// obj is the object name
        System.out.println(obj.a);//80
        obj.test();//80,Setu
        System.out.println(obj.name);//Setu
    }

    //static method
    public static void test1 (){
        Program3InstanceandStatic instanceandStatic = new Program3InstanceandStatic();//by object
        System.out.println(instanceandStatic.b);//200

    }

}



