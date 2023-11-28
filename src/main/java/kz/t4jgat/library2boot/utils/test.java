package kz.t4jgat.library2boot.utils;

import java.util.Date;

public class test {
    public static void main(String[] args) throws InterruptedException {
        Date date1 = new Date(2023, 1, 1);
        Date date2 = new Date(2023, 1, 10);


        System.out.println((Math.abs(date2.getTime() - date1.getTime()))/ (1000 * 60 * 60 * 24));

    }
}
