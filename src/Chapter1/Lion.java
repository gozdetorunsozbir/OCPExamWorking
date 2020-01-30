package Chapter1;

public class Lion extends Cat {

    //Instance method 'clean()' in 'Chapter1.Lion' cannot override static method 'clean()' in 'Chapter1.Cat'
    //void clean() { }

    static void clean() {
        System.out.println("clean in Lion");
    }

    public static void main(String[] args){
        Cat cat = new Lion();
        cat.clean(); //result: clean in Cat

    }
}
