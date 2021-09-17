package core.string;

public class StringStorage {
    public static void main(String[] args)
    {
        String s1 = "TAT";
        String s2 = "TAT";
        String s3 = new String("TAT");
        String s4 = new String("TAT");
        String s5 = "TAT";

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s1 == s5);

        String str1 = new String("very");
        String str2 = "very";
        String str3 = new String("very");// always create new object
        String str4 = "very";
        System.out.println("--------------------------------------------------------");
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
        System.out.println(str2 == str4);
        System.out.println(str4 == str3);
    }
}
