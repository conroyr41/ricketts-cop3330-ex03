/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Conroy Ricketts
 */

import java.util.Scanner;

public class MyClass
{
    public static void main(String[] args)
    {
        System.out.println("Enter a quote!");

        Scanner scan = new Scanner(System.in);
        String quote = scan.next();

        System.out.println("Enter an author!");

        scan = new Scanner(System.in);
        String author = scan.next();

        System.out.println("\"" + quote + "\" - " + author);
    }
}
