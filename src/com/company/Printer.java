package com.company;

import com.company.Docs.A5;

import javax.sound.midi.Soundbank;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.concurrent.ArrayBlockingQueue;

public class Printer extends Thread {

    private ArrayDeque<Document> queue = new ArrayDeque<Document>();
    List<Document> printend = new ArrayList<>();


    @Override
    public void run() {

        while ((!this.isInterrupted()) && (!queue.isEmpty())){
            //System.out.println(document);
            try {
                Document document;
                document = queue.getFirst();
                System.out.println("In: " + document);
                Printer.sleep((long) document.time_toprint * 100);
                printend.add(queue.pollFirst());
                System.out.println("Out: " + document);


            } catch (InterruptedException e) {
                System.out.println(queue);
                this.interrupt();
            }

        }
    }



    public void stopPrint(){

        this.interrupt();
    }


    //Начало печати
    public void testPrint() {
        this.start();
    }


    //Добавление на печать
    public void addToPrint(Document e){

        queue.addLast(e);
    }


    // Отмена печати документа
    public void cancelThis(Document d){
        queue.remove(d);
    }


    /**
     * Сортировка на ваш выбор!
     * @param numb
     *  1 = время печати бумаги
     *  2 = размер бумаги
     *  3 = тип бумаги
     */
    public void printSort (int numb){
        printend.sort(new Comporator(numb));
        System.out.println(printend);

    }


    //Средняя продолжительность печати напечатанных документов
    public void avPrint(){
        int numb = printend.size();
        float time = 0;
        for (Document el: printend) time += el.time_toprint;

        System.out.println("Average time to Print for printend : " + time / numb);
    }
}
