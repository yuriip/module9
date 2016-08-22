package ua.goit.java.flower;

import java.util.ArrayList;
import java.util.List;

public abstract class Bush<T> {
    private String name;
    private T flower;
    private int numFlowers;
    protected List<T> bush;

    public Bush(String name) {
        this.name = name;
        bush = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getFlower(int index) {
        flower = bush.get(index);
        return flower;
    }

    public int getNumFlowers() {
        numFlowers = bush.size();
        return numFlowers;
    }

    public void addFlower(T flower) {
        bush.add(flower);
    }

    public void grow() {
        System.out.println("Куст растет");
    }

    public abstract void formed();
}
