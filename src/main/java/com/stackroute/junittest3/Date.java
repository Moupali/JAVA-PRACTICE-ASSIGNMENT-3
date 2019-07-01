package com.stackroute.junittest3;

import java.util.*;
import java.time.*;
import java.text.*;

public class Date {

    public static void main(String []args){

        Calendar c = Calendar.getInstance();
        System.out.println(c);


        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        System.out.println(Calendar.DAY_OF_WEEK+"  "+Calendar.MONDAY);

        System.out.println();

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        System.out.println(c.getTime());

        System.out.println(df.format(c.getTime()));

        for (int i = 0; i <6; i++) {
            c.add(Calendar.DATE, 1);
        }
        System.out.println(df.format(c.getTime()));
        System.out.println();
    }
}
