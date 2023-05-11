package com.company;

public class HashTableDoubleHash {
    private Item[] table;
    private int count;
    private int size;
    private int maxDepth = 0;

    public HashTableDoubleHash(int size) {
        this.size = size;
        table = new Item[size];
    }

    public boolean isFull(){
        return (count == size);
    }

    public void insert(String key)
    {
        if (isFull())
            return;

        Item item = new Item(key);
        int hash = hash1(key);
        if(table[hash] != null)
        {
            int hash2 = hash2(key);
            int i = 1;
            while (true){
                int newHash = (hash + i * hash2) % size;
                System.out.println(key+" time: "+i);
                if(table[newHash] == null){
                    hash = newHash;
                    maxDepth = i;
                    break;
                }
                i++;
            }
        }

        table[hash] = item;
        count++;
    }

    private int hash1(String key)
    {
        int hash = 0;

        for(int i = 0; i < key.length(); i++)
            hash = (31 * hash + key.charAt(i)) % size;

        return hash;
    }

    private int hash2(String key)
    {
        int hash = 0;

        for(int i = 0; i < key.length(); i++)
            hash = (size-size/2)-(31 * hash + key.charAt(i)) % (size-size/2);

        return hash;
    }

    public Item find(String key)
    {
        int hash = hash1(key);
        if(!table[hash].getKey().equals(key))
        {
            int hash2 = hash2(key);
            int i = 1;
            while (i<maxDepth){
                int newHash = (hash + i * hash2) % size;
                System.out.println(key+" time: "+i);
                if(table[newHash].getKey().equals(key)){
                    return table[newHash];
                }
                i++;
            }
        }

        return null;
    }

    public void print()
    {
        for(int i = 0; i < size; i++)
            if(table[i] != null)
                System.out.println(i + " " + table[i].getKey());
    }
}