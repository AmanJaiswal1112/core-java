package core.string.problem;

/*
*   Swap two Strings without using third user defined variable in Java
*
* 1) Append second string to first string and
   store in first string:
   a = a + b

2) call the method substring(int beginindex, int endindex)
   by passing beginindex as 0 and endindex as,
      a.length() - b.length():
   b = substring(0,a.length()-b.length());

3) call the method substring(int beginindex) by passing
   b.length() as argument to store the value of initial
   b string in a
   a = substring(b.length());
*
* */
public class Swap_String {

    public static void main(String[] args) {

        String s1 = "Aman";
        String s2 = "Jaiswal";
        swapString(s1, s2);
    }

    public static void swapString(String s1 , String s2)
    {
        s1 = s1.concat(s2);
        s2 = s1.substring(0, (s1.length()  - s2.length()));
        s1 = s1.substring(s2.length());
        System.out.println("s1 ="+s1+ "\t s2 = "+s2);
    }
}
