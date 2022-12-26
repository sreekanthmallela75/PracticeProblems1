package recursion.lambdaexpression;

public class LambdaExpression1 {
    public static void main(String[] args) {
        Print p = (s) -> {
            System.out.println(s);
        };
        p.Print("Sreekanth Mallela");
    }

}