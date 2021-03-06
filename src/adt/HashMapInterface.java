/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author KELVIN
 */
public interface HashMapInterface<K,V> 
{    
     public V add(K key, V value); //Insert object
     public V search(K key);//Search object
     public V remove(K deleteKey); //Delete object   
     public void displayAll(); //Display all values
     public void display();

}
