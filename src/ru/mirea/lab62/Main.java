package ru.mirea.lab62;

public class Main {
    public static void main(String args[])
    {
        float converted = new Converter().convert(-40);
        System.out.println(String.format("%.2f C",converted));
    }
}
