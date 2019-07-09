package System;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author yan
 */
// MEMBER TXT
// (id+";;;"+password+";;;"+name+";;;"+ic+";;;"+matricno+";;;"+gender+";;;"+address+";;;"+phonenum+";;;"+age+";;;"+activedate+";;;"+expireddate)
public class Member {

    protected static ArrayList<String> ADDRESS = CreateMember.getADDRESS();
    protected static ArrayList<String> PHONENUM = CreateMember.getPHONENUM();
    protected static ArrayList<String> PASSWORD = CreateMember.getPASSWORD();
    protected static ArrayList<String> NAME = CreateMember.getNAME();
    protected static ArrayList<String> ID = CreateMember.getID();
    protected static ArrayList<String> AGE = CreateMember.getAGE();
    protected static ArrayList<String> ACTIVEDATE = CreateMember.getACDATE();
    protected static ArrayList<String> EXPIREDDATE = CreateMember.getEXDATE();
    protected static ArrayList<Integer> ACCESSCODE = Librarian.getACCESSCODE();
    private static Scanner kb = new Scanner(System.in);
    private static Scanner kb1 = new Scanner(System.in);
    private static Scanner kb2 = new Scanner(System.in);
    private static char ans;
    private static String id, password, ppassword, address, phonenum, password1, passwordf, accesscode;
    private static int op, index = 0, set=0, call = 0, accode;

    //Member
    public Member() {
        //LoginM(ID, password); //after login show all profile information
        MemberLogin();
    }

    private static void MemberLogin() {
        OVERALL:
        {
            System.out.println("【Member】\nPlease enter your ID and password");
            System.out.print("ID:");
            id = kb.nextLine();
            CreateMember.ClearMemAL();
            CreateMember.runmemberid();
            if (ID.contains(id)) {
                for (int i = 0; i < ID.size(); i++) {
                    if (ID.get(i).equals(id)) {
                        index = i;
                        op = 0;
                    }
                }
            } else {
                //new member should fill in a form and register at the counter
                System.out.println("Sorry worng ID / Please register as a member at the counter");
                op = 5;
            }
            while (op < 5) {

                System.out.print("Password:");
                password = kb.nextLine();
                if (password.equals(PASSWORD.get(index))) {
                    System.out.println("Login Sucessful\nHi,Welcome back " + NAME.get(index));
                    System.out.println("\nPlease select your operation");
                    System.out.println("1)Update Profile");
                    System.out.println("2)Search book according category");
                    System.out.println("3)Search book according words");
                    System.out.println("4)Renew membership");
                    System.out.println("5)Log out");                        //second switch for operation
                    op = kb2.nextInt();
                    break;
                } else {
                    System.out.println("Fail to login(Wrong password/ID), please log in again.");
                    op = 5;
                }
            }
            do {
                switch (op) {
                    case 1:
                        UpdateProfile();
                        break;
                    //UpdateInfo inside class UpdateProfile  
                    case 2:
                        SearchBook.SearchCat();
                        displayOperationM();
                        break;
                    case 3:
                       SearchBook.SearchWord();
                        displayOperationM();
                        break;
                    case 4:
                        RenewMember();
                        displayOperationM();
                        break;
                    case 5:
                        break OVERALL;
                    default:
                        break OVERALL;
                }
            } while (op <= 5);

        }
    }

    // (id+";;;"+password+";;;"+name+";;;"+ic+";;;"+matricno+";;;"+gender+";;;"+address+";;;"+phonenum+";;;"+age+";;;"+activedate+";;;"+expireddate)
    public static void UpdateProfile() {
        
        // Scanner trial = new Scanner(System.in);
        System.out.print("Change password (Y/N)?\nYes-Y\nNo-N： ");
        ans = kb.nextLine().charAt(0);
        //if Yes
        if (ans == 'Y' || ans == 'y') {
            Stop:
            {
                //call you key in ori password
                while (set < 1) {
                    System.out.print("Original password (Enter '-1' to exit the changing of password ): ");
                    // variable password need to be changed
                    ppassword = kb.nextLine();
                    if (ppassword.equals(PASSWORD.get(index))) {
                        set = 1;
                    }
                    if (ppassword.equals("-1")) {
                        break Stop;
                    }
                    if (!ppassword.equals(PASSWORD.get(index))) {
                        System.out.println("Wrong original password please reenter");
                    }

                }

                System.out.println("NOTE: If new password not equal to reenter password , \nit will keep repeating to ask you insert the password again.\nEnter '-1' to exit");
                System.out.println("[AVOID TO USE ';' in the password]");
//if password1 != passwordf redo until correct or else -1 to exit
                do {
                    //password 1 is the new password
                    System.out.print("New password (6-12digit): ");
                    password1 = kb.nextLine();
                    if (password1.equals("-1")) {
                        break Stop;
                    }
                    //passwordf is the reentered new password
                    System.out.print("Reenter password (6-12digit): ");
                    passwordf = kb.nextLine();
                } while (!password1.equals(passwordf));
                //after changing the password , update the password
                if (password1.equals(passwordf)) {
                    PASSWORD.set(index, passwordf);
                }
            }
        } else if (ans == 'N' || ans == 'n') {
            System.out.println("You are not changing the password , please continue to the others info.");
        }

        System.out.println("Type '-' if unchange. ");
        System.out.println("Original Address : " + ADDRESS.get(index));
        System.out.print("New Address : ");
        address = kb1.nextLine();

        if (!address.equals("-")) {
            ADDRESS.set(index, address);
        }

        System.out.println("Type '-' if unchange. ");
        System.out.println("Original Phone number : " + PHONENUM.get(index));
        System.out.print("New Phone number: ");
        phonenum = kb1.nextLine();

        if (!phonenum.equals("-")) {
            PHONENUM.set(index, phonenum);
        }
        CreateMember.ConvertandUpdateM();

        displayOperationM();

    }

    public static void RenewMember() {
        System.out.println("If your membership expired, you are required to go to counter and buy for a renew membership access code.");
        System.out.println("Your membership's Active date : " + ACTIVEDATE.get(index));
        System.out.println("Your membership's Expired date : " + EXPIREDDATE.get(index));
        do {
            System.out.println("Please Enter your accesscode (Enter 'N' to exit): ");
            //System.out.println("NOTE: When you renew your Membership(The new active date will start from your previous expired date)");
            accesscode = kb1.nextLine();
            if (!accesscode.equals("N")) {
                accode = Integer.parseInt(accesscode);
                Librarian.ACCESSCODE.clear();
                Librarian.GACarraylist();
                for (int q = 0; q < ACCESSCODE.size(); q++) {
                    if (accode == ACCESSCODE.get(q)) {
                        String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
                        ACTIVEDATE.set(index, timeStamp);
                        String[] ex = timeStamp.split("/");
                        int h = Integer.parseInt(ex[2]);
                        int year = h + 1;
                        EXPIREDDATE.set(index, ex[0] + "/" + ex[1] + "/" + year);
                        int age = Integer.parseInt(AGE.get(index)) + 1;
                        String aage = String.valueOf(age);
                        AGE.set(index, aage);
                        CreateMember.ConvertandUpdateM();
                        ACCESSCODE.remove(q);
                        call = 1;
                        UpdateAccessCode();
                        System.out.println("Renew successful");
                        break;
                    }
                }
                if (call == 0) {
                    System.out.println("Access code is invalid.\nPlease try again.");
                }
            } else {
                System.out.println("You are not renewing your membership");
                call = 1;
                break;
            }
        } while (call < 1);
    }

    public static void UpdateAccessCode() {
        try {
            PrintWriter outaccesscode = new PrintWriter(new FileOutputStream("accesscode.txt"));
            for (int j = 0; j < ACCESSCODE.size(); j++) {
                outaccesscode.println(ACCESSCODE.get(j));
            }
            outaccesscode.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }
    }

    public static void displayOperationM() {
        System.out.println("Wish to continue operation ?  (Enter 5 to log out)");
        System.out.println("1)Update Profile");
        System.out.println("2)Search book according category");
        System.out.println("3)Search book according words");
        System.out.println("4)Renew membership");
        System.out.println("5)Log out");
        op = kb2.nextInt();
    }

}
