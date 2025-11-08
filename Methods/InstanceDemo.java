public class InstanceDemo{
    String name;

    public InstanceDemo(String name){ // Constructor for directly initialising 
        this.name = name;
    }

void displayInfo(){ // Instance method without the parameter
System.out.println("Hello I am "+name);
}

void salary(int a){ // Instance method using the parameter
System.out.println(name+ "'s" + " salary is: " + a);
}

public static void main(String[] args) {
    InstanceDemo Shravan = new InstanceDemo("Shravan");
    Shravan.displayInfo();
    Shravan.salary(100000);
}
}