package com.company.Docs;

import com.company.Document;

public class A4 extends Document {

    public A4() {
        this.time_toprint = 40;
        this.paper_size = 4;
        this.paper_type = "A4";
    }

    @Override
    public String toString() {
        return "A4{" +
                "time_toprint=" + time_toprint +
                ", paper_size=" + paper_size +
                ", paper_type='" + paper_type + '\'' +
                '}';
    }
}
