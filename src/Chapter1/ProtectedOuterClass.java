package Chapter1;

public class ProtectedOuterClass {

    public String name = "cat";
    protected boolean hasFur = true;
    boolean hasPaws = true;
    private int id;

    // Static method in base class which will be hidden in subclass
    public static void display() {
        System.out.println("Static or class method from Base");
    }

    // This method overrides print() in Base
    public void print() {
        System.out.println("Non-static or Instance method from Derived");
    }
}
