package Chapter1.subpackage;

import Chapter1.ProtectedOuterClass;

public class ProctectedInnerClass extends ProtectedOuterClass {

    public static void main(String[] args){

        ProctectedInnerClass obj = new ProctectedInnerClass();
        System.out.println(obj.hasFur); //It must be new object


        ProtectedOuterClass outer = new ProctectedInnerClass();

        // As per overriding rules this should call to class Derive's static
        // overridden method. Since static method can not be overridden, it
        // calls Base's display()
        outer.display();

        // Here overriding works and Derive's print() is called
        outer.print();

        ProctectedInnerClass innerClass = new ProctectedInnerClass();
        innerClass.display();


    }

    // This method hides display() in Base
    //You cannot override in ProtectedOuterClass
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
