package Labs.InheritanceTest.Java;

public class Quadrangle extends GeometricShape {
    private String name = "Quadrangles";
    protected String largestAngle = "110";
    protected String totalSides = "There's four sides";

    public void printCheck() {
        System.out.println(this.name);
        System.out.println(largestAngle);
        System.out.println(totalSides);
        System.out.println(centre);
        System.out.println();
    }
}
