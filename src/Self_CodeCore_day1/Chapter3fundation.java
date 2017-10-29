package Self_CodeCore_day1;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by reyren on 2017/5/25.
 */

/*
* 1. &, |, ^, ~ are the bitwise operators rather than the logical operators.
* 2. == only determines whether or not the strings are stored in the same location.
*
*
* */

public class Chapter3fundation {
    public static void main(String[] args) throws IOException {


        //substring
        /*
        String greeting = "Hello";
        String s = greeting.substring(0,3);
        System.out.println(s);*/

        //String.join: put multiple strings together, separated by a delimiter(the fist parameter)
       /* String all = String.join(" /","S","M","L","XL");
        System.out.println(all);*/


        //codepoint and get the specified location of the char
       /*String greeting = "Hello";
        int cpCount = greeting.codePointCount(0,greeting.length());
        System.out.println(cpCount);

        char first = greeting.charAt(0);
        System.out.println(first);*/

       //build strings
       /* StringBuilder builder = new StringBuilder();//first, construct an empty string builder.
        //each time you need to add another part, call the append method
        //builder.append(ch);appends a single character
        //builder.append(str);appends a string
        String greeting = "Hello";
        builder.append(greeting);
        String completedString = builder.toString();//when you are done building the string, call the toString method.
        System.out.println(completedString);*/

       //input
       /* Scanner in = new Scanner(System.in);//construct a Scanner
        System.out.println("what is your name");
        //String name = in.nextLine();//read a line of input, using the readline because the input might contain spaces.
        //String name = in.next();//read the first word,delimited by whitespace
        int age = in.nextInt();//read a integer.
        System.out.println(age);*/

        //read from a file
        //Scanner in = new Scanner(Paths.get("myfile.txt"),"UTF-8");
        //write to a file
        //PrintWriter out = new PrintWriter("myfile.txt","UTF-8");


    }
}
