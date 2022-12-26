package recursion.Bridgelabz;

public class C extends B {
    public void human(){
        System.out.println("we are in multilevel inheritance ");

    }

    public static void main(String[] args) {
        C c=new C();
        c.human();
        c.war();
        c.msg();
        System.out.println(c.age);
    }
}
