package com.bridgelabz;

public class HotelProgram
{

    public String minCostHotel(String input) {
        String[] arr = input.split(",");
        String customerType = "";
        if (arr.length > 0) {
            String tempArr[] = arr[0].split(":");
            customerType = tempArr[0];
            arr[0] = tempArr[1];
        }
        String hotel = minCostHotel(customerType);
        return hotel;
    }

        public static void main (String[]args)
        {

            HotelProgram hotel = new HotelProgram();
            String input1 ="10Sep2020, 20Sep2020";
            String hotel1 = hotel.minCostHotel(input1);
            System.out.println(hotel1);
        }

    }
