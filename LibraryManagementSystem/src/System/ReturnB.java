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
public final class ReturnB {

    protected String bookname, bookID, author, ccode, ISBN, ava; //(bname+";;;"+bID+";;;"+auth+";;;"+ccode+";;;"+ISBN+";;;"+ava);
    protected static ArrayList<String> Bname = new ArrayList<>();
    protected static ArrayList<String> BID = new ArrayList<>();
    protected static ArrayList<String> Auth = new ArrayList<>();
    protected static ArrayList<String> Ccode = new ArrayList<>();
    protected static ArrayList<String> ISBn = new ArrayList<>();
    protected static ArrayList<String> Ava = new ArrayList<>();
    protected static ArrayList<String> BBID = new ArrayList<>();
    protected static ArrayList<String> MMID = new ArrayList<>();
    protected static ArrayList<String> Time = new ArrayList<>();
    private static int counter, c, d = 0;
    private String b;

    public ReturnB() {
        String bID;
        boolean check;
        clearReturnBArr();
        System.out.println("PLease enter the book ID");
        Scanner g = new Scanner(System.in);
        bID = g.nextLine();
        check = checkingB(bID);
        if (check == true) {
            updateR(bID, c, d);
            System.out.println("Done");
        } else {
            System.out.println("Book not found");
        }
    }

    public boolean checkingB(String b) {
        int num, counter1 = 0;
        num = Character.getNumericValue(b.charAt(0));
        switch (num) {
            case 0:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("000.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 1:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("100.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 2:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("200.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 3:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("300.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 4:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("400.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 5:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("500.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 6:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("600.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 7:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("700.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 8:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("800.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 9:
                clearReturnBArr();
                try {
                    Scanner bs = new Scanner(new FileInputStream("900.txt"));
                    while (bs.hasNextLine()) {
                        String info = bs.nextLine();
                        String[] read = info.split(";;;");
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                        if (read[1].equalsIgnoreCase(b)) {
                            d = counter1;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            default:
                break;
        }
        clearBorrowAL();
        counter = 0;
        try {
            Scanner bookC = new Scanner(new FileInputStream("Borrow.txt"));
            Scanner bookD = new Scanner(new FileInputStream("Borrow.txt"));
            while (bookC.hasNextLine()) {
                String info = bookC.nextLine();
                String[] read = info.split(";;;");
                MMID.add(read[0]);
                BBID.add(read[1]);
                Time.add(read[2]);
                if (read[1].equalsIgnoreCase(b)) {
                    c = counter;
                }
                counter++;
            }
            while (bookD.hasNextLine()) {
                String info = bookD.nextLine();
                String[] read = info.split(";;;");
                if (read[1].equalsIgnoreCase(b)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("FileProblem");
        }
        return false;
    }

    public void updateR(String b, int c, int d) {
        Ava.set(d, "available");
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
        int num;
        num = Character.getNumericValue(b.charAt(0));
        switch (num) {
            case 0:
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("000.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 1:
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("100.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 2:
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("200.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 3:
                
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("300.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 4:
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("400.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 5:
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("500.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 6:
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("600.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 7:
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("700.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 8:
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("800.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            case 9:
                try {
                    PrintWriter change = new PrintWriter(new FileOutputStream("900.txt"));
                    for (int i = 0; i < BnameArr.length; i++) {
                        change.println(BnameArr[i] + ";;;" + BIDArr[i] + ";;;" + AuthArr[i] + ";;;" + CcodeArr[i] + ";;;" + ISBnArr[i] + ";;;" + AvaArr[i]);
                    }
                    change.close();
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }
                break;
            default:
                break;
        }

        MMID.remove(c);
        BBID.remove(c);
        Time.remove(c);
        String[] MMIDArr = new String[MMID.size()];
        String[] BBIDArr = new String[BBID.size()];
        String[] TimeArr = new String[Time.size()];
        MMID.toArray(MMIDArr);
        BBID.toArray(BBIDArr);
        Time.toArray(TimeArr);
        try {
            PrintWriter bookUp = new PrintWriter(new FileOutputStream("Borrow.txt"));
            for (int i = 0; i < MMIDArr.length; i++) {
                bookUp.println(MMIDArr[i] + ";;;" + BBIDArr[i] + ";;;" + TimeArr[i]);
            }
            bookUp.close();
        } catch (IOException e) {
            System.out.println("FileNotFound");
        }
    }

    public void clearReturnBArr() {
        Bname.clear();
        BID.clear();
        Auth.clear();
        Ccode.clear();
        ISBn.clear();
        Ava.clear();
       
    }
    public void clearBorrowAL(){
     BBID.clear();
        MMID.clear();
        Time.clear();
}}
