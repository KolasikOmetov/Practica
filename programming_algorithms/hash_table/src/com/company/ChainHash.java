package com.company;

import java.util.ArrayList;

public class ChainHash {
    private ArrayList<Item>[] table;
    private int size;
    private int maxDepth = 0;
    private int count = 0;

    public ChainHash(int size) {
        this.size = size;
        table = new ArrayList[size];
        for (int i = 0; i < size; i++){
            table[i] = new ArrayList<Item>();
        }
    }

    public void insert(String key)
    {
        Item item = new Item(key);
        int hash = hash1(key);
        table[hash].add(item);
        count++;
    }

    private int hash1(String key)
    {
        int hash = 0;

        for(int i = 0; i < key.length(); i++)
            hash = (31 * hash + key.charAt(i)) % size;

        return hash;
    }

    public Item find(String key)
    {
        int hash = hash1(key);
        if(table[hash] == null)
            return null;

        for (int i = 0; i < table[hash].size(); i++)
            if(table[hash].get(i).getKey().equals(key))
                return table[hash].get(i);

        return null;
    }

    public void print()
    {
        System.out.println("#-----");
        for(int j = 0; j < size; j++) {
            if (table[j] != null) {
                for (int i = 0; i < table[j].size(); i++){
                    System.out.println(j + " " + i + ":" + table[j].get(i).getKey());
                }
            }
        }
        System.out.println("#-----");
    }
}