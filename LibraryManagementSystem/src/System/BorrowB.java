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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author JF Low
 */
public final class BorrowB {
//    private final String mID;

    private String info;
//    private final boolean check;
    protected String bookname, bookID, author, ccode, ISBN, ava, mID; //(bname+";;;"+bID+";;;"+auth+";;;"+ccode+";;;"+ISBN+";;;"+ava);
    protected static ArrayList<String> Bname = new ArrayList<>();
    protected static ArrayList<String> BID = new ArrayList<>();
    protected static ArrayList<String> Auth = new ArrayList<>();
    protected static ArrayList<String> Ccode = new ArrayList<>();
    protected static ArrayList<String> ISBn = new ArrayList<>();
    protected static ArrayList<String> Ava = new ArrayList<>();
    private boolean check;

    public BorrowB() {
        clearborrowAL();
        int classify;
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        String bID;
        boolean check1, check2;
        Scanner g = new Scanner(System.in);
        System.out.print("Please enter your member ID [Each member just can borrow one book] :");
        mID = g.next();
        check = checkingM(mID);
        if (check == true) {
            check1 = checkingM1(mID);
            if (check1 == true) {
                System.out.print("Please enter the book ID:");
                bID = g.next();
                classify = Character.getNumericValue(bID.charAt(0));
                check2 = checkingB(bID, classify);
                if (check2 == true) {
                    try {
                        PrintWriter z = new PrintWriter(new FileOutputStream("Borrow.txt", true));
                        z.println(mID + ";;;" + bID + ";;;" + timeStamp);
                        System.out.println("Borrow Successfully");
                        z.close();
                    } catch (IOException e) {
                        System.out.println("File Output Problem");
                    }

                } else {
                    System.out.println("Book not found");
                }
            } else {
                System.out.println("Member exceed the limit of book allowed to borrow[Each member just can borrow one book]");
            }
        } else {
            System.out.println("Member not Found");
        }
    }

    public boolean checkingM(String m) {                            //check whether this member is in database

        try (Scanner z = new Scanner(new FileInputStream("member.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].equalsIgnoreCase(m)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("InputProblem");
        }

        return false;
    }

    public boolean checkingM1(String m) {                                        //check whether the member got borrow book edi
        try (Scanner z = new Scanner(new FileInputStream("Borrow.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].equalsIgnoreCase(m)) {
                    return false;
                }
            }
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
        return true;
    }

    public boolean checkingB(String b, int a) {
        int counter1 = 0;
        switch (a) {
            case 0:
                try (Scanner z = new Scanner(new FileInputStream("000.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 1:
                try (Scanner z = new Scanner(new FileInputStream("100.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 2:
                try (Scanner z = new Scanner(new FileInputStream("200.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 3:
                try (Scanner z = new Scanner(new FileInputStream("300.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 4:
                try (Scanner z = new Scanner(new FileInputStream("400.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 5:
                try (Scanner z = new Scanner(new FileInputStream("500.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 6:
                try (Scanner z = new Scanner(new FileInputStream("600.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 7:
                try (Scanner z = new Scanner(new FileInputStream("700.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 8:
                try (Scanner z = new Scanner(new FileInputStream("800.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 9:
                try (Scanner z = new Scanner(new FileInputStream("900.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        if (read[1].equalsIgnoreCase(b)) {
                            saveNupdateBook(b, counter1);
                            return true;
                        }
                        counter1++;
                    }
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            default:
                break;
        }
        return false;
    }                                                                           //bookname ,bookID,author,ccode,ISBN,ava; //(bname+";;;"+bID+";;;"+auth+";;;"+ccode+";;;"+ISBN+";;;"+ava);

    protected void saveNupdateBook(String b, int c) {
        int classify;
        classify = Character.getNumericValue(b.charAt(0));
        switch (classify) {
            case 0:
               clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("000.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");
                   
                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
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
                clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("100.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");

                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
                BnameArr = new String[Bname.size()];
                BIDArr = new String[BID.size()];
                AuthArr = new String[Auth.size()];
                CcodeArr = new String[Ccode.size()];
                ISBnArr = new String[ISBn.size()];
                AvaArr = new String[Ava.size()];
                Bname.toArray(BnameArr);
                BID.toArray(BIDArr);
                Auth.toArray(AuthArr);
                Ccode.toArray(CcodeArr);
                ISBn.toArray(ISBnArr);
                Ava.toArray(AvaArr);
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
                clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("200.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");

                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
                BnameArr = new String[Bname.size()];
                BIDArr = new String[BID.size()];
                AuthArr = new String[Auth.size()];
                CcodeArr = new String[Ccode.size()];
                ISBnArr = new String[ISBn.size()];
                AvaArr = new String[Ava.size()];
                Bname.toArray(BnameArr);
                BID.toArray(BIDArr);
                Auth.toArray(AuthArr);
                Ccode.toArray(CcodeArr);
                ISBn.toArray(ISBnArr);
                Ava.toArray(AvaArr);
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
                clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("300.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");

                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
                BnameArr = new String[Bname.size()];
                BIDArr = new String[BID.size()];
                AuthArr = new String[Auth.size()];
                CcodeArr = new String[Ccode.size()];
                ISBnArr = new String[ISBn.size()];
                AvaArr = new String[Ava.size()];
                Bname.toArray(BnameArr);
                BID.toArray(BIDArr);
                Auth.toArray(AuthArr);
                Ccode.toArray(CcodeArr);
                ISBn.toArray(ISBnArr);
                Ava.toArray(AvaArr);
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
                clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("400.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");

                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
                BnameArr = new String[Bname.size()];
                BIDArr = new String[BID.size()];
                AuthArr = new String[Auth.size()];
                CcodeArr = new String[Ccode.size()];
                ISBnArr = new String[ISBn.size()];
                AvaArr = new String[Ava.size()];
                Bname.toArray(BnameArr);
                BID.toArray(BIDArr);
                Auth.toArray(AuthArr);
                Ccode.toArray(CcodeArr);
                ISBn.toArray(ISBnArr);
                Ava.toArray(AvaArr);
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
                clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("500.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");

                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
                BnameArr = new String[Bname.size()];
                BIDArr = new String[BID.size()];
                AuthArr = new String[Auth.size()];
                CcodeArr = new String[Ccode.size()];
                ISBnArr = new String[ISBn.size()];
                AvaArr = new String[Ava.size()];
                Bname.toArray(BnameArr);
                BID.toArray(BIDArr);
                Auth.toArray(AuthArr);
                Ccode.toArray(CcodeArr);
                ISBn.toArray(ISBnArr);
                Ava.toArray(AvaArr);
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
                clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("600.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");

                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
                BnameArr = new String[Bname.size()];
                BIDArr = new String[BID.size()];
                AuthArr = new String[Auth.size()];
                CcodeArr = new String[Ccode.size()];
                ISBnArr = new String[ISBn.size()];
                AvaArr = new String[Ava.size()];
                Bname.toArray(BnameArr);
                BID.toArray(BIDArr);
                Auth.toArray(AuthArr);
                Ccode.toArray(CcodeArr);
                ISBn.toArray(ISBnArr);
                Ava.toArray(AvaArr);
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
                clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("700.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");

                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
                BnameArr = new String[Bname.size()];
                BIDArr = new String[BID.size()];
                AuthArr = new String[Auth.size()];
                CcodeArr = new String[Ccode.size()];
                ISBnArr = new String[ISBn.size()];
                AvaArr = new String[Ava.size()];
                Bname.toArray(BnameArr);
                BID.toArray(BIDArr);
                Auth.toArray(AuthArr);
                Ccode.toArray(CcodeArr);
                ISBn.toArray(ISBnArr);
                Ava.toArray(AvaArr);
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
                clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("800.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");

                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
                BnameArr = new String[Bname.size()];
                BIDArr = new String[BID.size()];
                AuthArr = new String[Auth.size()];
                CcodeArr = new String[Ccode.size()];
                ISBnArr = new String[ISBn.size()];
                AvaArr = new String[Ava.size()];
                Bname.toArray(BnameArr);
                BID.toArray(BIDArr);
                Auth.toArray(AuthArr);
                Ccode.toArray(CcodeArr);
                ISBn.toArray(ISBnArr);
                Ava.toArray(AvaArr);
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
               clearborrowAL();
                try {
                    Scanner bs = new Scanner(new FileInputStream("900.txt"));
                    while (bs.hasNextLine()) {
                        info = bs.nextLine();
                        String[] read = info.split(";;;");

                        Bname.add(read[0]);
                        BID.add(read[1]);
                        Auth.add(read[2]);
                        Ccode.add(read[3]);
                        ISBn.add(read[4]);
                        Ava.add(read[5]);
                    }
                } catch (IOException e) {
                    System.out.println("FileProblem");
                }

                Ava.set(c, "not available");
                BnameArr = new String[Bname.size()];
                BIDArr = new String[BID.size()];
                AuthArr = new String[Auth.size()];
                CcodeArr = new String[Ccode.size()];
                ISBnArr = new String[ISBn.size()];
                AvaArr = new String[Ava.size()];
                Bname.toArray(BnameArr);
                BID.toArray(BIDArr);
                Auth.toArray(AuthArr);
                Ccode.toArray(CcodeArr);
                ISBn.toArray(ISBnArr);
                Ava.toArray(AvaArr);
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

        }
        

    }
    public void clearborrowAL(){
        Bname.clear();
        BID.clear();
        Auth.clear();
        Ccode.clear();
        ISBn.clear();
        Ava.clear();
    }
}
