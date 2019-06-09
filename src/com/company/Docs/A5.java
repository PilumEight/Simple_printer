package com.company.Docs;

import com.company.Document;

public class A5 extends Document {


    public A5() {
        this.time_toprint = 50;
        this.paper_size = 5;
        this.paper_type = "A5";
    }

    @Override
    public String toString() {
        return "A5{" +
                "time_toprint=" + time_toprint +
                ", paper_size=" + paper_size +
                ", paper_type='" + paper_type + '\'' +
                '}';
    }
}
