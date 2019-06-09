package com.company;

import com.company.Docs.A3;
import com.company.Docs.A4;
import com.company.Docs.A5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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
        printer.testPrint();
        System.out.println("hello");
        try {
            Thread.sleep(6000);
            printer.join();
            printer.printSort(1);
            printer.printSort(2);
            printer.printSort(3);
            A5 list = new A5();
            printer.addToPrint(list);
            printer.cancelThis(list);
            printer.avPrint();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(12000);
            printer.stopPrint();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
