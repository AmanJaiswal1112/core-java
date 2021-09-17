package java8.functional_Interface;

/*
*
* // Java program to demonstrate working of predicates on collection. The program finds all admins in an
// arrayList of users.
*
* */
import java.util.function.Predicate;
import java.util.*;
import java.util.stream.Collectors;

class User {
    String name, role;

    User(String a, String b) {
        name = a;
        role = b;
    }

    String getRole() {
        return role;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return "User Name : " + name + ", Role :" + role;
    }
}

public class UserClass_Predicate_FI {
    public static void main(String[] args) {

        List<User> users = new ArrayList<User>();
        users.add(new User("John", "admin"));
        users.add(new User("Peter", "member"));

        //Approach 1 using Predicate function
        Predicate<User> userPredicate = (user)-> user.getRole().equals("admin");
        for (User user: users) {
            if(userPredicate.test(user))
                System.out.println(user);
        }

        //Approach 2 using Stream Api
        List<User> adminUserList = users.stream().filter(userPredicate).collect(Collectors.toList());
        System.out.println(adminUserList);
    }
}
