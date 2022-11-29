package Labs.Exc_Inher_poly.InheritencePolymorphismVirtual;

interface Shape { // Declaration of inteface
    public void PrintInfo(); // Method, kind of like pure virtual in C++

    public void PrintSize();
}

class Circle implements Shape {
    public void PrintInfo() { // body declaration of method
        System.out.println("I am the circle");
    }

    public void PrintSize() {
        System.out.println("Size: 10");
    }
}

public class Interface {
    public static void main(String[] args) {
        Circle cr = new Circle();
        cr.PrintInfo();
        cr.PrintSize();
    }
}
