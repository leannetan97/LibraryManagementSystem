/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BookDatabase {

    /**
     *
     * @author JF Low
     */
    private static String bname, bID, auth, ccode, ISBN, ava;
    private static Scanner kb = new Scanner(System.in);

    public BookDatabase() {

    }

    public static void AddBook() {

        System.out.println("Please enter new book details");
        System.out.println("NOTE !! Enter '1111' into Classification code to prevent saving or adding books");
        System.out.print("Book name : ");
        bname = kb.nextLine();
        System.out.println("0 – General works, Computer science and Information\n"+"1 – Philosophy and psychology\n" +"2 – Religion\n" +"3 – Social sciences\n" +"4– Language\n" +"5 – Pure Science\n" +"6 – Technology\n" +"7 – Arts & recreation\n" +"8 – Literature\n" +"9 – History & geography");
        System.out.println("");
        System.out.println("NOTE!!! The system will STILL ALLOW you to enter the ID that HAS BEEN USED BEFORE!");
        System.out.println("NOTE!!! AVAILABLE BOOK's STICKER = IDs have NOT BEEN USED !");
        System.out.print("Book ID [first number must be the category||eg. 9ID00001]: ");
        bID = kb.nextLine();
        System.out.print("Book author : ");
        auth = kb.nextLine();
        System.out.print("Classification code\n[000 – General works, Computer science and Information]\n"
                + "[100 – Philosophy and psychology]\n"
                + "[200 – Religion]\n"
                + "[300 – Social sciences]\n"
                + "[400 – Language]\n"
                + "[500 – Pure Science]\n"
                + "[600 – Technology]\n"
                + "[700 – Arts & recreation]\n"
                + "[800 – Literature]\n"
                + "[900 – History & geography]\n: ");
        ccode = kb.nextLine();
        System.out.print("Book ISBN : ");
        ISBN = kb.nextLine();
        ava = "available";
        int code = Integer.parseInt(ccode);
        if (code < 100) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("000.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"000.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else if (code < 200) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("100.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"100.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else if (code < 300) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("200.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"200.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else if (code < 400) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("300.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"300.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else if (code < 500) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("400.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"400.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else if (code < 600) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("500.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"500.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else if (code < 700) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("600.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"600.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else if (code < 800) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("700.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"700.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else if (code < 900) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("800.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"800.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else if (code < 1000) {
            try {
                PrintWriter book = new PrintWriter(new FileOutputStream("900.txt", true));
                book.println(bname + ";;;" + bID + ";;;" + auth + ";;;" + ccode + ";;;" + ISBN + ";;;" + ava);
                System.out.println("Added book in \"900.txt\"succesfully.");
                book.close();
            } catch (IOException e) {
                System.out.println("FileProblem");
            }
        } else {
            System.out.println("You are not adding any books into system.");
        }
    }
}
