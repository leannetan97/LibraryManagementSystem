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
 * @author yan
 */
public class CreateHLibrarian {

    private Scanner kb = new Scanner(System.in);
    private Scanner kb2 = new Scanner(System.in);//fot int
    private int Hset = 0;
    protected String HLid, HLpassword, HLname, HLic, HLgender, HLposition, HLaddress, HLphonenum, HLstartworkingdate;
    protected static ArrayList<String> HLID = new ArrayList<>();
    protected static ArrayList<String> HLPASSWORD = new ArrayList<>();
    protected static ArrayList<String> HLNAME = new ArrayList<>();
    protected static ArrayList<String> HLIC = new ArrayList<>();
    protected static ArrayList<String> HLPOSITION = new ArrayList<>();
    protected static ArrayList<String> HLGENDER = new ArrayList<>();
    protected static ArrayList<String> HLADDRESS = new ArrayList<>();
    protected static ArrayList<String> HLPHONENUM = new ArrayList<>();
    protected static ArrayList<String> HLSWORKING = new ArrayList<>();
    private static String[] store = new String[9];

    public CreateHLibrarian(String identity) {
        HLid = identity;
        runHlibrarianid();
        CheckHlibrarianid(HLid);
        if (Hset != 1) {
            System.out.println("Really wish to create a new member ?\n[Enter '1' to EXIT]\n[Enter '0' to continue] ");
            Hset = kb2.nextInt();
        }
        while (Hset != 1) {
            HlibrarianBasicInfo(HLid);
            StoreHlibrarianInfo();
            ClearHLibrarianAL();
            break;
        }
    }
// HLIBRARIAN TXT
//HLid+";;;"+HLpassword+";;;"+HLname+";;;"+HLic+";;;"+HLgender+";;;"+HLposition+";;;"+HLaddress+";;;"+HLphonenum+";;;"+HLstartworkingdate   

    public void HlibrarianBasicInfo(String HLid) {
        System.out.print("New profile for a head librarian");
        System.out.print("\nID : " + HLid);
        System.out.print("\nPassword(temporary)(6-12digit)[AVOID TO USE ';' in the password]: ");
        HLpassword = kb.nextLine();
        System.out.print("Name : ");
        HLname = kb.nextLine();
        System.out.print("I/C : ");
        HLic = kb.nextLine();
        System.out.print("Gender (M / F) : ");
        HLgender = kb.nextLine();
        HLposition = "Head Librarian";
        System.out.println("Position :" + HLposition);
        System.out.print("Address : ");
        HLaddress = kb.nextLine();
        System.out.print("Phone number : ");
        HLphonenum = kb.nextLine();
        System.out.print("Start working date(DD/MM/YYYY) :");
        HLstartworkingdate = kb.nextLine();
    }

    public static void runHlibrarianid() {
        try {
            Scanner inHlibrarian = new Scanner(new FileInputStream("Hlibrarian.txt"));
            while (inHlibrarian.hasNextLine()) {
                String a = inHlibrarian.nextLine();
                int counter = 0;
                //to split the string into arrayList
                for (String retrieve : a.split(";;;")) {
                    store[counter] = retrieve;
                    counter++;
                }
                HLID.add(store[0]);
                HLPASSWORD.add(store[1]);
                HLNAME.add(store[2]);
                HLIC.add(store[3]);
                HLGENDER.add(store[4]);
                HLPOSITION.add(store[5]);
                HLADDRESS.add(store[6]);
                HLPHONENUM.add(store[7]);
                HLSWORKING.add(store[8]);
            }
            inHlibrarian.close();
        } catch (IOException e) {
            System.out.println("File Input Problem.");
        }
    }

    public void CheckHlibrarianid(String Lid) {
        if (HLID.contains(Lid)) {
            System.out.println("Sorry,ID has been used. Reenter a new one.");
            Hset = 1;
        }
    }

    public void StoreHlibrarianInfo() {
        try {
            PrintWriter outlibrarian = new PrintWriter(new FileOutputStream("Hlibrarian.txt", true));
            outlibrarian.println(HLid + ";;;" + HLpassword + ";;;" + HLname + ";;;" + HLic + ";;;" + HLgender + ";;;" + HLposition + ";;;" + HLaddress + ";;;" + HLphonenum + ";;;" + HLstartworkingdate);
            outlibrarian.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }

    }

    public static void ClearHLibrarianAL() {
        HLID.clear();
        HLPASSWORD.clear();
        HLNAME.clear();
        HLIC.clear();
        HLPOSITION.clear();
        HLGENDER.clear();
        HLADDRESS.clear();
        HLPHONENUM.clear();
        HLSWORKING.clear();

    }

// HLIBRARIAN TXT
//HLid+";;;"+HLpassword+";;;"+HLname+";;;"+HLic+";;;"+HLgender+";;;"+HLposition+";;;"+HLaddress+";;;"+HLphonenum+";;;"+HLstartworkingdate  
    public static void ConvertandUpdateHL() {

//Convert ArrayList into Array
//Array name
        String[] HLIDarr = new String[HLID.size()];
        String[] HLPASSarr = new String[HLPASSWORD.size()];
        String[] HLNAMEarr = new String[HLNAME.size()];
        String[] HLICarr = new String[HLIC.size()];
        String[] HLGENDERarr = new String[HLGENDER.size()];
        String[] HLPOSarr = new String[HLPOSITION.size()];
        String[] HLADDarr = new String[HLADDRESS.size()];
        String[] HLPHONEarr = new String[HLPHONENUM.size()];
        String[] HLSWarr = new String[HLSWORKING.size()];
        HLID.toArray(HLIDarr);
        HLPASSWORD.toArray(HLPASSarr);
        HLNAME.toArray(HLNAMEarr);
        HLIC.toArray(HLICarr);
        HLGENDER.toArray(HLGENDERarr);
        HLPOSITION.toArray(HLPOSarr);
        HLADDRESS.toArray(HLADDarr);
        HLPHONENUM.toArray(HLPHONEarr);
        HLSWORKING.toArray(HLSWarr);

        try {
            PrintWriter outlibrarian = new PrintWriter(new FileOutputStream("Hlibrarian.txt"));
            for (int j = 0; j < HLIDarr.length; j++) {
                outlibrarian.println(HLIDarr[j] + ";;;" + HLPASSarr[j] + ";;;" + HLNAMEarr[j] + ";;;" + HLICarr[j] + ";;;" + HLGENDERarr[j] + ";;;" + HLPOSarr[j] + ";;;" + HLADDarr[j] + ";;;" + HLPHONEarr[j] + ";;;" + HLSWarr[j]);
            }
            outlibrarian.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }
    }

    public static ArrayList<String> getHLID() {
        return HLID;
    }

    public static ArrayList<String> getHLPASSWORD() {
        return HLPASSWORD;
    }

    public static ArrayList<String> getHLADDRESS() {
        return HLADDRESS;
    }

    public static ArrayList<String> getHLNAME() {
        return HLNAME;
    }

    public static ArrayList<String> getHLPHONENUM() {
        return HLPHONENUM;
    }


}
