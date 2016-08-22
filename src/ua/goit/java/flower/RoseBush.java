package ua.goit.java.flower;

import java.util.ArrayList;

public class RoseBush extends Bush {
    private final static int MAX_NUM_FLOWERS = 3;

    public RoseBush(String name) {
        super(name);
        bush = new ArrayList<RoseFlower>(MAX_NUM_FLOWERS);
    }

    @Override
    public void formed() {
        System.out.println("Розовый куст формируется с колючками");
    }
}
