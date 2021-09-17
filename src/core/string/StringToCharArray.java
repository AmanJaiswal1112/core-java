package core.string;

public class StringToCharArray {
    public static void main(String[] args) {
        String str = "Aman Jaiswal";
        char arr[] = new char[str.length()];

        for(int i = 0 ; i < str.length() ; i++)
        {
            arr[i] = str.charAt(i);
        }
        System.out.println(arr);
    }
}


// Char to String
/*
*
*   char arr[] = {'g','e','e','k','s'};
*   String str = new String(arr);
*
*
* */
