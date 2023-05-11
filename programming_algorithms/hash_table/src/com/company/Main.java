package com.company;

public class Main {

    public static void main(String[] args) {
        int[] a = {19, 27, 36, 10, 64, 40, 40};

        HashTableDoubleHash h = new HashTableDoubleHash(a.length);

        for (int value : a) {
            h.insert(value + "");
        }

        h.print();

        Item item = h.find("man");

        if(item != null)
            System.out.println("Элемент найден!");
        else
            System.out.println("Элемент не найден!");

        Item item2 = h.find("40");

        if(item2 != null)
            System.out.println("Элемент найден!");
        else
            System.out.println("Элемент не найден!");

//        String[] ss = new String[4];
//        ss[0] = "Правда";
//        ss[1] = "Не";
//        ss[2] = "Всегда";
//        ss[3] = "Приятна";
//
//        ChainHash h2 = new ChainHash(ss.length);
//
//        for (String s : ss) {
//            h2.insert(s);
//        }
//
//        h2.print();
//        if(h2.find("Правда") != null)
//            System.out.println("Элемент найден!");
//        else
//            System.out.println("Элемент не найден!");
    }
}
