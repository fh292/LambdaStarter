package lambdaTest;

public class LambdaTest {
    public static void main(String[] args) {
        Box box =(text)->System.out.println(text);
        box.button("hello");
    }
}
