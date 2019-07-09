/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JF Low
 */
public final class DeleteB {

    protected String bookname, bookID, author, ccode, ISBN, ava; //(bname+";;;"+bID+";;;"+auth+";;;"+ccode+";;;"+ISBN+";;;"+ava);
    protected static ArrayList<String> Bname = new ArrayList<>();
    protected static ArrayList<String> BID = new ArrayList<>();
    protected static ArrayList<String> Auth = new ArrayList<>();
    protected static ArrayList<String> Ccode = new ArrayList<>();
    protected static ArrayList<String> ISBn = new ArrayList<>();
    protected static ArrayList<String> Ava = new ArrayList<>();

    public DeleteB() {
        clearDeleteBArr();
        boolean check;
        Scanner g = new Scanner(System.in);
        String bID;
        int num;
        System.out.println("Please enter the book id u wish to delete");
        bID = g.nextLine();
        num = Character.getNumericValue(bID.charAt(0));
        System.out.println("Book is in category " + num + "00.");
        check = checkingB(num, bID);
        if (check == true) {
            deleteBook(num, bID);
            System.out.println("Book has been deleted");
        } else {
            System.out.println("Book not found");
        }

    }

    public boolean checkingB(int num, String bID) {
        boolean check1 = false;
        clearDeleteBArr();
        int counter1 = 0;
        switch (num) {
            case 0:
                clearDeleteBArr();
                try {
                    Scanner bookD = new Scanner(new FileInputStream("000.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            case 1:
                
                try {
                    Scanner bookD = new Scanner(new FileInputStream("100.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            case 2:
                try {
                    Scanner bookD = new Scanner(new FileInputStream("200.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            case 3:
                
                try {
                    Scanner bookD = new Scanner(new FileInputStream("300.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            case 4:
                
                try {
                    Scanner bookD = new Scanner(new FileInputStream("400.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            case 5:
                
                try {
                    Scanner bookD = new Scanner(new FileInputStream("500.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            case 6:
                
                try {
                    Scanner bookD = new Scanner(new FileInputStream("600.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            case 7:
                
                try {
                    Scanner bookD = new Scanner(new FileInputStream("700.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            case 8:
                
                try {
                    Scanner bookD = new Scanner(new FileInputStream("800.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            case 9:
                
                try {
                    Scanner bookD = new Scanner(new FileInputStream("900.txt"));
                    while (bookD.hasNextLine()) {
                        String info = bookD.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(bID)) {
                            BID.remove(counter1);
                            Bname.remove(counter1);
                            Auth.remove(counter1);
                            Ccode.remove(counter1);
                            ISBn.remove(counter1);
                            Ava.remove(counter1);
                            check1 = true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileNotFound");
                }
                if (check1 == true) {
                    return true;
                }
                break;
            default:
                break;
        }
        return false;

    }

    public void deleteBook(int num, String b) {
        String[] BnameArr = new String[Bname.size()];
        String[] BIDArr = new String[BID.size()];
        String[] AuthArr = new String[Auth.size()];
        String[] CcodeArr = new String[Ccode.size()];
        String[] ISBnArr = new String[ISBn.size()];
        String[] AvaArr = new String[Ava.size()];
        Bname.toArray(BnameArr);
        BID.toArray(BIDArr);
        Auth.toArray(AuthArr);
        Ccode.toArray(CcodeArr);
        ISBn.toArray(ISBnArr);
        Ava.toArray(AvaArr);
        switch (num) {
            case 0:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("000.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 1:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("100.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 2:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("200.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 3:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("300.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 4:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("400.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 5:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("500.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 6:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("600.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 7:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("700.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 8:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("800.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 9:
                try {
                    PrintWriter bD = new PrintWriter(new FileOutputStream("900.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        bD.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    bD.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
        }

    }

    public static void clearDeleteBArr() {
        Bname.clear();
        BID.clear();
        Auth.clear();
        Ccode.clear();
        ISBn.clear();
        Ava.clear();
    }

}
