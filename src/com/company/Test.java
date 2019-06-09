package com.company;

import com.company.Docs.A3;
import com.company.Docs.A4;
import com.company.Docs.A5;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class Test {



    public static void main(String[] args) {
        A4 list2 = new A4();
        List<Document> hello = Arrays.asList(
                new A3(),
                new A4(),
                new A3(),
                new A3(),
                new A3(),
                new A3(),
                new A4(),
                new A5()

        );


        Printer printer = new Printer();

        hello.forEach(printer::addToPrint);

        printer.addToPrint(list2);
        //printer.addToPrint(lad);
      //  printer.testPrint();
        printer.start();
        printer.addToPrint(new A4());
        System.out.println("hello");
        try {
            Thread.sleep(8000);
            printer.printSort(2);
            System.out.println("tiiiiime");
            printer.addToPrint(new A5());


        } catch (InterruptedException e) {

            e.printStackTrace();
        }
        //printer.testStop();
        printer.printSort(2);

        //printer.run();

        /*
        printer.start();
        System.out.println("Main_hello");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


         */

       // printer.testStop();
    }
}
