/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package System;
import java.util.Scanner;

/**
 *
 * @author yan
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner kbinsert = new Scanner(System.in);
        int insert;
        ALL:{
        do{
        System.out.println("Welcome to Library System :) ");
        System.out.println("Please type your identity respectively");
        System.out.println("1)Head librarian");
        System.out.println("2)Librarian");
        System.out.println("3)Member");
        System.out.println("4)EXIT");
        insert=kbinsert.nextInt();
        switch(insert){
            case 1:
                HLibrarian a = new HLibrarian();
                break;
            case 2:
                Librarian b = new Librarian();
                break;
            case 3:
                Member c = new Member();
                break;
            case 4:
                break ALL;
            default:
                break ALL;
        }
    }while(insert<=4);
        } }}
