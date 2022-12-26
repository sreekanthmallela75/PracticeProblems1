package recursion.Bridgelabz;

public class MyExample implements Printable,Showable {

    @Override
    public void print() {
        System.out.println("we are in ");
    }

    @Override
    public void show() {
        System.out.println("bridgelabz");

    }

    public static void main(String[] args) {
        MyExample s=new MyExample();
        s.print();
        s.show();
        System.out.println("in my example class");
    }
}
