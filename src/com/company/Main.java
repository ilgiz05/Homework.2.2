package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println(refrigerator(5, 10));
        System.out.println(refrigerator(6, 15));
        System.out.println(refrigerator(12, 6));
        System.out.println(refrigerator(7, 2));
        System.out.println(refrigerator(9, 18));

    }

    public static String refrigerator(int yearsman, int temperature) {
        if (yearsman > 20 && yearsman < 45 && temperature > -20 && temperature < 30){
            return "Можно идти гулять";
        }else if (yearsman < 20 && temperature >0 && temperature <= 28){
            return "Можно идти гулять";
        }else if (yearsman > 45 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Остовайтесь дома";
        }


    }


}
