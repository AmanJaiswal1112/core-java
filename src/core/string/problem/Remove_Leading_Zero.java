package core.string.problem;

/*
*
*
*
*
* */
public class Remove_Leading_Zero {
    public static void main(String[] args) {
        String s = "00001023654";

        remove_LeadingZero(s);
    }

    private static void remove_LeadingZero(String s) {
        int i = 0;
        while( s.length() > i && s.charAt(i) == '0')
        {
            i++;
        }
        System.out.println(s = s.substring(i));
    }
}
