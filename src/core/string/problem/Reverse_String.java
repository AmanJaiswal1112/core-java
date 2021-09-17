package core.string.problem;

public class Reverse_String {
    public static void main(String[] args) {
        String s = "Aman";
        revString(s);  // this can be done using string builder reverse method .  Below Method using char arr[].
        }

    private static void revString(String s) {

        char[] arr = s.toCharArray();
        int k = 0 ;
        for(int j = s.length() -1 ; j >= 0 ;j--)
        {
           arr[k++] = s.charAt(j);
        }
        System.out.println(arr);
    }
}
