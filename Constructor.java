import java.util.Scanner;


class Geeks {
    
    // data members of the class
    String name;
    int id;
  
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

public class Constructor {
    int x = 10;
    Constructor(){
        super();
        System.out.println("The default constructior is called..." + x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Constructor obj = new Constructor();
    System.out.println("What is your name?...");
    String name = scanner.nextLine();
    Geeks geeks = new Geeks(name, 0);
    System.out.println("Your name is " + geeks.name);

    scanner.close();
    
    }
}
