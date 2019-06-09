package com.company;

public abstract class Document {
 public    int time_toprint;
 public    int paper_size;
 public    String paper_type;



    @Override
    public String toString() {
        return "Document{" +
                "time_toprint=" + this.time_toprint +
                ", paper_size=" + paper_size +
                ", paper_type='" + paper_type + '\'' +
                '}';
    }
}
