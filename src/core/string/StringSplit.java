package core.string;

// Java Program to demonstrate
// split

public class StringSplit {
    public static void main(String[] args)
    {
        String s = "Geeks for Geeks";

        // split
        System.out.println("Splitting the string a round spaces");
        String[] geek_arr = s.split("\\s+");
        for (String i : geek_arr)
            System.out.println(i);

        System.out.println("\nSplitting the string around the spaces but controlling the length of resulting array :");

        String s_1 = "Geeks for Geeks Geeks for Geeks";
        String[] geek_arr1 = s_1.split(" ", 2);
        for (String i : geek_arr1)
            System.out.println(i);

        System.out.println("\nSplitting the string around the spaces but controlling the length of resulting array :");

        geek_arr1 = s_1.split("\\s+", 4);
        for (String i : geek_arr1)
            System.out.println(i);
    }
}

