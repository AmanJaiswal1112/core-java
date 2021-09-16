package interview;public class MyClass {
}

/*
*
* package core.collection;

// WAP take input
// logic to find 1st non repeating char

public class Demo {
    static char addChar[] = new char[256];
    public static void main(String[] args) {

        String s = "nitin";

        System.out.println(getFirstNonRepChar(s));
    }

    private static char getFirstNonRepChar(String s) {

        for(int i = 0 ; i < s.length() ; i++)
        {
            addChar[s.charAt(i)]++;
        }


        //find lenght
        int len = s.length();
        int j = -1;
        for( int i = 0; i < len ; i++)
        {
            if (addChar[s.charAt(i)] == 1) {
                 j = i;
                 break;
            }
        }
        return s.charAt(j);

    }
}

package core.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        String s = "aman, 5 , sdsd, 2";
        List<Hello> ass = new ArrayList<Hello>();
       // add(ass);
        //float f1 = 10.2f;float f2 = 10.2f;
       // Hello h = new Hello();
       // h.show();
        //System.out.println(f1 == f2)
     //   System.out.println("Hello java"+age);
    }
    public static void add(List<Object> hhh){}
    public static void get()
    {
        System.out.println("hi");
    }
}

class Hello
{
    public void show()
    {
        System.out.println(10);
        return;
    }
}




package core.collection;

public class Test1 {
    private int count =1;
    public synchronized void dosometing()
    {
        for (int i = 0 ; i < 10 ; i++)
        {
            System.out.println(count++);
        }
    }

    public static void main(String[] args) {
        Test1 t2 = new Test1();
        Thread a1 = new example(t2);
        Thread a2 = new example(t2);
        a1.start();
        a2.start();
    }
}

class example extends Thread
{
    Test1 demo;
    public example(Test1 td)
    {
demo = td;
    }

    public void run()
    {
        demo.dosometing();
    }
}



class Hi extends Hello{

}



package core.collection;

public class Test1 {
     private int x , y;

    public void set(Object o)
    {
        System.out.println("hi");
    }


    public void set(String o)
    {
        System.out.println("hell");
    }


    public static void main(String[] args) {
        Test1 t2 = new Test1();
        String t = "Test1";
        System.out.println(t instanceof  Test1);
    }
}


*
package core.collection;

public class Test {
    private int x , y;

    public void set(Object o)
    {
        System.out.println("hi");
    }

    public static void main(String[] args) {
        Test t2 = new Test();
        String t = "Test1";
        System.out.println("Hello");
    }
}

*/