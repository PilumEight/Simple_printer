package com.company.Docs;

import com.company.Document;

import java.util.concurrent.atomic.AtomicInteger;

public class A3 extends Document {

    public A3() {
        this.time_toprint = 30;
        this.paper_size = 3;
        this.paper_type = "A3";
    }

    @Override
    public String toString() {
        return "A3{" +
                "time_toprint=" + time_toprint +
                ", paper_size=" + paper_size +
                ", paper_type='" + paper_type + '\'' +
                '}';
    }

/*
    Сортированный массив с парами эл
    [1,1,2,2,3,3,4,4,5,5,6,6,]

     */
}
