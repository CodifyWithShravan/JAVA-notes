public class Method {
    int a = 10; // instace variable
    int b = 20;

    static int c = 100; // static variable

    static void print(){
        System.out.println("Hello number" + c);
        // Can access only static variable 
    }

    void addition(){
        System.out.println("Addition of instance variable is " + a+b);
        System.out.println("The value of static variable is " + c);
        // Can access the static variable and static methods
        print();
    }

    public static void main(String[] args) {
        Method obj = new Method();
        obj.addition();
        // Need a object to call the instance variable

        print(); // But no need to initialise object to call the static method
       
    }
}
