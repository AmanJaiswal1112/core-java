package core.string.problem;

/*
*
* Check if a string contains only alphabets in Java using Lambda expression
*
* */
public class Check_String_Content {
    public static void main(String[] args) {

        String s = "Geeksfor4Geeks";

        System.out.println(isStringOnlyAlphabet(s));
    }

    private static boolean isStringOnlyAlphabet(String s)
    {
        return ((s != null) && (!s.equals("")) && (s.chars().allMatch(Character ::isLetter)));
    }
}
