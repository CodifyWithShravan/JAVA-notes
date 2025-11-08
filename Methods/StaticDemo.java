public class StaticDemo{

    static int a = 50; //Static variable
    static String str = "Shravan";

    int b = 100; // Instance variable

    static void staticDisplay(){
        System.out.println("Value of a:" + a);
        System.out.println("Value of str:" + str);

        // System.out.println("Value of b:" + b); 
        /*Gives error cause static method cannot access the instace 
          variables or the instance methods directly*/
    }

    void instanceDisplay(){
        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        System.out.println();
        System.out.println("Accessing the static method");
        staticDisplay(); // Static methods can be accessed by anyone
    }

    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();

        obj.instanceDisplay();
        System.out.println("---------------------------------------------");
        System.out.println("Now calling the Static method without any use of object");
        staticDisplay();
    }
}