package ua.goit.java;

import ua.goit.java.flower.*;
import ua.goit.java.cryptography.EncriptDecript;

public class Main {
    public static void main(String[] args) {
        Flowers mixedFlowers = new Flowers();
        mixedFlowers.getBouquet().add(new DaisyFlower("Ромашка", "белая"));
        mixedFlowers.getBouquet().add(new RoseFlower("Роза", "красная"));
        mixedFlowers.getBouquet().add(new TulipFlower("Тюльпан", "желтый"));
        mixedFlowers.getBouquet().add(new TulipFlower("Тюльпан", "розовый"));

        System.out.println("Букет с разными цветами\n" + mixedFlowers.getBouquet().toString());

        EncriptDecript encriptDecript = new EncriptDecript();
        int offset = 7;

        String encryptedText = null;
        try {
            encryptedText = encriptDecript.encrypt(mixedFlowers.getBouquet().toString(), offset);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nЗашифрованный букет\n" + encryptedText);

        String decryptedText = null;
        try {
            decryptedText = encriptDecript.decrypt(encryptedText, offset);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\nРасшифрованный букет\n" + decryptedText);
    }
}
