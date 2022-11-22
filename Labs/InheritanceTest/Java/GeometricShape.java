package Labs.InheritanceTest.Java;

public class GeometricShape {
    private String name = "Inheritence";
    protected String centre = "I am here";

    protected void printMain() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Triangle tri1 = new Triangle();
        Rectangle rect1 = new Rectangle();
        Square sqr1 = new Square();
        tri1.printCheck();
        rect1.printSmall();
        sqr1.printCheck();
    }

}
