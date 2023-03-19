package org.example;

import java.util.Iterator;

public class Iter implements Iterator {
    Randoms rand;
    public Iter(Randoms rand) {
        this.rand = rand;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return rand.getRandomInt();
    }
}
