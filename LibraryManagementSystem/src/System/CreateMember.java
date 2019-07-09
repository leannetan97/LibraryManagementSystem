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
 * @author yan
 */
// MEMBER TXT
// (id+";;;"+password+";;;"+name+";;;"+ic+";;;"+matricno+";;;"+gender+";;;"+address+";;;"+phonenum+";;;"+age+";;;"+activedate+";;;"+expireddate)
public class CreateMember {

    //this method used to create a profile for a new member;
    private Scanner kb = new Scanner(System.in);
    private Scanner kb2 = new Scanner(System.in);//fot int
    private int set = 0;
    protected String id, password, name, ic, matricno, gender, address, phonenum, age, activedate, expireddate;
    protected static ArrayList<String> MEMINFO = new ArrayList<>();
    protected static ArrayList<String> ID = new ArrayList<>();
    protected static ArrayList<String> PASSWORD = new ArrayList<>();
    protected static ArrayList<String> NAME = new ArrayList<>();
    protected static ArrayList<String> IC = new ArrayList<>();
    protected static ArrayList<String> MATRICNO = new ArrayList<>();
    protected static ArrayList<String> GENDER = new ArrayList<>();
    protected static ArrayList<String> ADDRESS = new ArrayList<>();
    protected static ArrayList<String> PHONENUM = new ArrayList<>();
    protected static ArrayList<String> AGE = new ArrayList<>();
    protected static ArrayList<String> ACTIVEDATE = new ArrayList<>();
    protected static ArrayList<String> EXPIREDDATE = new ArrayList<>();
    private static String[] store = new String[11];
    private static String[] mem = new String[1];

    CreateMember() {

    }

    CreateMember(String identity) {
        id = identity;
        ClearMemAL();
        runmemberid();
        Checkmemberid(id);
        if (set != 1) {
            System.out.println("Really wish to create a new member ?\n[Enter '1' to EXIT]\n[Enter '0' to continue] ");
            set = kb2.nextInt();
        }
        while (set != 1) {
            memberBasicInfo(id);
            StorememberInfo();
            break;
        }

    }

    public void memberBasicInfo(String id) {
        System.out.print("New profile for a new member");
        System.out.print("\nID : " + id);
        System.out.print("\nPassword(temporary)(6-12digit)[AVOID TO USE ';' in the password]: ");
        password = kb.nextLine();
        System.out.print("Name : ");
        name = kb.nextLine();
        System.out.print("I/C : ");
        ic = kb.nextLine();
        System.out.print("Matric number : ");
        matricno = kb.nextLine();
        System.out.print("Gender (M / F) : ");
        gender = kb.nextLine();
        System.out.print("Address : ");
        address = kb.nextLine();
        System.out.print("Phone number : ");
        phonenum = kb.nextLine();
        System.out.print("Age : ");
        age = kb.nextLine();
        String timeStamp = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
        activedate = timeStamp;
        System.out.print("Active date(DD/MM/YYYY) : " + activedate);
        System.out.print("\nExpired date(DD/MM/YYYY)[membership just valid for 1 year]: ");
        expireddate = kb.nextLine();
    }

    public static void runmemberid() {
        try {
            Scanner inmember = new Scanner(new FileInputStream("member.txt"));
            while (inmember.hasNextLine()) {
                String a = inmember.nextLine();
                mem[0] = a;
                int counter = 0;
                //to split the string into arrayList
                for (String retrieve : a.split(";;;")) {
                    store[counter] = retrieve;
                    counter++;
                }
//String[] bobo = a.split(";;;");
//                for (int i = 0; i < 11; i++) {
//                    store[counter] =bobo[i] ;
//                }
                ID.add(store[0]);
                PASSWORD.add(store[1]);
                NAME.add(store[2]);
                IC.add(store[3]);
                MATRICNO.add(store[4]);
                GENDER.add(store[5]);
                ADDRESS.add(store[6]);
                PHONENUM.add(store[7]);
                AGE.add(store[8]);
                ACTIVEDATE.add(store[9]);
                EXPIREDDATE.add(store[10]);
                MEMINFO.add(mem[0]);
            }
            inmember.close();
        } catch (IOException e) {
            System.out.println("File Input Problem.");
        }
    }

    public void Checkmemberid(String id) {
        if (ID.contains(id)) {
            System.out.println("Sorry, ID has been used. Reenter a new one.");
            set = 1;
        }
    }

    public void StorememberInfo() {

        //  StoreMemInfo_arr.add(id+";;;"+password+";;;"+name+";;;"+ic+";;;"+matricno+";;;"+gender+";;;"+address+";;;"+phonenum+";;;"+age+";;;"+activedate+";;;"+expireddate);
        try {
            PrintWriter outmember = new PrintWriter(new FileOutputStream("member.txt", true));
            outmember.println(id + ";;;" + password + ";;;" + name + ";;;" + ic + ";;;" + matricno + ";;;" + gender + ";;;" + address + ";;;" + phonenum + ";;;" + age + ";;;" + activedate + ";;;" + expireddate);
            //outmember.println(StoreMemInfo_arr);
            outmember.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }

    }

// MEMBER TXT
// (id+";;;"+password+";;;"+name+";;;"+ic+";;;"+matricno+";;;"+gender+";;;"+address+";;;"+phonenum+";;;"+age+";;;"+activedate+";;;"+expireddate)   
    public static void ClearMemAL() {
        ID.clear();
        PASSWORD.clear();
        NAME.clear();
        IC.clear();
        MATRICNO.clear();
        GENDER.clear();
        ADDRESS.clear();
        PHONENUM.clear();
        AGE.clear();
        ACTIVEDATE.clear();
        EXPIREDDATE.clear();
        MEMINFO.clear();
    }

    public static void ConvertandUpdateM() {

//Convert ArrayList into Array
//Array name
        String[] IDarr = new String[ID.size()];
        String[] PASSarr = new String[PASSWORD.size()];
        String[] NAMEarr = new String[NAME.size()];
        String[] ICarr = new String[IC.size()];
        String[] MATRICarr = new String[MATRICNO.size()];
        String[] GENDERarr = new String[GENDER.size()];
        String[] ADDarr = new String[ADDRESS.size()];
        String[] PHONEarr = new String[PHONENUM.size()];
        String[] AGEarr = new String[AGE.size()];
        String[] ADarr = new String[ACTIVEDATE.size()];
        String[] EDarr = new String[EXPIREDDATE.size()];
        ID.toArray(IDarr);
        PASSWORD.toArray(PASSarr);
        NAME.toArray(NAMEarr);
        IC.toArray(ICarr);
        MATRICNO.toArray(MATRICarr);
        GENDER.toArray(GENDERarr);
        ADDRESS.toArray(ADDarr);
        PHONENUM.toArray(PHONEarr);
        AGE.toArray(AGEarr);
        ACTIVEDATE.toArray(ADarr);
        EXPIREDDATE.toArray(EDarr);

        try {
            PrintWriter outmember = new PrintWriter(new FileOutputStream("member.txt"));
            for (int j = 0; j < IDarr.length; j++) {
                outmember.println(IDarr[j] + ";;;" + PASSarr[j] + ";;;" + NAMEarr[j] + ";;;" + ICarr[j] + ";;;" + MATRICarr[j] + ";;;" + GENDERarr[j] + ";;;" + ADDarr[j] + ";;;" + PHONEarr[j] + ";;;" + AGEarr[j] + ";;;" + ADarr[j] + ";;;" + EDarr[j]);
            }
            outmember.close();
        } catch (IOException e) {
            System.out.println("File Output Problem");
        }
    }

    public static ArrayList<String> getID() {
        return ID;
    }

    public static ArrayList<String> getPASSWORD() {
        return PASSWORD;
    }

    public static ArrayList<String> getADDRESS() {
        return ADDRESS;
    }

    public static ArrayList<String> getNAME() {
        return NAME;
    }

    public static ArrayList<String> getPHONENUM() {
        return PHONENUM;
    }

    public static ArrayList<String> getEXDATE() {
        return EXPIREDDATE;
    }

    public static ArrayList<String> getACDATE() {
        return ACTIVEDATE;
    }

    public static ArrayList<String> getAGE() {
        return AGE;
    }

    public static ArrayList<String> getIC() {
        return IC;
    }

    public static ArrayList<String> getMEMINFO() {
        return MEMINFO;
    }


}
