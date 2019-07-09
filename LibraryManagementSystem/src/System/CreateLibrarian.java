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
 * @author LayYan
 */
public class CreateLibrarian {

    private Scanner kb = new Scanner(System.in);
    private Scanner kb2 = new Scanner(System.in);//fot int
    private int Lset = 0;
    protected String Lid, Lpassword, Lname, Lic, Lgender, Lposition, Laddress, Lphonenum, Lstartworkingdate;
    protected static ArrayList<String> LIBRARIANINFO = new ArrayList<>();
    protected static ArrayList<String> LID = new ArrayList<>();
    protected static ArrayList<String> LPASSWORD = new ArrayList<>();
    protected static ArrayList<String> LNAME = new ArrayList<>();
    protected static ArrayList<String> LIC = new ArrayList<>();
    protected static ArrayList<String> LPOSITION = new ArrayList<>();
    protected static ArrayList<String> LGENDER = new ArrayList<>();
    protected static ArrayList<String> LADDRESS = new ArrayList<>();
    protected static ArrayList<String> LPHONENUM = new ArrayList<>();
    protected static ArrayList<String> LSWORKING = new ArrayList<>();
    private static String[] store = new String[9];
    private static String[] lib = new String[1];

    public CreateLibrarian() {

    }

    public CreateLibrarian(String identity) {
        Lid = identity;
        ClearLibrarianAL();
        runlibrarianid();
        Checklibrarianid(Lid);
        if (Lset != 1) {
            System.out.println("Really wish to create a new member ?\n[Enter '1' to EXIT]\n[Enter '0' to continue] ");
            Lset = kb2.nextInt();
        }
        while (Lset != 1) {
            librarianBasicInfo(Lid);
            StorelibrarianInfo();
            break;
        }
    }
// LIBRARIAN TXT
// Lid+";;;"+Lpassword+";;;"+Lname+";;;"+Lic+";;;"+Lgender+";;;"+Lposition+";;;"+Laddress+";;;"+Lphonenum+";;;"+Lstartworkingdate  

    public void librarianBasicInfo(String Lid) {
        System.out.print("New profile for a librarian");
        System.out.print("\nID : " + Lid);
        System.out.print("\nPassword(temporary)(6-12digit)[AVOID TO USE ';' in the password]: ");
        Lpassword = kb.nextLine();
        System.out.print("Name : ");
        Lname = kb.nextLine();
        System.out.print("I/C : ");
        Lic = kb.nextLine();
        System.out.print("Gender (M / F) : ");
        Lgender = kb.nextLine();
        System.out.println("Position\n[Junior/Senior Librarian]\n :");
        Lposition = kb.nextLine();
        System.out.print("Address : ");
        Laddress = kb.nextLine();
        System.out.print("Phone number : ");
        Lphonenum = kb.nextLine();
        System.out.print("Start working date(DD/MM/YYYY) :");
        Lstartworkingdate = kb.nextLine();
    }

    public static void runlibrarianid() {
        try {
            Scanner inlibrarian = new Scanner(new FileInputStream("librarian.txt"));
            while (inlibrarian.hasNextLine()) {
                String a = inlibrarian.nextLine();
                lib[0] = a;
                int counter = 0;
                //to split the string into arrayList
                for (String retrieve : a.split(";;;")) {
                    store[counter] = retrieve;
                    counter++;
                }
                LID.add(store[0]);
                LPASSWORD.add(store[1]);
                LNAME.add(store[2]);
                LIC.add(store[3]);
                LGENDER.add(store[4]);
                LPOSITION.add(store[5]);
                LADDRESS.add(store[6]);
                LPHONENUM.add(store[7]);
                LSWORKING.add(store[8]);
                LIBRARIANINFO.add(lib[0]);
            }
            inlibrarian.close();
        } catch (IOException e) {
            System.out.println("File Input Problem.");
        }
    }

    public void Checklibrarianid(String Lid) {
        if (LID.contains(Lid)) {
            System.out.println("Sorry,ID has been used. Reenter a new one.");
            Lset = 1;
        }
    }

    public void StorelibrarianInfo() {
        try {
            PrintWriter outlibrarian = new PrintWriter(new FileOutputStream("librarian.txt", true));
            outlibrarian.println(Lid + ";;;" + Lpassword + ";;;" + Lname + ";;;" + Lic + ";;;" + Lgender + ";;;" + Lposition + ";;;" + Laddress + ";;;" + Lphonenum + ";;;" + Lstartworkingdate);
            outlibrarian.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }

    }

    public static void ClearLibrarianAL() {
        LID.clear();
        LPASSWORD.clear();
        LNAME.clear();
        LIC.clear();
        LPOSITION.clear();
        LGENDER.clear();
        LADDRESS.clear();
        LPHONENUM.clear();
        LSWORKING.clear();
        LIBRARIANINFO.clear();

    }
// LIBRARIAN TXT
// Lid+";;;"+Lpassword+";;;"+Lname+";;;"+Lic+";;;"+Lgender+";;;"+Lposition+";;;"+Laddress+";;;"+Lphonenum+";;;"+Lstartworkingdate   

    public static void ConvertandUpdateL() {

//Convert ArrayList into Array
//Array name
        String[] LIDarr = new String[LID.size()];
        String[] LPASSarr = new String[LPASSWORD.size()];
        String[] LNAMEarr = new String[LNAME.size()];
        String[] LICarr = new String[LIC.size()];
        String[] LGENDERarr = new String[LGENDER.size()];
        String[] LPOSarr = new String[LPOSITION.size()];
        String[] LADDarr = new String[LADDRESS.size()];
        String[] LPHONEarr = new String[LPHONENUM.size()];
        String[] LSWarr = new String[LSWORKING.size()];
        LID.toArray(LIDarr);
        LPASSWORD.toArray(LPASSarr);
        LNAME.toArray(LNAMEarr);
        LIC.toArray(LICarr);
        LGENDER.toArray(LGENDERarr);
        LPOSITION.toArray(LPOSarr);
        LADDRESS.toArray(LADDarr);
        LPHONENUM.toArray(LPHONEarr);
        LSWORKING.toArray(LSWarr);

        try {
            PrintWriter outlibrarian = new PrintWriter(new FileOutputStream("librarian.txt"));
            for (int j = 0; j < LIDarr.length; j++) {
                outlibrarian.println(LIDarr[j] + ";;;" + LPASSarr[j] + ";;;" + LNAMEarr[j] + ";;;" + LICarr[j] + ";;;" + LGENDERarr[j] + ";;;" + LPOSarr[j] + ";;;" + LADDarr[j] + ";;;" + LPHONEarr[j] + ";;;" + LSWarr[j]);
            }
            outlibrarian.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }
    }

    public static ArrayList<String> getLID() {
        return LID;
    }

    public static ArrayList<String> getLPASSWORD() {
        return LPASSWORD;
    }

    public static ArrayList<String> getLADDRESS() {
        return LADDRESS;
    }

    public static ArrayList<String> getLNAME() {
        return LNAME;
    }

    public static ArrayList<String> getLPHONENUM() {
        return LPHONENUM;
    }

    public static ArrayList<String> getLIC() {
        return LIC;
    }

    public static ArrayList<String> getLIBRARIANINFO() {
        return LIBRARIANINFO;
    }

}
