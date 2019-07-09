/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author yan
 */
/**
 *
 * @author JF Low
 */
public class SearchBook {

    private static int ops;
    private static String opsa;
    private static String info;
    private static final Scanner g1 = new Scanner(System.in);
    private static final Scanner g = new Scanner(System.in);

    public SearchBook() {

    }

//000 – General works, Computer science and Information
//100 – Philosophy and psychology
//200 – Religion
//300 – Social sciences
//400 – Language
//500 – Pure Science
//600 – Technology
//700 – Arts & recreation
//800 – Literature
//900 – History & geography
    public static void SearchCat() {
        System.out.println("Choose the category:");
        System.out.println("1)General works, Computer science and Information\n"
                + "2)Philosophy and psychology\n"
                + "3)Religion\n"
                + "4)Social sciences\n"
                + "5)Language\n"
                + "6)Pure Science\n"
                + "7)Technology\n"
                + "8)Arts & recreation\n"
                + "9)Literature\n"
                + "10)History & geography");
        System.out.println("Choose the category");
        ops = g1.nextInt();
        //bname+";;;"+bID+";;;"+auth+";;;"+ccode+";;;"+ISBN+";;;"+ava
        System.out.println("Processing...");
        switch (ops) {
            case 1:
                try (Scanner z = new Scanner(new FileInputStream("000.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 2:
                try (Scanner z = new Scanner(new FileInputStream("100.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 3:
                try (Scanner z = new Scanner(new FileInputStream("200.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 4:
                try {
                    Scanner z = new Scanner(new FileInputStream("300.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 5:
                try {
                    Scanner z = new Scanner(new FileInputStream("400.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 6:
                try {
                    Scanner z = new Scanner(new FileInputStream("500.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 7:
                try {
                    Scanner z = new Scanner(new FileInputStream("600.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 8:
                try {
                    Scanner z = new Scanner(new FileInputStream("700.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 9:
                try {
                    Scanner z = new Scanner(new FileInputStream("800.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 10:
                try {
                    Scanner z = new Scanner(new FileInputStream("900.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println(read[0] + "\t" + read[5]);

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            default:
                break;
        }
        System.out.println("Done");
    }

    public static void SearchWord() {
        System.out.println("Please enter your searching word : ");
        opsa = g.nextLine();
        try (Scanner z = new Scanner(new FileInputStream("000.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
        try (Scanner z = new Scanner(new FileInputStream("100.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
        try (Scanner z = new Scanner(new FileInputStream("200.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
        try (Scanner z = new Scanner(new FileInputStream("300.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
        try (Scanner z = new Scanner(new FileInputStream("400.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
        try (Scanner z = new Scanner(new FileInputStream("500.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
        try (Scanner z = new Scanner(new FileInputStream("600.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
        try (Scanner z = new Scanner(new FileInputStream("700.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }

        try (Scanner z = new Scanner(new FileInputStream("800.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
        try (Scanner z = new Scanner(new FileInputStream("900.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem");
        }
    }

    public static void SearchCatFULL() {
        System.out.println("Choose the category:");
        System.out.println("1)General works, Computer science and Information\n"
                + "2)Philosophy and psychology\n"
                + "3)Religion\n"
                + "4)Social sciences\n"
                + "5)Language\n"
                + "6)Pure Science\n"
                + "7)Technology\n"
                + "8)Arts & recreation\n"
                + "9)Literature\n"
                + "10)History & geography");
        System.out.println("Choose the category");
        ops = g1.nextInt();
        //bname+";;;"+bID+";;;"+auth+";;;"+ccode+";;;"+ISBN+";;;"+ava
        System.out.println("Processing...");
        switch (ops) {
            case 1:
                try (Scanner z = new Scanner(new FileInputStream("000.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");
                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 2:
                try (Scanner z = new Scanner(new FileInputStream("100.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");
                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 3:
                try (Scanner z = new Scanner(new FileInputStream("200.txt"))) {
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");
                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;

            case 4:
                try {
                    Scanner z = new Scanner(new FileInputStream("300.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");
                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 5:
                try {
                    Scanner z = new Scanner(new FileInputStream("400.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");
                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 6:
                try {
                    Scanner z = new Scanner(new FileInputStream("500.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");
                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 7:
                try {
                    Scanner z = new Scanner(new FileInputStream("600.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");
                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 8:
                try {
                    Scanner z = new Scanner(new FileInputStream("700.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 9:
                try {
                    Scanner z = new Scanner(new FileInputStream("800.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            case 10:
                try {
                    Scanner z = new Scanner(new FileInputStream("900.txt"));
                    while (z.hasNextLine()) {
                        info = z.nextLine();
                        String[] read = info.split(";;;");
                        System.out.println("BOOK NAME:" + read[0] + "\nBOOK ID:" + read[1] + "\nBOOK AUTHOR:" + read[2] + "\nCLASSIFICATION CODE:" + read[3] + "\nISBN:" + read[4] + "\nAVALABILITY:" + read[5]);
                        System.out.println("");
                        System.out.println("");

                    }
                    z.close();
                } catch (IOException e) {
                    System.out.println("InputProblem");
                }
                break;
            default:
                break;
        }
        System.out.println("Done");
    }

    public static void SearchWordFULL() {
        System.out.println("Please enter your searching word : ");
        opsa = g.nextLine();
        try (Scanner z = new Scanner(new FileInputStream("000.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem1");
        }
        try (Scanner z = new Scanner(new FileInputStream("100.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem2");
        }
        try (Scanner z = new Scanner(new FileInputStream("200.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem3");
        }
        try (Scanner z = new Scanner(new FileInputStream("300.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem4");
        }
        try (Scanner z = new Scanner(new FileInputStream("400.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem5");
        }
        try (Scanner z = new Scanner(new FileInputStream("500.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem6");
        }
        try (Scanner z = new Scanner(new FileInputStream("600.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem7");
        }
        try (Scanner z = new Scanner(new FileInputStream("700.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem8");
        }

        try (Scanner z = new Scanner(new FileInputStream("800.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem9");
        }
        try (Scanner z = new Scanner(new FileInputStream("900.txt"))) {
            while (z.hasNextLine()) {
                info = z.nextLine();
                String[] read = info.split(";;;");
                if (read[0].contains(opsa)) {
                    System.out.println(read[0] + "\t|" + read[1] + "\t|" + read[2] + "\t|" + read[3] + "\t|" + read[4] + "\t|" + read[5]);
                }
            }
            z.close();
        } catch (IOException e) {
            System.out.println("InputProblem10");
        }
    }
}
