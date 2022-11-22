package Labs.InheritanceTest.Java;

public class Triangle extends GeometricShape {
    private String name = "Triangle";
    protected String largestAngle = "120";
    protected String totalSides = "There's three sides";

    public void printCheck() {
        printMain();
        System.out.println(this.name);
        System.out.println(largestAngle);
        System.out.println(totalSides);
        System.out.println(centre);
        System.out.println();
    }
}
