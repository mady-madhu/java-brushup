package org.example.inheritance;

public abstract class SampleAbstarct {

    int x;
    public SampleAbstarct(int i){
        this.x = getX(i);
    }

    public int getX(int i) {
        return i;
    }
}
