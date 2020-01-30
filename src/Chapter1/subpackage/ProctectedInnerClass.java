package Chapter1.subpackage;

import Chapter1.ProtectedOuterClass;

public class ProctectedInnerClass extends ProtectedOuterClass {

    public static void main(String[] args){

        ProctectedInnerClass obj = new ProctectedInnerClass();
        System.out.println(obj.hasFur); //It must be new object

    }

    // This method hides display() in Base
    public static void display() {
        System.out.println("Static or class method from Derived");
    }

    // This method overrides print() in Base
    public void print() {
        System.out.println("Non-static or Instance method from Derived");
    }

    public void testMethod1(){
        testMethod2();
    }

    public void testMethod2()
    {
        name="deneme";
        hasFur=false;

        System.out.println(name);
        System.out.println(hasFur);
    }

}
