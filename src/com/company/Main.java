//Good use of commenting. Good choice to have a Scanner method, but the Int Scanner may not be necessary. Good camel type in method and variable names. Understandable to a new viewer.
package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> books = new ArrayList<>();

    public static void main(String[] args) {
        //use w3schools look up stuff
        //look up how to create and write into a file

        //everything needs to be done, add create and write to a file and loop for the amount given in userBook()

        int bookAmount = userBook();

        for (int i = 0; i < bookAmount; i++) {
            String bookDetails = bookDetails();
        }
    }

    public static int userBook(){
        int bookNums = getInt("How many books would you like to register? ");
        return bookNums;
    }

    public static String bookDetails(){
        String bookName = getString("Book name: ");
        int bookIsbn = getInt("Book ISBN: ");
        String bookAuthor = getString("Book author: ");
        String bookGenre = getString("Book genre: ");
        return bookName + bookIsbn + bookAuthor + bookGenre;
    }

    public static int getInt(String prompt){
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static String getString(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
}
