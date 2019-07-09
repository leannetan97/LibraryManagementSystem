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
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yan
 */
public class Librarian {

    protected static ArrayList<String> IC = CreateMember.getIC();
    protected static ArrayList<String> ID = CreateMember.getID();
    protected static ArrayList<String> MEMINFO = CreateMember.getMEMINFO();
    protected static ArrayList<String> LADDRESS = CreateLibrarian.getLADDRESS();
    protected static ArrayList<String> LPHONENUM = CreateLibrarian.getLPHONENUM();
    protected static ArrayList<String> LPASSWORD = CreateLibrarian.getLPASSWORD();
    protected static ArrayList<String> LNAME = CreateLibrarian.getLNAME();
    protected static ArrayList<String> LID = CreateLibrarian.getLID();
    protected static ArrayList<Integer> ACCESSCODE = new ArrayList<>();
    private static Random g = new Random();
    private static int[] ACbox = new int[1];
    private static int code, index, op, choice, Lset = 0, done = 0;
    private static String Lid, Lpassword, Lppassword, Laddress, Lphonenum, Lpassword1, Lpasswordf, keyinID, enter;
    private static char Lans;
    private static Scanner kb = new Scanner(System.in); // for member info
    private static Scanner kb1 = new Scanner(System.in);// for address,num...
    private static Scanner kb2 = new Scanner(System.in);//for INT

    public Librarian() {
        LibrarianLogin();
    }

    public static void LibrarianLogin() {
        OVERALL:
        {
            System.out.println("【Librarian】\nPlease enter your ID and password");
            System.out.print("ID:");
            Lid = kb.nextLine();
            CreateLibrarian.ClearLibrarianAL();
            CreateLibrarian.runlibrarianid();
            if (LID.contains(Lid)) {
                for (int i = 0; i < LID.size(); i++) {
                    if (LID.get(i).equals(Lid)) {
                        index = i;
                        op = 0;
                    }
                }
            } else {
                //librian login only
                System.out.println("Sorry worng ID.(This is only for librarian to login)");
                op = 10;
            }
            while (op < 10) {
                System.out.print("Password:");
                Lpassword = kb.nextLine();
                if (Lpassword.equals(LPASSWORD.get(index))) {
                    System.out.println("Login Sucessful\nHi,Welcome back " + LNAME.get(index));
                    System.out.println("\nPlease select your operation");
                    System.out.println("1)Update Profile");
                    System.out.println("2)Add new Members for registration"); // new librarian should fill up the form before interview
                    System.out.println("3)Delete member");
                    System.out.println("4)Search book");//according category & words
                    System.out.println("5)Renew membership(Generate Access Code)");
                    System.out.println("6)Add book in a specific category)"); // Add(specific book in a category)
                    System.out.println("7)Delete book in a specific category"); //Delete (specific book in a category)
                    System.out.println("8)Book Operation");//Borrow and Returns Book
                    System.out.println("9)Clock in/Clock out");// clock in clock out
                    System.out.println("10)Log out");//second switch for operation
                    op = kb2.nextInt();
                    break;
                } else {
                    System.out.println("Fail to login(Wrong password/ID), please log in again.");
                    op = 10;
                }
            }
            do {
                switch (op) {
                    case 1://update profile
                        LUpdateProfile();
                        displayOperationL();
                        break;
                    //UpdateInfo inside class UpdateProfile  
                    case 2://add new member
                        System.out.println("Key in new ID for a new Member :");
                        keyinID = kb.nextLine();
                        CreateMember a = new CreateMember(keyinID);
                        displayOperationL();
                        break;
                    case 3://delete member by searching id or ic 
                        DeleteUpadateMember();
                        displayOperationL();
                        break;
                    case 4://search book
                        System.out.println("Choose (Enter 3 to exit) : ");
                        System.out.println("1)Search book according category");
                        System.out.println("2)Search book according words");
                        System.out.println("3)Back");
                        choice = kb2.nextInt();
                        switch (choice) {
                            case 1:
                                SearchBook.SearchCatFULL();
                                choice = 0;
                                break;
                            case 2:
                                SearchBook.SearchWordFULL();
                                choice = 0;
                                break;
                            case 3:
                                choice = 0;
                                break;
                            default:
                                break;
                        }
                        displayOperationL();
                        break;
                    case 5://access code
                        ClearGACarraylist();
                        GACarraylist();
                        DOAccessCode();
                        displayOperationL();
                        break;
                    case 6://in a category (add book)
                        BookDatabase.AddBook();                           //JF
                        displayOperationL();
                        break;
                    case 7://in a category (delete book)   
                        DeleteB c = new DeleteB();            //JF
                        displayOperationL();
                        break;
                    case 8:
                        System.out.println("Choose (Enter 3 to exit)");
                        System.out.println("1)Borrow Book");
                        System.out.println("2)Return Book");
                        System.out.println("3)Back");
                        choice = kb2.nextInt();
                        switch (choice) {
                            case 1:
                                BorrowB d = new BorrowB();
                                choice = 0;
                                break;
                            case 2:
                                ReturnB e = new ReturnB();
                                choice = 0;
                                break;
                            case 3:
                                choice = 0;
                                break;
                            default:
                                break;
                        }
                        displayOperationL();
                        break;
                    case 9:
                        System.out.println("Choose (Enter 3 to exit)");
                        System.out.println("1)Clock In");
                        System.out.println("2)Clock Out");
                        System.out.println("3)Back");
                        choice = kb2.nextInt();
                        switch (choice) {
                            case 1:
                                ClockIn();
                                choice = 0;
                                break;
                            case 2:
                                ClockOut();
                                choice = 0;
                                break;
                            case 3:
                                choice = 0;
                                break;
                            default:
                                break;

                        }
                        displayOperationL();
                        break;
                    case 10:
                        break OVERALL;
                    default:
                        break OVERALL;
                }
            } while (op <= 10);

        }
    }

    public static void ClearGACarraylist() {
        ACCESSCODE.clear();
    }

    public static void GACarraylist() {
        try {
            Scanner inaccesscode = new Scanner(new FileInputStream("accesscode.txt"));
            while (inaccesscode.hasNextInt()) {
                ACbox[0] = inaccesscode.nextInt();
                ACCESSCODE.add(ACbox[0]);
            }
            inaccesscode.close();
        } catch (IOException e) {
            System.out.println("File Intput Problem");
        }
    }

    public static void DOAccessCode() {
        int present = 0;
        try {
            PrintWriter outaccesscode = new PrintWriter(new FileOutputStream("accesscode.txt"));
            do {
                code = g.nextInt();
                for (int i = 0; i < ACCESSCODE.size(); i++) {
                    if (code != ACCESSCODE.get(i)) {
                        ACCESSCODE.add(code);
                        for (int j = 0; j < ACCESSCODE.size(); j++) {
                            outaccesscode.println(ACCESSCODE.get(j));
                        }
                        System.out.println("ACCESS CODE :" + code);
                        present = 1;
                        break;
                    }
                }
            } while (present == 0);
            outaccesscode.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }
    }

    public static void LUpdateProfile() {
        // Scanner trial = new Scanner(System.in);
        System.out.print("Change password (Y/N)?\nYes-Y\nNo-N： ");
        Lans = kb.nextLine().charAt(0);
        //if Yes
        if (Lans == 'Y' || Lans == 'y') {
            Stop:
            {
                //call you key in ori password
                while (Lset < 1) {
                    System.out.print("Original password (Enter '-1' to exit the changing of password ): ");
                    // variable password need to be changed
                    Lppassword = kb.nextLine();
                    if (Lppassword.equals(LPASSWORD.get(index))) {
                        Lset = 1;
                    }
                    if (Lppassword.equals("-1")) {
                        break Stop;
                    }
                    if (!Lppassword.equals(LPASSWORD.get(index))) {
                        System.out.println("Wrong original password please reenter");
                    }

                }

                System.out.println("NOTE: If new password not equal to reenter password , \nit will keep repeating to ask you insert the password again.\nEnter '-1' to exit");
                //if password1 != passwordf redo until correct or else -1 to exit
                System.out.println("[AVOID TO USE ';' in the password]");
                do {
                    //password 1 is the new password
                    System.out.print("New password (6-12digit): ");
                    Lpassword1 = kb.nextLine();
                    if (Lpassword1.equals("-1")) {
                        break Stop;
                    }
                    //passwordf is the reentered new password
                    System.out.print("Reenter password (6-12digit): ");
                    Lpasswordf = kb.nextLine();
                } while (!Lpassword1.equals(Lpasswordf));
                //after changing the password , update the password
                if (Lpassword1.equals(Lpasswordf)) {
                    LPASSWORD.set(index, Lpasswordf);
                }
            }
        } else if (Lans == 'N' || Lans == 'n') {
            System.out.println("You are not changing the password , please continue to the others info.");
        }

        System.out.println("Type '-' if unchange. ");
        System.out.println("Original Address : " + LADDRESS.get(index));
        System.out.print("New Address : ");
        Laddress = kb1.nextLine();

        if (!Laddress.equals("-")) {
            LADDRESS.set(index, Laddress);
        }

        System.out.println("Type '-' if unchange. ");
        System.out.println("Original Phone number : " + LPHONENUM.get(index));
        System.out.print("New Phone number: ");
        Lphonenum = kb1.nextLine();

        if (!Lphonenum.equals("-")) {
            LPHONENUM.set(index, Lphonenum);
        }
        CreateLibrarian.ConvertandUpdateL();

    }

    public static void displayOperationL() {
        System.out.println("Wish to continue operation ?  (Enter 10 to log out)");
        System.out.println("1)Update Profile");
        System.out.println("2)Add new Members for registration"); // new member should fill up the form and pay for registration fee
        System.out.println("3)Delete member");
        System.out.println("4)Search book");//according category & words
        System.out.println("5)Renew membership(Generate Access Code)");
        System.out.println("6)Add book in a specific category");//Add (specific book in a category)
        System.out.println("7)Delete book in a specific category"); //Delete (specific book in a category)
        System.out.println("8)Book Operation");//Borrow and Returns Book
        System.out.println("9)Clock in/Clock out");// clock in clock out
        System.out.println("10)Log out");//second switch for operation
        op = kb2.nextInt();
    }

    public static void DeleteUpadateMember() {
        done=0;
        System.out.println("DELETE MEMBER");
        while (done == 0) {
            System.out.println("Please enter the ID or IC : ");
            enter = kb1.nextLine();
            CreateMember.ClearMemAL();
            CreateMember.runmemberid();
            for (int w = 0; w < ID.size(); w++) {
                if (enter.equals(ID.get(w)) || enter.equals(IC.get(w))) {
                    int delete = w;
                    System.out.println(MEMINFO.get(delete));
                    System.out.println("Delete Successfully");
                    MEMINFO.remove(delete);
                    done = 1;
                    break;
                }
            
            }
            if (done == 1) {
                String[] MEMINFOarr = new String[MEMINFO.size()];
                MEMINFO.toArray(MEMINFOarr);
                try {
                    PrintWriter outmember = new PrintWriter(new FileOutputStream("member.txt"));
                    for (int j = 0; j < MEMINFO.size(); j++) {
                        outmember.println(MEMINFOarr[j]);
                    }
                    outmember.close();
                } catch (IOException e) {
                    System.out.println("File Output Problem");
                }
                break;
            }
            if(done==0){
                    System.out.println("No such ID/IC.");
                    break;
                }
            }
        }
    

    public static ArrayList<Integer> getACCESSCODE() {
        return ACCESSCODE;
    }

    public static void ClockOut() {
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        String timeStamp2 = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        String[] clock = new String[4];
        clock[0] = LID.get(index);
        clock[1] = "-";
        clock[2] = timeStamp2;
        clock[3] = timeStamp;
        //clockinout.txt
        //id;;;clockin;;;clockout;;;date
        try {
            PrintWriter outclockout = new PrintWriter(new FileOutputStream("clockInOut.txt", true));
            outclockout.println(clock[0] + ";;;" + clock[1] + ";;;" + clock[2] + ";;;" + clock[3]);
           // System.out.println(clock[0] + ";;;" + clock[1] + ";;;" + clock[2] + ";;;" + clock[3]);
            System.out.println("Clock Out Succssfully !");
            System.out.println(clock[3] + " at " + clock[2]);
            outclockout.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }
    }

    public static void ClockIn() {
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        String timeStamp2 = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
        String[] clock = new String[4];
        clock[0] = LID.get(index);
        clock[1] = timeStamp2;
        clock[2] = "-";
        clock[3] = timeStamp;
        //clockinout.txt
        //id;;;clockin;;;clockout;;;date
        try {
            PrintWriter outclockin = new PrintWriter(new FileOutputStream("clockInOut.txt", true));
            outclockin.println(clock[0] + ";;;" + clock[1] + ";;;" + clock[2] + ";;;" + clock[3]);
          //  System.out.println(clock[0] + ";;;" + clock[1] + ";;;" + clock[2] + ";;;" + clock[3]);
            System.out.println("Clock In Successfully ! ");
            System.out.println(clock[3] + " at " + clock[1]);
            outclockin.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }
    }
}
