/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

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
public class HLibrarian {

    protected static ArrayList<String> LIC = CreateLibrarian.getLIC();
    protected static ArrayList<String> LID = CreateLibrarian.getLID();
    protected static ArrayList<String> LIBRARIANINFO = CreateLibrarian.getLIBRARIANINFO();
    protected static ArrayList<String> HLADDRESS = CreateHLibrarian.getHLADDRESS();
    protected static ArrayList<String> HLPHONENUM = CreateHLibrarian.getHLPHONENUM();
    protected static ArrayList<String> HLPASSWORD = CreateHLibrarian.getHLPASSWORD();
    protected static ArrayList<String> HLNAME = CreateHLibrarian.getHLNAME();
    protected static ArrayList<String> HLID = CreateHLibrarian.getHLID();
    protected static ArrayList<Integer> HACCESSCODE = new ArrayList<>();
    private static String HLid, HLpassword, HLppassword, HLaddress, HLphonenum, HLpassword1, HLpasswordf, keyinID, enter;
    private static char HLans;
    private static int index, op, choice, HLset = 0, done = 0;
    private static Scanner kb = new Scanner(System.in); // for member info
    private static Scanner kb1 = new Scanner(System.in);// for address,num...
    private static Scanner kb2 = new Scanner(System.in);//for INT

    public HLibrarian() {
        HLibrarianLogin();
    }

    public static void HLibrarianLogin() {
        OVERALL:
        {
            System.out.println("【Head Librarian】\nPlease enter your ID and password");
            System.out.print("ID:");
            HLid = kb.nextLine();
            CreateHLibrarian.ClearHLibrarianAL();
            CreateHLibrarian.runHlibrarianid();
            if (HLID.contains(HLid)) {
                for (int i = 0; i < HLID.size(); i++) {
                    if (HLID.get(i).equals(HLid)) {
                        index = i;
                        op = 0;
                    }
                }
            } else {
                //head librian login only
                System.out.println("Sorry worng ID.(This is only for head librarian to login)");
                op = 10;
            }
            while (op < 10) {
                System.out.print("Password:");
                HLpassword = kb.nextLine();
                if (HLpassword.equals(HLPASSWORD.get(index))) {
                    System.out.println("Login Sucessful\nHi,Welcome back " + HLNAME.get(index));
                    System.out.println("\nPlease select your operation");
                    System.out.println("1)Update Profile");
                    System.out.println("2)Add/Delete Librarian or ADD Head Librarian");
                    System.out.println("3)Add/Delete member");
                    System.out.println("4)Search book");//according category & words
                    System.out.println("5)Renew membership(Generate Access Code)");
                    System.out.println("6)Add book in a specific category"); //Add (specific book in a category)
                    System.out.println("7)Delete book in a specific category"); //Delete (specific book in a category)
                    System.out.println("8)Book Operation");//Borrow and Returns Book
                    System.out.println("9)View Report");
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
                        HLUpdateProfile();
                        displayOperationHL();
                        break;
                    //UpdateInfo inside class UpdateProfile  
                    case 2://add new librarian &delete                                  //delete librairan
                        System.out.println("Choice (Enter 3 to exit) : ");
                        System.out.println("1)Add Librarian");
                        System.out.println("2)Delete Librarian");
                        System.out.println("3)Add Head Librarian");
                        System.out.println("4)Back");
                        choice = kb2.nextInt();
                        switch (choice) {
                            case 1://add librarian
                                System.out.println("Key in new ID for a new Librarian :");
                                keyinID = kb.nextLine();
                                CreateLibrarian a = new CreateLibrarian(keyinID);
                                choice = 0;
                                break;
                            case 2://delete librarian
                                DeleteUpadateLibrarian();
                                choice = 0;
                                break;
                            case 3://ADD Head Librarian
                                System.out.println("Key in new ID for a new head Librarian :");
                                keyinID = kb.nextLine();
                                CreateHLibrarian b = new CreateHLibrarian(keyinID);
                                choice = 0;
                                break;
                            case 4:
                                choice = 0;
                                break;
                            default:
                                break;
                        }
                        displayOperationHL();
                        break;
                    case 3://delete member by searching id or ic 
                        System.out.println("Choice (Enter 3 to exit) : ");
                        System.out.println("1)Add new member");
                        System.out.println("2)Delete member");
                        System.out.println("3)Back");
                        choice = kb2.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("Key in new ID for a new Member :");
                                keyinID = kb.nextLine();
                                CreateMember a = new CreateMember(keyinID);
                                choice = 0;
                                break;
                            case 2:
                                Librarian.DeleteUpadateMember();
                                choice = 0;
                                break;
                            case 3:
                                choice = 0;
                                break;
                            default:
                                break;
                        }
                        displayOperationHL();
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
                        displayOperationHL();
                        break;
                    case 5://access code
                        Librarian.ClearGACarraylist();
                        Librarian.GACarraylist();
                        Librarian.DOAccessCode();
                        displayOperationHL();
                        break;
                    case 6:  //in a category (add book) 
                        BookDatabase.AddBook();     //JF
                        displayOperationHL();
                        break;
                    case 7://in a category (delete book)                 //JF
                        DeleteB c = new DeleteB();
                        displayOperationHL();
                        break;
                    case 8://book operation                                             //JF
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
                        displayOperationHL();
                        break;
                    case 9://report                                         //JF
                        System.out.println("1)General Report");
                        System.out.println("2)Duty Report");
                        System.out.println("3)Member's Report");
                        System.out.println("4)Librarian's Report");
                        System.out.println("5)Books' Report");
                        System.out.println("6)Borrowed Books' Report");
                        System.out.println("7)Back");
                        choice = kb2.nextInt();
                        switch (choice) {
                            case 1:
                                System.out.println("【General Report】");
                                Report b = new Report();
                                Report.GeneralReport();
                                System.out.println("");
                                choice = 0;
                                break;
                            case 2:
                                System.out.println("【Duty Report】");
                                Report a = new Report();
                               //  System.out.println("ClockIn\t\tClockOut\t\tDate");
                                Report.DutyReport();
                                choice = 0;
                                System.out.println("");
                                break;
                            case 3:
                                System.out.println("【Member's Report】");
                                Report f = new Report();
                                System.out.println("ID\t\t|Name\t\t|IC\t\t|Matric no.\t\t|Gender\t\t|Address\t\t\t\t\t|Phone No.\t\t|AGE\t\t|ActiveDate\t\t|ExpiredDate\t\t |");
                                Report.Listmem();
                                System.out.println("");
                                choice = 0;
                                break;
                            case 4:
                                System.out.println("【Librarian's Report】");
                                Report d = new Report();
                                System.out.println("ID\t\t|NAME\t\t\t\t|IC\t\t|Gender\t\t|POSITION\t\t|ADDRESS\t\t\t\t\t\t|PHONE NO.\t\t|START WORKING DATE");
                                Report.Listlib();
                                System.out.println("");
                                choice = 0;
                                break;
                            case 5:
                                System.out.println("【Books' Report】");
                                Report g = new Report();
                                System.out.println("BookName\t\t\t\t\t\t|BookID\t\t\t\t|Author\t\t\t\t|Classification code\t\t\t\t|Book ISBN\t\t\t\t|Book Avalibility");
                                Report.Listbooks();
                                System.out.println("");
                                choice = 0;
                            case 6:
                                System.out.println("【Borrowed Books' Report】");
                                Report q = new Report();
//                                System.out.println("MEMBER'sID\t\t|BOOK ID\t\t|DATE");
                                Report.ListBorrow();
                                System.out.println("");
                                choice = 0;
                            default:
                                break;
                        }
                        displayOperationHL();
                        break;
                    case 10:
                        break OVERALL;
                    default:
                        break OVERALL;
                }
            } while (op <= 10);

        }
    }

    public static void HLUpdateProfile() {
        // Scanner trial = new Scanner(System.in);
        System.out.print("Change password (Y/N)?\nYes-Y\nNo-N： ");
        HLans = kb.nextLine().charAt(0);
        //if Yes
        if (HLans == 'Y' || HLans == 'y') {
            Stop:
            {
                //call you key in ori password
                while (HLset < 1) {
                    System.out.print("Original password (Enter '-1' to exit the changing of password ): ");
                    // variable password need to be changed
                    HLppassword = kb.nextLine();
                    if (HLppassword.equals(HLPASSWORD.get(index))) {
                        HLset = 1;
                    }
                    if (HLppassword.equals("-1")) {
                        break Stop;
                    }
                    if (!HLppassword.equals(HLPASSWORD.get(index))) {
                        System.out.println("Wrong original password please reenter");
                    }

                }

                System.out.println("NOTE: If new password not equal to reenter password , \nit will keep repeating to ask you insert the password again.\nEnter '-1' to exit");
                //if password1 != passwordf redo until correct or else -1 to exit
                System.out.println("[AVOID TO USE ';' in the password]");
                do {
                    //password 1 is the new password
                    System.out.print("New password (6-12digit): ");
                    HLpassword1 = kb.nextLine();
                    if (HLpassword1.equals("-1")) {
                        break Stop;
                    }
                    //passwordf is the reentered new password
                    System.out.print("Reenter password (6-12digit): ");
                    HLpasswordf = kb.nextLine();
                } while (!HLpassword1.equals(HLpasswordf));
                //after changing the password , update the password
                if (HLpassword1.equals(HLpasswordf)) {
                    HLPASSWORD.set(index, HLpasswordf);
                }
            }
        } else if (HLans == 'N' || HLans == 'n') {
            System.out.println("You are not changing the password , please continue to the others info.");
        }

        System.out.println("Type '-' if unchange. ");
        System.out.println("Original Address : " + HLADDRESS.get(index));
        System.out.print("New Address : ");
        HLaddress = kb1.nextLine();

        if (!HLaddress.equals("-")) {
            HLADDRESS.set(index, HLaddress);
        }

        System.out.println("Type '-' if unchange. ");
        System.out.println("Original Phone number : " + HLPHONENUM.get(index));
        System.out.print("New Phone number: ");
        HLphonenum = kb1.nextLine();

        if (!HLphonenum.equals("-")) {
            HLPHONENUM.set(index, HLphonenum);
        }
        CreateHLibrarian.ConvertandUpdateHL();

    }

    public static void DeleteUpadateLibrarian() {
        done = 0;
        System.out.println("DELETE LIBRARIAN");
        while (done == 0) {
            System.out.println("Please enter the ID or IC : ");
            enter = kb1.nextLine();
            CreateLibrarian.ClearLibrarianAL();
            CreateLibrarian.runlibrarianid();
            for (int w = 0; w < LID.size(); w++) {
                if (enter.equals(LID.get(w)) || enter.equals(LIC.get(w))) {
                    int delete = w;
                    System.out.println(LIBRARIANINFO.get(delete));
                    System.out.println("Delete Successfully");
                    LIBRARIANINFO.remove(delete);
                    done = 1;
                    break;
                }
            }
            if (done == 1) {
                String[] LIBRARIANINFOarr = new String[LIBRARIANINFO.size()];
                LIBRARIANINFO.toArray(LIBRARIANINFOarr);
                try {
                    PrintWriter outmember = new PrintWriter(new FileOutputStream("librarian.txt"));
                    for (int j = 0; j < LIBRARIANINFO.size(); j++) {
                        outmember.println(LIBRARIANINFOarr[j]);
                    }
                    outmember.close();
                } catch (IOException e) {
                    System.out.println("File Output Problem");
                }
                break;
            }
            if (done == 0) {
                System.out.println("No such ID/IC.");
                break;
            }
        }
    }


    public static void displayOperationHL() {
        System.out.println("Wish to continue operation ?  (Enter 10 to log out)");
        System.out.println("Please select your operation");
        System.out.println("1)Update Profile");
        System.out.println("2)Add/Delete Librarian or ADD Head Librarian");
        System.out.println("3)Add/Delete member");
        System.out.println("4)Search book");//according category & words
        System.out.println("5)Renew membership(Generate Access Code)");
        System.out.println("6)Add book in a specific category"); //Add (specific book in a category)
        System.out.println("7)Delete book in a specific category"); //Delete (specific book in a category)
        System.out.println("8)Book Operation");//Borrow and Returns Book
        System.out.println("9)View Report");
        System.out.println("10)Log out");//second switch for operation
        op = kb2.nextInt();
    }
}
