package ua.goit.java.flower;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    private final static int MAX_NUM_FLOWERS = 5;

    private String name;
    private int numFlowers;
    private List<Flower> bouquet;

    public Bouquet(String name, Flower flower) {
        this.name = name;
        bouquet = new ArrayList<>(MAX_NUM_FLOWERS);
        bouquet.add(flower);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Flower getFlower(int index) {
        return bouquet.get(index);
    }

    public int getNumFlowers() {
        return bouquet.size();
    }

    public List<Flower> getBouquet() {
        return bouquet;
    }

    public void addFlower(Flower flower) {
        bouquet.add(flower);
    }

    public void listFlowers() {
        if (bouquet != null) {
            for (Flower f : bouquet) {
                System.out.println(f.getName() + " " + f.getColor());
            }
        }
    }
}
