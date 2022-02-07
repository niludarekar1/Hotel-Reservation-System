package com.bridgelabz;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

    public class DateMain {

        public static void main(String[] args) throws ParseException {
            Date date1=null;
            Scanner input = new Scanner(System.in);
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            System.out.println("Enter check-in date (gg/aa/yy):");
            String cinput = input.nextLine();
            if(null != cinput && cinput.trim().length() > 0){
                date1 = format.parse(cinput);
            }

            System.out.print(date1);
        }
    }

