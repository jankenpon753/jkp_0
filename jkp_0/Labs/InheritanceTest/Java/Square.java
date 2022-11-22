package Labs.InheritanceTest.Java;

public class Square extends Quadrangle {
    private String name = "I am a square";
    private String sideSize = "All sides are equal";

    public void printSmall() {
        printMain();
        printCheck();
        System.out.println(this.name);
        System.out.println(sideSize);
        System.out.println();
    }
}
