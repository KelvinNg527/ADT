/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

import java.util.Arrays;

/**
 *
 * @author Ng Ka Fai
 * @param <K>
 * @param <V>
 */
public class Hashing<K, V> implements HashMapInterface<K, V> {

    private Entry<K, V>[] hashTable;
    private int locationsUsed;          
    private static final int DEFAULT_SIZE = 35;      
    private static final double LOAD_FACTOR = 0.9; //allow elements to put in before its size is increased

    public Hashing() {
        this(DEFAULT_SIZE);
    }

    public Hashing(int tableSize) {
        // ensure that table is prime size at least as big as user wants;
        // if tableSize is prime, do not change it
        int primeSize = setPrime(tableSize);

        hashTable = new Entry[primeSize];
        locationsUsed = 0;
    }

    //Functions to add user
    @Override
    public V add(K key, V value) {
        V data = null;
        if (isTableFull()) {
            resize();
        }

        int index = getIndex(key);
        index = quadraticFunction(index, key);
        if ((hashTable[index] == null) || hashTable[index].isEmpty()) { // key not found, so insert new entry
            hashTable[index] = new Entry<K, V>(key, value);
            locationsUsed++;
            data = null;
        }
        return data;
    }

    @Override
    public V search(K key) {
        V result = null;

        int index = getIndex(key);
        index = find(index, key);

        if (index != -1) {
            if (hashTable[index].getValue() != null) {
                result = hashTable[index].getValue();
            } else {
              result = null;
            }
        } else {
            result = null;
        }

        return result;
    }

    public V remove (K deleteKey) {

        int index = getIndex(deleteKey);
        V remove=(V) "Removed";
        
        index = quadraticFunction(index, deleteKey);
     if (hashTable[index].getValue() != null) {
        if ((hashTable[index] != null) || hashTable[index].isFull()) { // key found, so remove new entry                
           System.out.println(index);
            hashTable[index]=hashTable[index-1];
             locationsUsed--;
        }
      } else{
                System.out.println("Nothings ");
        }
        return remove;
    
    }
    @Override
    public void displayAll() {
        for (Entry<K, V> hashTable1 : hashTable) {
            if (hashTable1 == null) {
                System.out.print("");
            } else if (hashTable1.isEmpty()) {
                System.out.println("Nothings ");
            } else {
                System.out.println(hashTable1.getValue());
            }
        }
        System.out.println();
    }

    @Override
    public void display() {
        System.out.println(hashTable);
    }

    //Formula
    private int setPrime(int integer) { //Change an Interger to a prime number to reduce collision rate
        if (integer % 2 == 0) {
            integer++;
        }

        while (!isPrime(integer)) {
            integer += 2;
        }

        return integer;
    }

    private boolean isPrime(int integer){ //Whether it is a prime number
        boolean result = false;
        boolean done = false;

        if ((integer == 1) || (integer % 2 == 0)) {
            result = false;
        } else if ((integer == 2) || (integer == 3)) {
            result = true;
        } else {
            assert (integer % 2 != 0) && (integer >= 5);
            result = true;
            for (int divisor = 3; !done && (divisor * divisor <= integer); divisor += 2) {
                if (integer % divisor == 0) {
                    result = false;
                    done = true;
                }
            }
        }
        return result;
    }

    private boolean isTableFull(){ //Check whether is the table full
        return locationsUsed > LOAD_FACTOR * hashTable.length;
    }

    private void resize() {
        Entry<K, V>[] oldTable = hashTable;
        int oldSize = hashTable.length;
        int newSize = setPrime(oldSize * 2);
        hashTable = new Entry[newSize]; // increase size of array
        locationsUsed = 0;

        for (int index = 0; index < oldSize; index++) {
            if ((oldTable[index] != null) && oldTable[index].isFull()) {
                add(oldTable[index].getKey(), oldTable[index].getValue());
            }
        }
    }

    private int getIndex(K key) {
        int index;
        index = key.hashCode()% hashTable.length;

        if (index < 0) {
            index += hashTable.length;
        }       
        return index;
    }

    private int quadraticFunction(int index, K ASCII) {
        boolean found = false;
      
        int i = 0;
        while (!found && (hashTable[index] != null) && i < hashTable.length) {
            if (hashTable[index].isFull()) 
            {
                if (ASCII.equals(hashTable[index].getKey())) 
                {
                    found = true;
                } 
                else
                {
                    index = (index + i ^ i) % hashTable.length;
                    i++;
                }
            } 
        }
        return index;      
    }

    public int find(int index, K key) {
        boolean found = false;
        int i = 0;
        while (!found && (hashTable[index] != null) && i < hashTable.length) {
            if (hashTable[index].isFull() && key.equals(hashTable[index].getKey())) {
                found = true; 
            } else
            {
                index = (index + i ^ i) % hashTable.length;        
                i++;
            }
        }
        
        int result = -1;
        if (found) {
            result = index;
        }

        return result;
        
    }

    @Override
    public int hashCode() {
       // int hash = 7;
        //hash  
        return Arrays.deepHashCode(this.hashTable);
    
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        
        final Hashing<?, ?> other = (Hashing<?, ?>) obj;
        if (!Arrays.deepEquals(this.hashTable, other.hashTable)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {

        String str = "";
        for (Entry<K, V> hashTable1 : hashTable) {
            if (hashTable1 == null) {
                System.out.print("");
            } else if (hashTable1.isEmpty()) {
                System.out.println("Empty");
            } else {
                str += (hashTable1.getValue() + "\n");
            }
        }
        return str;
    }
}
