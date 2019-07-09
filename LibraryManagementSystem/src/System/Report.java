/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author yan
 */
public class Report {

    private static Scanner kb = new Scanner(System.in);
    private String Datereport = new SimpleDateFormat("dd/MM/yyyy").format(Calendar.getInstance().getTime());
    private String timereport = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());
    private static int countmem = 0, countlib = 0, countbooks = 0, countborrow = 0;
    private static String LibID;

    public Report() {
        System.out.println("Date : " + Datereport + "\t\t\t  Time : " + timereport);
        System.out.println("");
    }

    public static void GeneralReport() {
        countmem();
        System.out.println("The total number of members : " + countmem);
        countlib();
        System.out.println("The total number of librarian : " + countlib);
        countbooks();
        System.out.println("The total number of books : " + countbooks);
        System.out.println("The total numbber of books borrowed : " + countborrow);

    }

    public static void countmem() {
        try {
            Scanner inmem = new Scanner(new FileInputStream("member.txt"));
            while (inmem.hasNextLine()) {
                String k = inmem.nextLine();
                countmem++;
            }
            inmem.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
    }

        public static void Listmem() {
//           System.out.println("ID \t\t | Name \t\t | IC\t\t | Matric no.\t\t | Gender \t\t | Address\t\t | Phone No.\t\t | AGE\t\t |ActiveDate\t\t | ExpiredDate\t\t |");
            try {
            Scanner inmem = new Scanner(new FileInputStream("member.txt"));
            while (inmem.hasNextLine()) {
                String k = inmem.nextLine();
                String[] display = k.split(";;;");
                System.out.println(display[0]+" \t\t|"+display[2]+" \t\t|"+display[3]+" \t\t|"+display[4]+" \t\t|"+display[5]+" \t\t|"+display[6]+" \t\t|"+display[7]+" \t\t|"+display[8]+" \t\t|"+display[9]);
            }
            inmem.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
    }
    public static void countlib() {
        try {
            Scanner inlib = new Scanner(new FileInputStream("librarian.txt"));
            while (inlib.hasNextLine()) {
                String k = inlib.nextLine();
                countlib++;
            }
            inlib.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }

    }
        public static void Listlib() {
//            System.out.println("ID\t\t| NAME \t\t| IC \t\t| Gender\t\t\| POSITION \t\t| ADDRESS \t\t| PHONE NO. \t\t| STARTING SERVICE DATE");
            try {
            Scanner inlib = new Scanner(new FileInputStream("librarian.txt"));
            while (inlib.hasNextLine()) {
                String k = inlib.nextLine();
                String[] display = k.split(";;;");
                System.out.println(display[0]+"\t\t|"+display[2]+"\t\t\t\t|"+display[3]+"\t\t\t|"+display[4]+"\t\t|"+display[5]+"\t\t\t\t|"+display[6]+"\t\t\t|"+display[7]);
            }
            inlib.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }}

    public static void countbooks() {
        countbooks = 0;
        try {
            Scanner inbooks = new Scanner(new FileInputStream("000.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }

        try {
            Scanner inbooks = new Scanner(new FileInputStream("100.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("200.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("300.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("400.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("500.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("600.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("700.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("800.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("900.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                countbooks++;
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
    }

    public static void DutyReport() {
        String name = "-";
        System.out.println("Key in the ID of the librarian ");
        LibID = kb.nextLine();
        try {
            Scanner inlibclk = new Scanner(new FileInputStream("clockInOut.txt"));
            Scanner inmem = new Scanner(new FileInputStream("librarian.txt"));
            while (inmem.hasNextLine()) {
                String b = inmem.nextLine();
                String[] arr = b.split(";;;");
                if (LibID.equals(arr[0])) {
                    name = arr[2];
                    System.out.println("\nName : " + name + "\n");
                    System.out.println("ClockIn\t\tClockOut\t\tDate");
                    break;
                }
            }
            while (inlibclk.hasNextLine()) {
                String a = inlibclk.nextLine();
                String[] box = a.split(";;;");
                if (LibID.equals(box[0])) {
                    System.out.println(box[1] + "\t\t" + box[2] + "\t\t" + box[3]);
                }
            }
        } catch (IOException e) {
            System.out.println("File Input Problem");
        }

    }

    public static void Listbooks() {
//        System.out.println("BookName \t\t| BookID \t\t| Author \t\t| Classification code \t\t| Book ISBN \t\t| Book Avalibility");
        try {
            Scanner inbooks = new Scanner(new FileInputStream("000.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
             System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }

        try {
            Scanner inbooks = new Scanner(new FileInputStream("100.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
          System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("200.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
               System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("300.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
               System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("400.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
                System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("500.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
                 System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("600.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
           System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("700.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
                System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("800.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
          System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
        try {
            Scanner inbooks = new Scanner(new FileInputStream("900.txt"));
            while (inbooks.hasNextLine()) {
                String k = inbooks.nextLine();
                String[] displaybk = k.split(";;;");
              System.out.println(displaybk[0] + "\t\t\t\t|" + displaybk[1] + "\t\t\t\t|" + displaybk[2] + "\t\t\t\t|" + displaybk[3] +"\t\t\t\t|"+displaybk[4] + "\t\t\t\t|" + displaybk[5]);
            }
            inbooks.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
    }

    public static void countBorrow() {
        try {
            Scanner inborrow = new Scanner(new FileInputStream("borrow.txt"));
            while (inborrow.hasNextLine()) {
                String k = inborrow.nextLine();
                countborrow++;
            }
            inborrow.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
    }

    public static void ListBorrow() {
        try {
            Scanner inborrow = new Scanner(new FileInputStream("borrow.txt"));
            while (inborrow.hasNextLine()) {
                String k = inborrow.nextLine();
                String[] display = k.split(";;;");
//                System.out.println("MEMBER's ID \t\t | BOOK ID \t\t | DATE");
System.out.println(display[0]+"\t\t|"+display[1]+"\t\t|"+display[2]);
            }
            inborrow.close();
        } catch (IOException e) {
            System.out.println("Problem of file input");
        }
    }
}
