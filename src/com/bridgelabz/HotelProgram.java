package com.bridgelabz;
import java.util.Scanner;
public class HotelProgram {

        public static void main (String[]args)
        {
             Scanner sc = new Scanner(System.in);
            char ch = 0;


            String name, contact, gender;
            String name2 = null, contact2 = null;
            String gender2 = "";
            System.out.print("\nEnter customer name: ");
            name = sc.next();
            System.out.print("Enter contact number: ");
            contact = sc.next();
            System.out.print("Enter gender: ");
            gender = sc.next();
            if (ch < 3) {
                System.out.print("Enter second customer name: ");
                name2 = sc.next();
                System.out.print("Enter contact number: ");
                contact2 = sc.next();
                System.out.print("Enter gender: ");
                gender2 = sc.next();
            }
        }

    }
