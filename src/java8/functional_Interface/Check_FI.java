package java8.functional_Interface;

@FunctionalInterface
interface Test{
    int calculate(int x);
}

public class Check_FI {
    public static void main(String[] args) {

        // lambda expression to define the calculate method
        Test t = (int x) -> x*x;

        // parameter passed and return type must be
        // same as defined in the prototype
        System.out.println(t.calculate(5));

    }
}
