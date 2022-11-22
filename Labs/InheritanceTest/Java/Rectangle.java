package Labs.InheritanceTest.Java;

public class Rectangle extends Quadrangle {
    private String name = "I am a rectangle";
    private String sideSize = "Each two sides are equal";

    public void printSmall() {
        printMain();
        printCheck();
        System.out.println(this.name);
        System.out.println(sideSize);
        System.out.println();
    }
}
