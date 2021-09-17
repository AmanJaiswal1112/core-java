package core.string.problem;

/*
*
* Given two strings S1 and S2 as input. Your task is to concatenate two strings and then reverse the string. Finally print the reversed string.
*
*
* */

public class Concat_Reverse_String {
    public static void main(String[] args) {

        String s1 = "Geeks";
        String s2 = "forGeeks";
        //output ---skeeGrofskeeG
        System.out.println(conRevstr(s1, s2));
    }

    static String conRevstr(String s1, String s2) {
        // code here


        StringBuilder s3 = new StringBuilder(s1.concat(s2));
        return s3.reverse().toString();
    }
}
