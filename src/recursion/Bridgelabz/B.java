package recursion.Bridgelabz;

public class B extends A {
    public void war() {
        System.out.println("Single Inheritance");
    }


    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.age);
        b.war();
        b.msg();
    }
}