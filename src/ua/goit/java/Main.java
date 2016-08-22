package ua.goit.java;

import ua.goit.java.flower.*;
import ua.goit.java.service.EncriptDecript;

public class Main {
    public static void main(String[] args) {
        Bouquet mixedBouquet = new Bouquet("Букет с разными цветами", new AstraFlower("Астра", "оранжевая"));
        mixedBouquet.addFlower(new DaisyFlower("Ромашка", "белая"));
        mixedBouquet.addFlower(new RoseFlower("Роза", "красная"));
        mixedBouquet.addFlower(new TulipFlower("Тюльпан", "желтый"));
        mixedBouquet.addFlower(new TulipFlower("Тюльпан", "розовый"));

        System.out.println(mixedBouquet.getName() + "\n" + mixedBouquet.getBouquet().toString());

        EncriptDecript encriptDecript = new EncriptDecript();
        int offset = 7;

        String encriptTextList = null;
        try {
            encriptTextList = encriptDecript.encrypt(mixedBouquet.getBouquet().toString(), offset);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nЗашифрованный букет\n" + encriptTextList);

        String decriptTextList = null;
        try {
            decriptTextList = encriptDecript.decrypt(encriptTextList, offset);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nРасшифрованный букет\n" + decriptTextList);
    }
}
