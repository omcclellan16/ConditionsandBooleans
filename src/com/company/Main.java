package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = 6;
        int y = 7;
        int z = 10;

        // <, >, ==, <=, >=, !=

        boolean compare = x < y;

        System.out.println(compare);
        // we get "true" :)

        boolean comparing = x > y;

        System.out.println(comparing);
        // we get "false" :)

        //What about comparing strings???
        String a = "hello";
        String b = "hi";

        boolean compart = a!=b;
        System.out.println(compart);
        // we get true - "hello" and "hi" are not equal

        boolean compared = a ==b;
        System.out.println(compared);
        // we get false :) they are not equal

        // capital letters do matter in programming - y does not equal Y (for example)
        // also note that for strings, we can only use "!=" and "==" no < or >


        //now let's talk about chaining multiple conditions together (and/or/not operators)
        //let's return to our integers (x,y and z)
        // and operator - &&
        boolean compare1 = x > y && z < y;
        System.out.println(compare1);
        // if both conditions are true, we get "true", if even one is false, we will get "false".
        // here, we get "false"

        //  this is the "or" operator ... ||
        // this is the opposite of the "and" operator - if only one of the conditions is true, then the whole...
        //... thing is true :) if both are false, then it's false
        boolean compare2 = x < y || z < y;
        System.out.println(compare2);
        // here, we get "true", even though the second condition is false

        // Finally, we have the "not" operator - this reverses everything... looks like this !(x<y || z>y)
        // if an entire condition is all false, we get "true"
        // if an entire condition is all true, we get "false"
        boolean compare3 = !(x < y || z < y);
        System.out.println(compare3);
        // above this was false, now it is true :)

        // Now let's make a long conditional statement :)
        boolean compare4 = (x < y && y > z )||( z + 2 < 5 || x + 7 > y);
        System.out.println(compare4);
        // this is true :)
        





    }
}
