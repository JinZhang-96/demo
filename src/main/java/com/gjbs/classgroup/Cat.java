package com.gjbs.classgroup;

import java.io.Serializable;

public class Cat extends Man implements Animal, Soft, Serializable {

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private int i;


    @Override
    public void call() {

    }

    @Override
    public void run() {

    }
}
