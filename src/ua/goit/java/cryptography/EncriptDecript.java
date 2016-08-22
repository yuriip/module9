package ua.goit.java.cryptography;

public class EncriptDecript {
    public String encrypt(String text, int offset) throws IllegalArgumentException {
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Пустая строка. Введите не пустую строку");
        }

        StringBuilder res = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            res.append(encryptChar(text.charAt(i), offset));
        }

        return new String(res);
    }

    public String decrypt(String text, int offset) throws IllegalArgumentException {
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Пустая строка. Введите не пустую строку");
        }
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            res.append(decryptChar(text.charAt(i), offset));
        }

        return new String(res);
    }

    private char encryptChar(char c, int offset) {
        return c == Character.MAX_VALUE ? '\0' : (char) (c + offset);
    }

    private char decryptChar(char c, int offset) {
        return c == '\0' ? Character.MAX_VALUE : (char) (c - offset);
    }
}
